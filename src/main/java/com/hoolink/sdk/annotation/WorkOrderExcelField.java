package com.hoolink.sdk.annotation;

import com.hoolink.sdk.enums.WorkOrderExcelEnum;

import java.lang.annotation.*;

/**
 * @author zhangxin
 * @date 2018/7/12
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface WorkOrderExcelField {

    WorkOrderExcelEnum value();
}
