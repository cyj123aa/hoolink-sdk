package com.hoolink.sdk.constants;

/**
 * 环境监测监控器相关常量类
 *
 * @author zhangxin
 * @date 2018/12/20
 */
public class MonitorConstants {

    /**
     * 传感器自身故障
     */
    public static final int LEAKAGE_TYPE_SELF_FAULT = 0;
    /**
     * 水尺漏电
     */
    public static final int LEAKAGE_TYPE_WATER_GAUGE = 1;
    /**
     * 220V电源漏电
     */
    public static final int LEAKAGE_TYPE_POWER = 2;

    /**
     * 副奥通小型气象站
     */
    public static final int COMMUNICATION_FAILURE_METEOROLOGICAL_STATION = 0;
    /**
     * 富奥通气体检测
     */
    public static final int COMMUNICATION_FAILURE_GAS_DETECTOR = 1;
    /**
     * 潍坊金水华禹电子水尺
     */
    public static final int COMMUNICATION_FAILURE_WATER_GAUGE = 2;
    /**
     * 仁科百叶箱
     */
    public static final int COMMUNICATION_FAILURE_INSTRUMENTS_SCREEN = 3;

    /**
     * 显示屏退出登录
     */
    public static final String MONITOR_BATCH_FIRMWARE_UPGRADE = "batchFirmwareUpgrade";

}
