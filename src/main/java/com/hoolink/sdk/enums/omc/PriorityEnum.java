package com.hoolink.sdk.enums.omc;


/**
 * @author chenyuejun
 */

public enum PriorityEnum {
    EXPEDITED((byte)1,"加急"),
    EXPRESS((byte)2,"特急"),
    NORMAL((byte)0,"正常"),
   ;
    public Byte key;
    public String value;

    PriorityEnum(Byte key, String value) {
        this.key = key;
        this.value = value;
    }

    public static String getValue(Byte key){
        for (PriorityEnum priorityEnum : PriorityEnum.values()) {
            if (priorityEnum.key.equals(key)) {
                return priorityEnum.value;
            }
        }
        return null;
    }

}
