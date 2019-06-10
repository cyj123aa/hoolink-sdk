package com.hoolink.sdk.enums.omc;

public enum WorkEnum {

    COMPLETE(1,"完成"),
    CANCEL(2,"取消"),
    APPROVAL(3,"审批"),

    EXECUTION(5,"申请转派"),
    DELAYWORK(6,"申请延期"),
;

    public Integer key;
    public String value;

    WorkEnum(Integer key, String value) {
        this.key = key;
        this.value = value;
    }
}
