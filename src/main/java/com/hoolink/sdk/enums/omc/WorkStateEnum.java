package com.hoolink.sdk.enums.omc;

/**
 * @author chenyuejun
 */

public enum WorkStateEnum {

    COMPLETE(1,"处理完成"),

    CANCEL(2,"无法完成"),

    APPROVAL(3,"指派工单"),
    TRANSFER(4,"申请转派"),
    DELAY_WORK(5,"申请延期"),
    TURN_DOWN(6,"驳回"),
    CREATE(7,"创建工单"),

    COMPLETE_REVIEW(8,"完成审核通过"),
    CANCEL_REVIEW(9,"无法完成审核通过"),
    PERFECT(10,"完善工单"),
    ;

    public Integer key;
    public String value;

    WorkStateEnum(Integer key, String value) {
        this.key = key;
        this.value = value;
    }
}
