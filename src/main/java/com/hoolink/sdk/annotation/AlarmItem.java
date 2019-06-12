package com.hoolink.sdk.annotation;

import com.hoolink.sdk.enums.alarm.ItemEnum;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author <a herf="mailto:yanwu0527@163.com">XuBaofeng</a>
 * @date 2019-06-12 13:55.
 * <p>
 * description:
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface AlarmItem {

    ItemEnum value();

}
