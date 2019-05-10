package com.hoolink.sdk.annotation;

import java.lang.annotation.*;

/**
 * Created by wm on 2018/6/23.
 * 自定义注解类
 */
@Target( ElementType.METHOD )
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AlarmType {
    String value();

}
