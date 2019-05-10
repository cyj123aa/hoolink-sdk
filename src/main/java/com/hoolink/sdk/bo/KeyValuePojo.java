package com.hoolink.sdk.bo;

import lombok.Data;

/**
 * Created by zhao_aken on 2018/1/4.
 * 用于存储map是定义的参数：key-value
 */
@Data
public class KeyValuePojo<T> {
    private String key;
    private T value;
}
