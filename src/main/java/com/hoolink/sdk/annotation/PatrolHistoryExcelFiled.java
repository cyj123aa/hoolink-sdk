package com.hoolink.sdk.annotation;


import com.hoolink.sdk.enums.PatrolResHistoryExcelEnum;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author lixiaoran on 2018-09-12.
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PatrolHistoryExcelFiled {
    PatrolResHistoryExcelEnum value();
}
