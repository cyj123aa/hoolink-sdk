package com.hoolink.sdk.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangx on 2018/6/16.
 * 工单回退原因枚举对象
 */
public enum WorkOrderReturnReasonEnum {
    /**
     * 工单信息不全
     */
    REASON_1("工单信息不全"),
    /**
     * 未完成工单任务
     */
    REASON_2("未完成工单任务"),
    /**
     * 其他
     */
    REASON_5("其他");

    private String name;

    WorkOrderReturnReasonEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static List<String> getNameList() {
        List<String> list = new ArrayList<>();
        for (WorkOrderReturnReasonEnum reasonEnum : WorkOrderReturnReasonEnum.values()) {
            list.add(reasonEnum.name);
        }
        return list;
    }
}
