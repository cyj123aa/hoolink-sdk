package com.hoolink.sdk.annotation;

import com.hoolink.sdk.enums.CheckEnum;

import java.lang.annotation.*;

import static com.hoolink.sdk.enums.CheckEnum.DATA_NOT_NULL;

/**
 * @Author: xuli
 * @Date: 2018/9/30 13:05
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogAndParam {

    String value();

    CheckEnum check() default DATA_NOT_NULL;

}
