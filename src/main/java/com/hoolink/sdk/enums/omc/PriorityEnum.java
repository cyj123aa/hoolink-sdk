package com.hoolink.sdk.enums.omc;

import com.hoolink.sdk.enums.ColorEnum;

public enum PriorityEnum {
    EXPEDITED(1,"加急"),
    EXPRESS(2,"特急"),
    NORMAL(3,"正常"),
   ;
    public Integer key;
    public String value;

    PriorityEnum(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    public static String getValue(Integer key){
        for (PriorityEnum priorityEnum : PriorityEnum.values()) {
            if (priorityEnum.key.equals(key)) {
                return priorityEnum.value;
            }
        }
        return null;
    }

}
