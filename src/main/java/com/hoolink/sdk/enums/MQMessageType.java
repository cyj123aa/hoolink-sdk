package com.hoolink.sdk.enums;

/**
 * @author zhouyun
 * @data 2018/6/5 10:59
 */
public enum MQMessageType {
    /**
     * 未知
     */
    UN_KNOW(0, "未知"),
    /**
     * 工单
     */
    ORDER(1, "工单"),
    /**
     * 告警
     */
    ALARM(2, "告警");

    private int type;
    private String name;

    MQMessageType(int type, String name) {
        this.type = type;
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public static String getMQMessageType(int type) {
        for (MQMessageType mqMessageType : values()) {
            if (type == mqMessageType.type) {
                return mqMessageType.getName();
            }
        }
        return "未知";
    }
}
