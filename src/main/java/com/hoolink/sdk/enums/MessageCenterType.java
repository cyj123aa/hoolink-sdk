package com.hoolink.sdk.enums;

/**
 * @author zhouyun
 * @data 2018/7/12 14:10
 */
public enum MessageCenterType {
    /**
     * 所有消息
     */
    ALL(0, "所有消息"),
    /**
     * 设备消息
     */
    DEVICE(1, "设备消息"),
    /**
     * 公告消息
     */
    NOTICE(2, "公告消息"),
    /**
     * 系统消息
     */
    SYSTEM(3, "系统消息"),
    /**
     * 未知消息
     */
    UN_KNOW(4, "未知消息");

    private int type;
    private String name;

    MessageCenterType(int type, String name) {
        this.type = type;
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public static String getMessageCenterType(int type) {
        for (MessageCenterType messageCenterType : values()) {
            if (type == messageCenterType.type) {
                return messageCenterType.getName();
            }
        }
        return "未知消息";
    }
}
