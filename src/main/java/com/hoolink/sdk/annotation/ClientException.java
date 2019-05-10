package com.hoolink.sdk.annotation;

import java.lang.annotation.*;

/**
 * @author XuBaofeng.
 * @date 2019-04-25 14:25.
 * <p>
 * description:
 * 该注解用在微服务之间的远程RPC调用时
 * 例: A 服务 调用 B 服务
 * 当 B 服务返回的 BackBO 状态为 false 时, A 服务会在 client 中抛出异常
 * 异常的 message 为 BackBO 的 message
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ClientException {
    /**
     * 返回的message:
     * * 如果无值, 则返回的 message 取自与 BackBO 的 message,
     * * 如果有值, 则在client抛出异常时, 将message抛出
     *
     * @return
     */
    String message() default "";

}
