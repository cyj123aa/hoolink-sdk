package com.hoolink.sdk.constants;

/**
 * @author XuBaofeng.
 * @date 2019-04-10 9:11.
 * <p>
 * description:
 * * 该常量类仅作为在设备上行数据从command通过队列的方式到device时使用的队列名的定义
 * * 所有从command到device的上行队列, 都必须使用该常量类中的常量
 */
public interface DeviceQueueConstants {
    /*** 设备下行历史报文队列 */
    String CMD_REQ = "cmd_req";
    /*** 设备上行历史报文队列 */
    String CMD_RES = "cmd_res";
    /*** NFC打卡数据上行队列 */
    String PATROL_RES = "patrol_res";
    /*** 单灯心跳队列 */
    String LIGHT_HEARTBEAT = "light_heartbeat";
    /*** 单灯主动上行数据队列 */
    String LIGHT_UP = "light_up";
    /*** 单灯响应上行数据队列 */
    String LIGHT_RES = "light_res";
    /*** 监控器上行历史数据队列 */
    String MONITOR_RES = "monitor_res";
    /*** 环境监测上行历史数据队列 */
    String ENVIRONMENT_RES = "environment_res";
    /*** 气体检测上行历史数据队列 */
    String GAS_RES = "gas_res";
    /*** 漏电检测上行历史数据队列 */
    String LEAKAGE_RES = "leakage_res";
    /*** 水尺上行历史数据队列 */
    String WATER_LEVEL_RES = "water_level_res";
    /*** 广播上行历史报文队列 */
    String BROADCAST_RES = "broadcast_res";
    /*** 广播下行历史报文队列 */
    String BROADCAST_REQ = "broadcast_req";
    /*** 世邦音箱、实时广播、一键求助 在离线上行数据队列 */
    String SPON_ALARM_STATUS_RES = "spon_alarm_status_res";
}