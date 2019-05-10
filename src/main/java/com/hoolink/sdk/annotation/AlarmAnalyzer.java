package com.hoolink.sdk.annotation;

import com.hoolink.sdk.enums.AlarmAnalyzerEnum;

import java.lang.annotation.*;

/**
 * Created by zhangx on 2018/6/25.
 */
@Target( ElementType.TYPE )
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AlarmAnalyzer {
    AlarmAnalyzerEnum value();
}
