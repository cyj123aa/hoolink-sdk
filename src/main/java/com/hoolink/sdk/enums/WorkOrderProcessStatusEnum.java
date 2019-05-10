package com.hoolink.sdk.enums;

import java.util.Objects;

/**
 * 工单状态枚举
 * @author zhangxin
 * @date 2018/6/4
 */
public enum WorkOrderProcessStatusEnum {

    /**
     * 状态：填写工单
     */
    WAIT_SUBMIT((short)1, "填写工单", "start"),
    /**
     * 状态：待审核
     */
    WAIT_APPROVE((short)2, "待指派", "approve"),
    /**
     * 状态：待处理
     */
    DOING((short)3, "待处理", "accendant"),
    /**
     * 状态：待指派
     */
    WAIT_ACCEPTANCE((short)4, "待审核", "approve"),
    /**
     * 状态：已关闭
     */
    DONE((short)5, "已关闭", "end"),
    /**
     * 状态：已撤回
     */
    WITHDREW((short)6, "已撤回", null),
    ;

    private Short status;
    private String statusName;
    /**
     * 对应流程节点可以展示的下拉选项
     */
    private String nodeType;

    WorkOrderProcessStatusEnum(Short status, String statusName, String nodeType) {
        this.status = status;
        this.statusName = statusName;
        this.nodeType = nodeType;
    }

    public Short getStatus() {
        return status;
    }

    public String getStatusName() {
        return statusName;
    }

    public String getNodeType() {
        return nodeType;
    }

    /**
     * 根据状态值获得枚举对象
     */
    public static WorkOrderProcessStatusEnum getStatusEnumByStatus(Short status) {
        for (WorkOrderProcessStatusEnum statusEnum : WorkOrderProcessStatusEnum.values()) {
            if (Objects.equals(statusEnum.getStatus(), status)) {
                return statusEnum;
            }
        }
        return null;
    }

    /**
     * 根据节点类型获得节点名称
     */
    public static String getNameByType(String nodeType) {
        for (WorkOrderProcessStatusEnum statusEnum : WorkOrderProcessStatusEnum.values()) {
            if (Objects.equals(statusEnum.getNodeType(), nodeType)) {
                return statusEnum.getStatusName();
            }
        }
        return "";
    }
}
