package com.hoolink.sdk.annotation;

import com.hoolink.sdk.enums.alarm.ItemEnum;

import java.lang.annotation.*;

/**
 * @author <a herf="mailto:yanwu0527@163.com">XuBaofeng</a>
 * @date 2019-06-12 13:55.
 * <p>
 * description:
 */
@Documented
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface AlarmItem {

    ItemEnum value();

}
