package com.hoolink.sdk.enums;

/**
 * Created by zhangx on 2018/5/31.
 * 工单流程节点类型枚举
 */
public enum WorkOrderProcessNodeEnum {
    /**
     * 开始
     */
    START("start"),
    /**
     * 维修节点
     */
    ACCENDANT("accendant"),
    /**
     * 审批节点
     */
    APPROVE("approve"),
    /**
     * 结束
     */
    END("end");

    private String type;

    WorkOrderProcessNodeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
