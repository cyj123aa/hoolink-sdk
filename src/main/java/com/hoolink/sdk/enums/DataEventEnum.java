package com.hoolink.sdk.enums;

/**
 * @author : zhujinting
 * @Date: 2018/7/9 11:18
 * @Description: 数据中心-》事件统计-》事件类型枚举
 */
public enum DataEventEnum {
    /**
     * 一键呼救报警
     */
    SOS_CALL("sos_call"),
    /**
     * 广播呼救
     */
    BROADCAST("broadcast");
    private String name;

    DataEventEnum(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
