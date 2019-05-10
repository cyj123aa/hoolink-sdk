package com.hoolink.sdk.enums;

/**
 * @author zhouyun
 * @description 监控器相关联传感器的类型
 * @date 2019/4/4 11:45
 **/
public enum MonitorSensorEnum {

    /**
     * 环境
     */
    ENVIRONMENT((byte) 1),
    /**
     * 气体
     */
    GAS((byte) 2),
    /**
     * 漏电
     */
    LEAKAGE((byte) 3),
    /**
     * 水尺
     */
    WATER_LEVEL((byte) 4),
    ;

    private Byte type;

    MonitorSensorEnum(byte type) {
        this.type = type;
    }

    public Byte getType() {
        return type;
    }
}
