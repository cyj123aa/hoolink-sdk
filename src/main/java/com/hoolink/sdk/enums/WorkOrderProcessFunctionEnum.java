package com.hoolink.sdk.enums;

import java.util.Objects;

/**
 * Created by zhangx on 2018/5/31.
 */
public enum WorkOrderProcessFunctionEnum {

    /**
     * 添加回执
     */
    RECEIPT("receipt", "添加回执", -1),
    /**
     * 撤回工单
     */
    WITHDRAW("withdraw", "撤回工单", -2),
    /**
     * 回退
     */
    REJECT("return", "回退", -3),
    ;

    private String type;
    private String name;
    private long functionCode;

    WorkOrderProcessFunctionEnum(String type, String name, int functionCode) {
        this.type = type;
        this.name = name;
        this.functionCode = functionCode;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public long getFunctionCode() {
        return functionCode;
    }

    public static WorkOrderProcessFunctionEnum getProcessByType(String type) {
        for (WorkOrderProcessFunctionEnum functionEnum : WorkOrderProcessFunctionEnum.values()) {
            if (Objects.equals(functionEnum.getType(), type)) {
                return functionEnum;
            }
        }
        return null;
    }

}
