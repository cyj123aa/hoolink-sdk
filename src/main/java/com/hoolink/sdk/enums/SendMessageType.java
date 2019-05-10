package com.hoolink.sdk.enums;

/**
 * @author zhouyun
 * @data 2018/6/8 14:58
 */
public enum SendMessageType {

    /**
     * 未知
     */
    UN_KNOW(0, "未知"),
    /**
     * 短信
     */
    PHONE(1, "短信"),
    /**
     * 邮件
     */
    EMAIL(2, "邮件"),
    /**
     * APP
     */
    APP(3, "APP");

    private int type;
    private String name;

    SendMessageType(int type, String name) {
        this.type = type;
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public static SendMessageType getSendMessageType(int type) {
        for (SendMessageType sendMessageType : values()) {
            if (type == sendMessageType.type) {
                return sendMessageType;
            }
        }
        return UN_KNOW;
    }
}
