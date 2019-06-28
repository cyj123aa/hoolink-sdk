package com.hoolink.sdk.enums.omc;

/**
 * @author chenyuejun
 */

public enum WorkStateEnum {

    COMPLETE((byte)1,"完成"),

    CANCEL((byte)2,"无法完成"),

    APPROVAL((byte)3,"指派工单"),
    TRANSFER((byte)4,"申请转派"),
    DELAY_WORK((byte)5,"申请延期"),
    TURN_DOWN((byte)6,"审批被驳回"),
    CREATE((byte)7,"创建工单"),
    PERFECT((byte)8,"完善工单"),
    THROUGH((byte)9,"审批已通过"),
    RESET((byte)10,"操作人删除 工单重置"),
    ;

    public Byte key;
    public String value;

    WorkStateEnum(Byte key, String value) {
        this.key = key;
        this.value = value;
    }

    public static String getValue(Byte key){
        for (WorkStateEnum workStateEnum : WorkStateEnum.values()) {
            if((byte)9==key){
                return "审批";
            }
            if (workStateEnum.key.equals(key)) {
                return workStateEnum.value;
            }
        }
        return null;
    }
}
