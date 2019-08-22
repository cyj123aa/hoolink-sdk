package com.hoolink.sdk.enums.omc;

/**
 * @author chenyuejun.
 * @date 2018-12-27 10:00.
 * <p>
 * description: 工单查询条件枚举
 */
public enum DateEnum {
    THIRTYDAYS(1,"前三十天"),
    HALFAYEAR(2,"前半年"),
    ALL(3,"全部"),
    ;
    public Integer key;
    public String value;

    DateEnum(Integer key, String value) {
        this.key = key;
        this.value = value;
    }
}
