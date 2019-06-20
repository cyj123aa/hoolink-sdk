package com.hoolink.sdk.enums.omc;

/**
 * @author chenyuejun
 */

public enum WorkStateEnum {

    COMPLETE((byte)1,"处理完成"),

    CANCEL((byte)2,"无法完成"),

    APPROVAL((byte)3,"指派工单"),
    TRANSFER((byte)4,"申请转派"),
    DELAY_WORK((byte)5,"申请延期"),
    TURN_DOWN((byte)6,"驳回"),
    CREATE((byte)7,"创建工单"),

    COMPLETE_REVIEW((byte)8,"完成审核通过"),
    CANCEL_REVIEW((byte)9,"无法完成审核通过"),
    PERFECT((byte)10,"完善工单"),
    ;

    public Byte key;
    public String value;

    WorkStateEnum(Byte key, String value) {
        this.key = key;
        this.value = value;
    }
}
