package com.hoolink.sdk.enums.omc;


/**
 * @author chenyuejun
 * 工单节点功能枚举
 */

public enum ShapeEnum {

    FLOW_CIRCLE ("flow-circle","开始",(byte)4) ,
    FLOW_SQUARE ("flow-square","指派",(byte)3),
    FLOW_RHOMBUS ("flow-rhombus","审批",(byte)5) ,
    FLOW_RECT ("flow-rect","工作",(byte)6) ,
    FLOW_CAPSULE ("flow-capsule","结束",(byte)1) ,
;

    public String key;
    public String value;
    public Byte status;
    ShapeEnum(String key, String value,Byte status) {
        this.key = key;
        this.value = value;
        this.status=status;
    }

    public static Byte getValue(String key){
        for (ShapeEnum shapeEnum : ShapeEnum.values()) {
            if (shapeEnum.key.equals(key)) {
                return shapeEnum.status;
            }
        }
        return null;
    }
}
