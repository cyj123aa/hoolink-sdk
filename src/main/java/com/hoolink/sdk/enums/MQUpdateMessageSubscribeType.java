package com.hoolink.sdk.enums;

/**
 * @author zhouyun
 * @description 用户消息订阅信息修改推送MQ操作类型
 * @date 2019/1/17 16:16
 **/
public enum MQUpdateMessageSubscribeType {

    /**
     * 未知
     */
    UN_KNOW(0, "未知"),
    /**
     * 告警订阅修改
     */
    ALARM_UPDATE(1, "告警订阅修改"),
    /**
     * 流程订阅修改
     */
    PROCESS_UPDATE(2, "流程订阅修改"),
    /**
     * 删除用户
     */
    DELETE_USER(3, "删除用户"),
    /**
     * 修改用户
     */
    UPDATE_USER(4, "修改用户"),
    /**
     * 启用用户
     */
    ENABLE_USER(5, "启用用户"),
    ;

    private int type;
    private String name;

    MQUpdateMessageSubscribeType(int type, String name) {
        this.type = type;
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public static String getMessageSubscribeType(int type) {
        for (MQUpdateMessageSubscribeType mqUpdateMessageSubscribeType : values()) {
            if (type == mqUpdateMessageSubscribeType.type) {
                return mqUpdateMessageSubscribeType.getName();
            }
        }
        return "未知";
    }
}
