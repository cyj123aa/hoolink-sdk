package com.hoolink.sdk.constants;

/**
 * @author : chenzb
 * @Description : Redis相关常量
 * @date : Created on 2019/5/10 13:29
 */
public class RedisConstants {

    /**
     * 远程升级和强制回滚
     */
    public static final String DEVICE_UPGRADE_START = "device_upgrade_start";
    public static final String DEVICE_UPGRADE_END = "device_upgrade_end";
    public static final String DEVICE_UPGRADE_All = "device_upgrade_all";

    /**
     * 操作记录缓存
     */
    public static final String BIZ_REQ_HISTORY_KEY = "biz_req_history";
    public static final String OPERATION_MAC_KEY = "biz_history_mac_";
    /**
     * 设备最新一次操作缓存
     */
    public static final String LAST_HISTORY_KEY = "last_history_";

    /*** 报警-集中器故障 */
    public static final String EXTERNAL_FAULT = "external_fault";
    /*** 报警-单灯故障 */
    public static final String LIGHT_FAULT = "light_fault";
    /*** 报警-单灯报警 */
    public static final String LIGHT_ALARM = "light_alarm";
    /*** 报警-监控器报警 */
    public static final String MONITOR_ALARM = "monitor_alarm";
    public static final String GAS_ALARM = "GAS_";
    public static final String WATER_GAUGE_ALARM = "WATER_";
    public static final String ENVIRONMENT_ALARM = "ENVIRONMENT_";
    public static final String LEAKAGE_DETECT_ALARM = "LEAKAGE_";

    /*** 显示屏通道占用 */
    public static final String CHANNEL_BUSY = "channel_busy_";

    /*** 策略-单灯计划任务管理 */
    public static final String CRON_LIGHT_TASK = "CRON_LIGHT_TASK";
}
