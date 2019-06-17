package com.hoolink.sdk.enums.omc;

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
