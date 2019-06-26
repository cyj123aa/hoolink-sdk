package com.hoolink.sdk.enums.omc;

/**
 * @author Administrator
 */

public enum WorkEnum {

    COMPLETE((byte)1,"已完成"),
    CANCEL((byte)2,"无法完成"),
    APPROVAL((byte)3,"待指派"),
    PERFECTED((byte)4,"待完善"),
    REVIEW((byte)5,"待审核"),
    PROCESSED((byte)6,"待处理"),
;

    public Byte key;
    public String value;

    WorkEnum(Byte key, String value) {
        this.key = key;
        this.value = value;
    }

    public static String getValue(Byte key){
        for (WorkEnum workEnum : WorkEnum.values()) {
            if (workEnum.key.equals(key)) {
                return workEnum.value;
            }
        }
        return null;
    }

}
