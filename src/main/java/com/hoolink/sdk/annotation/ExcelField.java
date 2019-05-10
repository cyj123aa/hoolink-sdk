package com.hoolink.sdk.annotation;

import java.lang.annotation.*;

/**
 * @Author: tonghao
 * @Date: 2019/5/8 14:36
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ExcelField {

    boolean require();//非空
    String message() default "";
}
