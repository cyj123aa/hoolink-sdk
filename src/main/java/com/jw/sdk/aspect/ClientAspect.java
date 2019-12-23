package com.jw.sdk.aspect;

import com.jw.sdk.annotation.ClientException;
import com.jw.sdk.bo.BackBO;
import com.jw.sdk.exception.BusinessException;
import com.jw.sdk.utils.AspectUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 *  @author chenyuejun.
 * @date 2019-04-25 14:24.
 * <p>
 * description:
 */
@Slf4j
@Aspect
@Component
public class ClientAspect {

    @Pointcut("@annotation(com.jw.sdk.annotation.ClientException)")
    public void clientMethodPointcut() {
    }

    @AfterReturning(returning = "object", pointcut = "clientMethodPointcut()")
    public void doAfterReturning(JoinPoint joinPoint, Object object) throws Exception {
        if (object == null) {
            return;
        }
        // ===== 获取方法签名
        Method method = AspectUtil.getMethodSignature(joinPoint);
        ClientException clientException = method.getAnnotation(ClientException.class);
        if (object instanceof BackBO) {
            // ===== 当返回的是BackBO时, 判断BackBO的状态
            if (!((BackBO) object).getStatus()) {
                if (clientException != null && StringUtils.isNotBlank(clientException.message())) {
                    throw new BusinessException(clientException.message());
                }
                // ----- 当状态为false时, 根据 backBO 的message抛出异常
                throw new BusinessException(((BackBO) object).getMessage());
            }
        }
    }
}
