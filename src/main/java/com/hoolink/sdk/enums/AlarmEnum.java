package com.hoolink.sdk.enums;

/**
 * @author wm
 * Created by wm on 2018/06/13.
 * 故障码约定枚举类
 */
public enum AlarmEnum {

    /**
     * 单灯断线故障
     */
    LIGHT_OFFLINE("light_offline"),
    /**
     * 单灯ACK故障
     */
    LIGHT_ACK("light_ack"),
    /**
     * 集中器断线故障
     */
    LIGHT_EXTERNAL_OFFLINE("light_external_offline"),
    /**
     * 集中器ACK故障
     */
    LIGHT_EXTERNAL_ACK("light_external_ack"),
    ;

    String value;

    AlarmEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

}
