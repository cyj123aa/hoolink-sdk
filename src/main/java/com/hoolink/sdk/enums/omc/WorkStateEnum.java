package com.hoolink.sdk.enums.omc;

/**
 * @author chenyuejun
 */

public enum WorkStateEnum {


    COMPLETE(1,"已完成"),
    CANCEL(2,"无法完成"),
    APPROVAL(3,"待指派"),
    PERFECTED(4,"待完善"),
    REVIEW(5,"待审核"),
    PROCESSED(6,"申请延期"),
    ;

    public Integer key;
    public String value;

    WorkStateEnum(Integer key, String value) {
        this.key = key;
        this.value = value;
    }
}
