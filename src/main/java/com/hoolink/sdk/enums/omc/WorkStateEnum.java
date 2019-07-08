package com.hoolink.sdk.enums.omc;

/**
 * @author chenyuejun
 */

public enum WorkStateEnum {

    COMPLETE((byte)1,"完成",(byte)6),

    CANCEL((byte)2,"无法完成",(byte)5),

    APPROVAL((byte)3,"指派工单",null),
    TRANSFER((byte)4,"申请转派",(byte)2),
    DELAY_WORK((byte)5,"申请延期",(byte)4),
    TURN_DOWN((byte)6,"审批被驳回",(byte)7),
    CREATE((byte)7,"创建工单",(byte)1),
    PERFECT((byte)8,"完善工单",(byte)1),
    THROUGH((byte)9,"审批已通过",(byte)7),
    RESET((byte)10,"操作人删除 工单重置",(byte)1),
    ADD_RECEIPT((byte)11,"添加回执",null),
    ;

    public Byte key;
    public String value;
    public Byte obsKey;
    WorkStateEnum(Byte key, String value,Byte obsKey) {
        this.key = key;
        this.value = value;
        this.obsKey=obsKey;
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
