package com.hoolink.sdk.annotation;

import java.lang.annotation.*;

/**
 * Created by wm on 2018/6/23.
 * 自定义注解类 用于poi导入
 */
@Target( ElementType.FIELD )
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AnalysisField {
    String value();
}
