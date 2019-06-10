package com.hoolink.sdk.enums.omc;

public enum WorkStateEnum {

    COMPLETE(1,"工单完成"),
    CANCEL(2,"工单无法完成"),
    APPROVALSUCCESS(3,"审批成功"),
    APPROVALERROR(4,"审批失败"),
    EXECUTION(5,"申请转派"),
    DELAYWORK(6,"申请延期"),
    ;

    public Integer key;
    public String value;

    WorkStateEnum(Integer key, String value) {
        this.key = key;
        this.value = value;
    }
}
