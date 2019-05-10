package com.hoolink.sdk.annotation;

import com.hoolink.sdk.enums.MatterEnum;

import java.lang.annotation.*;

/**
 * 类
 *
 * @author zhangxin
 * @date 2019/1/4
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AlarmSensorType {

    MatterEnum value();
}
