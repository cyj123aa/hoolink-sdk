package com.hoolink.sdk.enums.omc;

/**
 * @author chenyuejun
 */

public enum ObsEnum {
    /**
     *创建工单
     */
    CREATEWORK((byte)1, "创建工单"),
    /**
     *
     */
    TRANSFER((byte)2, "申请转派"),
    /**
     *
     */
    ADDRECEIPT((byte)3, "添加回执"),
    /**
     *
     */
    DELAYWORK((byte)4, "申请延期"),
    /**
     *
     */
    CANTCOMPLETEWORK((byte)5, "无法完成"),
    /**
     *
     */
    COMPLETEWORK((byte)6, "完成工单"),
    /**
     *
     */
    REVIEW((byte)7, "审批"),
    ;


    public Byte key;
    public String value;


    ObsEnum(Byte key, String value) {
        this.key = key;
        this.value = value;
    }


}
