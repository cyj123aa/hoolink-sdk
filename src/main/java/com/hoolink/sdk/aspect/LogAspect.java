package com.hoolink.sdk.aspect;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.hoolink.sdk.annotation.LogAndParam;
import com.hoolink.sdk.bo.BackBO;
import com.hoolink.sdk.constants.CommonConstants;
import com.hoolink.sdk.enums.CheckEnum;
import com.hoolink.sdk.exception.BusinessException;
import com.hoolink.sdk.exception.HoolinkExceptionMassageEnum;
import com.hoolink.sdk.param.BaseParam;
import com.hoolink.sdk.utils.*;
import com.hoolink.sdk.vo.BackVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolationException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.List;

/**
 * 用切面方式管理日志输出
 *
 * @author zhuli
 */
@Slf4j
@Aspect
@Component
public class LogAspect {

    /**
     * 定义拦截规则：拦截有@PostMapping注解的方法。
     * 拦截@Pointcut("execution(* com.hoolink.device.build.controller..*(..))") 包下所有类
     * 拦截@Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping) || " +
     * *            "@annotation(org.springframework.web.bind.annotation.GetMapping) || " +
     * *            "@annotation(org.springframework.web.bind.annotation.PostMapping) || " +
     * *            "@annotation(org.springframework.web.bind.annotation.PutMapping) || " +
     * *            "@annotation(org.springframework.web.bind.annotation.PatchMapping) || " +
     * *            "@annotation(org.springframework.web.bind.annotation.DeleteMapping) ||" +
     * *            "@annotation(org.springframework.scheduling.annotation.Scheduled)")
     *
     * <p> 将扫描所有的*Mapping改为包路径扫描, 因为*Mapping扫描会扫到spring自身的方法
     * <p>
     * * execution(* com.hoolink..*..controller..*(..))     扫描微服务调用接口
     * * execution(* com.hoolink..*..webapp..*(..))         扫描所有Web端接口
     * * execution(* com.hoolink..*..mobile..*(..))         扫描所有App端接口
     */
    @Pointcut("@annotation(com.hoolink.sdk.annotation.LogAndParam)")
    public void controllerMethodPointcut() {
    }

    /**
     * 给controller中的param参数添加txId
     * 由于该类会描到所有的controller, 而我们的controller分为web调用controller和服务间调用controller两种
     * 所以在使用时需要注意两个问题:
     * 1. 提供接口给web端调用的所有controller必须加上BaseParam参数, 当不需要web传参过来时, 也应当加上BaseParam作为入参,
     * * 否则无法创建txId, 当请求从web过来的时候, BaseParam中的txId必然为null, 所以会创建txId放入到param中
     * 2. 在服务间进行相互调用时, 例如A服务调用B服务时, 如果没有带上txId, 那么B服务的controller被扫描到时发现txId为null,
     * * 则会创建出一个新的txId放入到BaseParam中, 那么此时的txId就已经失去意义, 所以在服务间相互调用时必须将txId带上进行传递传递
     *
     * @param joinPoint
     * @return
     * @throws Throwable
     */
    @Around("controllerMethodPointcut()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] args = null;
        // ===== 获取函数签名信息
        Method method = AspectUtil.getMethodSignature(joinPoint);
        try {
            if (joinPoint.getArgs() != null && joinPoint.getArgs().length > 0) {
                args = joinPoint.getArgs();
            } else {
                return joinPoint.proceed();
            }
            // ----- 获取方法的返回值类型
            if (AspectUtil.checkUploadFile(joinPoint)) {
                // ===== 检查是否是上传文件的接口, 如果是上传文件, 则不做以下操作
                return joinPoint.proceed(joinPoint.getArgs());
            }
            if (!ArrayUtil.isEmpty(args)) {
                for (Object obj : args) {
                    if (obj instanceof BaseParam) {
                        // ===== 根据check属性值校验参数
                        checkParam((BaseParam) obj, method);
                        break;
                    }
                }
            }
            // ===== 当传参的方式不是使用BaseParam传参时, 直接放行
            return joinPoint.proceed(args);
        } catch (Exception e) {
            // ===== 日志输出之后组装返回值
            String message = e.getMessage();
            if (!(e instanceof BusinessException) && !(e instanceof ConstraintViolationException)) {
                // ----- 当controller捕获到的异常是BusinessException异常
                // ----- 当controller捕获的异常是由于参数校验不通过引起的ConstraintViolationException时, 不做任何处理, 只接将message返回
                // ----- 当controller捕获到的异常不是自定义的异常
                message = assembleCodeAndMsg(method);
            }
            // ----- 根据(codeAndMsg + txId + returnType)组装BackBO或BackVO返回
            Class<?> returnType = method.getReturnType();
            Object object = assembleBackObject(message, returnType);
            String param;
            // ===== 处理方法入参的输出
            if (AspectUtil.checkUploadFile(joinPoint)) {
                // ----- 当该接口为上传文件的功能时, 不输出该接口的入参, 避免出现序列化异常
                param = "As a function of uploading files, the interface does not input and output parameters to avoid serialization anomalies.";
            } else {
                param = JSONObject.toJSONString(args, SerializerFeature.WriteMapNullValue);
            }
            if (object == null) {
                // ----- 当object为null时, 说明returnType即不是VO又不是BO, 日志输出异常
                message = "The value of the interface return value is incorrect.";
            }
            // ===== 输出异常信息
            log.error("Exception : [txId]: {}, {}: {}, {}: {}, {}: {}, {}: {}", ContextUtil.getTxid(), CommonConstants.LOG_ACCOUNT, AspectUtil.getAccount(),
                    CommonConstants.LOG_METHOD, method, CommonConstants.LOG_PARAM, param, CommonConstants.LOG_ERROR, message, e);
            return object;
        }
    }

