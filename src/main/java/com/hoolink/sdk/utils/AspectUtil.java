package com.hoolink.sdk.utils;

import com.hoolink.sdk.bo.base.CurrentUserBO;
import io.swagger.annotations.ApiOperation;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.reflect.AdviceSignature;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.Part;
import java.lang.reflect.Method;

/**
 * @author XuBaofeng.
 * @date 2019-04-25 14:27.
 * <p>
 * description:
 */
public class AspectUtil {
    /**
     * 获取方法签名
     *
     * @param joinPoint
     * @return
     */
    public static final Method getMethodSignature(JoinPoint joinPoint) {
        if (joinPoint == null) {
            return null;
        }
        Signature signature = joinPoint.getSignature();
        if (signature instanceof MethodSignature) {
            return ((MethodSignature) signature).getMethod();
        } else if (signature instanceof AdviceSignature) {
            return ((AdviceSignature) signature).getAdvice();
        } else {
            return null;
        }
    }

    /**
     * 检查该请接口是否是作为上传文件接口, 当为上传文件的接口时, 则返回TRUE
     * Todo 当前已过滤类型: 当有新的不能进行序列化的类型作为参数时, 应当在下方进行补充
     * * MultipartFile
     * * Part
     *
     * @param joinPoint
     * @return
     */
    public static final Boolean checkUploadFile(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        if (ArrayUtil.isNotEmpty(args)) {
            for (Object arg : args) {
                if (arg instanceof MultipartFile) {
                    return Boolean.TRUE;
                } else if (arg instanceof Part) {
                    return Boolean.TRUE;
                }
            }
        }
        return Boolean.FALSE;
    }

    /**
     * 获取ApiOperation的value
     *
     * @param method
     * @return
     */
    public static final String getMethodOperation(Method method) {
        if (method == null) {
            return null;
        }
        ApiOperation annotation = method.getAnnotation(ApiOperation.class);
        if (annotation != null) {
            return annotation.value();
        }
        return null;
    }

    /**
     * 获取当前用户账号
     *
     * @return
     */
    public static final String getAccount() {
        CurrentUserBO userBO = ContextUtil.getCurrentUser();
        return userBO != null ? userBO.getAccount() : "admin";
    }
}
