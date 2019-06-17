package com.hoolink.sdk.enums.omc;

/**
 * @author chenyuejun
 */

public enum ObsEnum {
    /**
     *创建工单
     */
    CREATEWORK(1, "创建工单"),
    /**
     *
     */
    TRANSFER(2, "申请转派"),
    /**
     *
     */
    ADDRECEIPT(3, "添加回执"),
    /**
     *
     */
    DELAYWORK(4, "申请延期"),
    /**
     *
     */
    CANTCOMPLETEWORK(5, "无法完成"),
    /**
     *
     */
    COMPLETEWORK(6, "完成工单"),
    /**
     *
     */
    REVIEW(7, "审批"),
    ;


    public Integer key;
    public String value;


    ObsEnum(Integer key, String value) {
        this.key = key;
        this.value = value;
    }


}