    /**
     * 输出所有controller方法的入参
     *
     * @param joinPoint
     */
    @Before("controllerMethodPointcut()")
    public void doBefore(JoinPoint joinPoint) throws Exception {
        // ===== 获取方法签名
        Method method = AspectUtil.getMethodSignature(joinPoint);
        String param;
        if (AspectUtil.checkUploadFile(joinPoint)) {
            // ===== 当该接口为上传文件的功能时, 不输出该接口的入参, 避免出现序列化异常
            param = "As a function of uploading files, the interface does not input and output parameters to avoid serialization anomalies.";
        } else {
            param = JSONObject.toJSONString(joinPoint.getArgs(), SerializerFeature.WriteMapNullValue);
        }
        // ===== 获取ApiOperation的value
        String operation = AspectUtil.getMethodOperation(method);
        log.info("Request   : [txId]: {}, {}: {}, {}: {}, {}: {}, {}: {}",ContextUtil.getTxid(), CommonConstants.LOG_ACCOUNT, AspectUtil.getAccount(),
                CommonConstants.LOG_METHOD, method, CommonConstants.LOG_PARAM, param, CommonConstants.LOG_CONTENT, operation);
    }

    /**
     * 输出所有controller方法的出参
     *
     * @param joinPoint
     * @param object
     */
    @AfterReturning(returning = "object", pointcut = "controllerMethodPointcut()")
    public void doAfterReturning(JoinPoint joinPoint, Object object) {
        if (object == null) {
            return;
        }
        // ===== 处理txId
        String txId = ContextUtil.getTxid();
        // ===== 获取方法签名
        Method method = AspectUtil.getMethodSignature(joinPoint);
        // ===== 获取ApiOperation的value
        String operation = AspectUtil.getMethodOperation(method);
        // ===== 获取返回值
        String response;
        try {
            // ===== 当返回值类型能够被序列化输出时
            response = JSONObject.toJSONString(object, SerializerFeature.WriteMapNullValue);
        } catch (Exception e) {
            // ===== 当返回值类型不能被序列化输出时
            response = "The return value of this interface cannot be serialized. It is: " + object.getClass().getName();
        }
        // ===== 当flag为true时输出info日志
        log.info("Response  : [txId]: {}, {}: {}, {}: {}, {}: {}, {}: {}", txId, CommonConstants.LOG_ACCOUNT, AspectUtil.getAccount(),
                CommonConstants.LOG_METHOD, method, CommonConstants.LOG_RETURN, response, CommonConstants.LOG_CONTENT, operation);
    }

