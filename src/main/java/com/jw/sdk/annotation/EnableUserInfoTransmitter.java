package com.jw.sdk.annotation;

import com.jw.sdk.cloud.EnableUserInfoTransmitterAutoConfiguration;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.context.annotation.Import;

/**
 * @author chenyuejun   用于springcloud  每个微服务在使用FeignClient调用别的微服务时，先从ThreadLocal里面取出user信息，并放在request的请求头中
 * * @date 2019/10/16 15:09
 */
@Documented
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Import({EnableUserInfoTransmitterAutoConfiguration.class})
public @interface EnableUserInfoTransmitter {
}
