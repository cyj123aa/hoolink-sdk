package com.hoolink.sdk.enums.omc;

import com.hoolink.sdk.bo.omc.NodeBO;

public enum ShapeEnum {

    FLOW_CIRCLE ("flow-circle","开始节点") ,

    FLOW_RHOMBUS ("flow-rhombus","审批") ,
    FLOW_RECT ("flow-rect","工作") ,
    FLOW_CAPSULE ("flow-capsule","结束") ,

;
    public String key;
    public String value;

    ShapeEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }
}
