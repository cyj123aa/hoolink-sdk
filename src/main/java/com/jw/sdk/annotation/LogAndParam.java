package com.jw.sdk.annotation;

import com.jw.sdk.enums.CheckEnum;
import java.lang.annotation.*;

/**
 * @Author: xuli
 * @Date: 2018/9/30 13:05
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogAndParam {

    String value();

    CheckEnum check() default CheckEnum.DATA_NOT_NULL;

}