    /**
     * 异常时输出txId
     *
     * @param joinPoint
     * @param e
     */
    @AfterThrowing(pointcut = "controllerMethodPointcut()", throwing = "e")
    public void doAfterThrowing(JoinPoint joinPoint, Throwable e) {
        // ===== 整理数据, 输出日志
        String param;
        if (AspectUtil.checkUploadFile(joinPoint)) {
            // ===== 当该接口为上传文件的功能时, 不输出该接口的入参, 避免出现序列化异常
            param = "As a function of uploading files, the interface does not input and output parameters to avoid serialization anomalies.";
        } else {
            param = JSONObject.toJSONString(joinPoint.getArgs(), SerializerFeature.WriteMapNullValue);
        }
        // ----- 获取方法签名
        Method method = AspectUtil.getMethodSignature(joinPoint);
        log.error("Exception : [txId]: {}, {}: {}, {}: {}, {}: {}, {}: {}", ContextUtil.getTxid(), CommonConstants.LOG_ACCOUNT,
                AspectUtil.getAccount(), CommonConstants.LOG_METHOD, method, CommonConstants.LOG_PARAM, param, CommonConstants.LOG_ERROR, e.getMessage(), e);
    }

    /**
     * 根据(codeAndMsg + txId + returnType)组装BackBO或BackVO返回
     *
     * @param message
     * @param resultClass
     * @param <T>
     * @return
     */
    private <T> Object assembleBackObject(String message, Class<T> resultClass) {
        // ===== 组装VO或者BO
        if (resultClass.equals(BackBO.class)) {
            // ----- 组装BO返回
            return BackBOUtil.operateError(message);
        } else if (resultClass.equals(BackVO.class)) {
            // ----- 组装vo返回
            return BackVOUtil.operateError(message);
        } else if (resultClass.equals(ResponseEntity.class)) {
            // ----- 组装ResponseEntity返回
            String headerValue;
            try {
                headerValue = URLEncoder.encode("下载失败!", "UTF-8");
            } catch (Exception e) {
                headerValue = "File download failed!";
            }
            return ResponseEntity.ok().header(HttpHeaders.CONTENT_TYPE, MediaType.TEXT_PLAIN_VALUE)
                    .header(HttpHeaders.ACCESS_CONTROL_EXPOSE_HEADERS, "Error-Message")
                    .header("Error-Message", headerValue).body(new ByteArrayResource("".getBytes(), null));
        } else {
            // ----- 当controller的返回值即不为backVO又不为backBO时, 根据返回值类型返回对应的实例对象, 但该实例对象所有的属性值都为 NULL
            try {
                return resultClass.newInstance();
            } catch (Exception e) {
                return null;
            }
        }
    }

    /**
     * 根据 @HoolinkException 注解获取CodeAndMsg
     *
     * @param method
     * @return
     */
    private String assembleCodeAndMsg(Method method) {
        // ===== 解析方法的注解
        LogAndParam logAndParam = method.getAnnotation(LogAndParam.class);
        if (logAndParam != null) {
            return logAndParam.value();
        }
        return null;
    }

    /**
     * 根据CheckEnum的校验规则校验参数
     *
     * @param param
     * @param method
     * @throws Exception
     */
    private void checkParam(BaseParam param, Method method) throws Exception {
        if (param == null) {
            return;
        }
        Object data = param.getData();
        LogAndParam annotation = method.getAnnotation(LogAndParam.class);
        if (annotation != null) {
            CheckEnum checkEnum = annotation.check();
            switch (checkEnum) {
                case DONT_CHECK:
                    break;
                case STRING_NOT_BLANK:
                    if (StringUtils.isBlank((String) data)) {
                        throwParamErrorException();
                    }
                    break;
                case LONG_GREATER_THAN_ZERO:
                    Long aLong = (Long) data;
                    if (aLong == null || aLong < 0) {
                        throwParamErrorException();
                    }
                    break;
                case LIST_NOT_EMPTY:
                    if (CollectionUtils.isEmpty((List) data)) {
                        throwParamErrorException();
                    }
                    break;
                case DATA_NOT_NULL:
                default:
                    if (data == null) {
                        throwParamErrorException();
                    }
                    break;
            }
        }
    }

    /**
     * 抛出参数错误异常
     *
     * @throws Exception
     */
    private void throwParamErrorException() throws Exception {
        throw new BusinessException(HoolinkExceptionMassageEnum.PARAM_ERROR);
    }

}