package com.hoolink.sdk.enums;

import java.util.Objects;

/**
 * 工单流程枚举类
 *
 * @author zhangxin
 * @date 2018/5/25
 */
public enum WorkOrderProcessEnum {
    /**
     * 提交工单
     */
    SUBMIT("submit", "提交工单", "提交工单", "start"),
    /**
     * 审批通过
     */
    DESIGNATE("designate", "审批通过", "指派人确认", "approve"),
    /**
     * 审核通过
     */
    APPROVE("approve", "审核通过", "备注2", "approve"),
    /**
     * 申请转派
     */
    TRANSFER("transfer", "申请转派", "备注2", "accendant"),
    /**
     * 申请延期
     */
    DELAY("delay", "申请延期", "备注2", "delay"),
    /**
     * 无法完成
     */
    UNABLE("unable", "无法完成", "备注2", "accendant"),
    /**
     * 完成工单
     */
    DONE("done", "完成工单", "备注2", "accendant");

    private String type;
    private String name;
    private String startNodeType;
    private String remark;

    WorkOrderProcessEnum(String type, String name, String startNodeType, String remark) {
        this.type = type;
        this.name = name;
        this.startNodeType = startNodeType;
        this.remark = remark;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartNodeType() {
        return startNodeType;
    }

    public void setStartNodeType(String startNodeType) {
        this.startNodeType = startNodeType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public static WorkOrderProcessEnum getProcessByType(String type) {
        for (WorkOrderProcessEnum processEnum : WorkOrderProcessEnum.values()) {
            if (Objects.equals(processEnum.getType(), type)) {
                return processEnum;
            }
        }
        return null;
    }

    public static String getNameByType(String type) {
        for (WorkOrderProcessEnum processEnum : WorkOrderProcessEnum.values()) {
            if (Objects.equals(processEnum.getType(), type)) {
                return processEnum.name;
            }
        }
        return "";
    }
}
