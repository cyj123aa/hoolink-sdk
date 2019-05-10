package com.hoolink.sdk.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangx on 2018/6/16.
 * 工单无法完成原因枚举对象
 */
public enum WorkOrderUnableReasonEnum {
    /**
     * 反应的问题不存在
     */
    REASON_1("反应的问题不存在"),
    /**
     * 当前技术条件无法完成
     */
    REASON_2("当前技术条件无法完成"),
    /**
     * 重复的工单
     */
    REASON_3("重复的工单"),
    /**
     * 不可抗力因素
     */
    REASON_4("不可抗力因素"),
    /**
     * 其他
     */
    REASON_5("其他");

    private String name;

    WorkOrderUnableReasonEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static List<String> getNameList() {
        List<String> list = new ArrayList<>();
        for (WorkOrderUnableReasonEnum reasonEnum : WorkOrderUnableReasonEnum.values()) {
            list.add(reasonEnum.name);
        }
        return list;
    }
}
