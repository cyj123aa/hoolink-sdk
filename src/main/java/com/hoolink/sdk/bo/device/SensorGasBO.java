package com.hoolink.sdk.bo.device;

import lombok.Data;

/**
 * @author zhouyun
 * @description
 * @date 2019/4/4 9:28
 **/
@Data
public class SensorGasBO extends DeviceManagerBO {

    private static final long serialVersionUID = 6576444669995559664L;
    /*** 主键ID */
    private Long id;

    /*** 监控器外键ID */
    private Long deviceMonitorId;

    /*** 设备通道号 */
    private String channelNo;

    /*** 最后通讯时间 */
    private Long lastTime;

    /*** 一氧化碳检测值,单位：mg/m3 */
    private Float gasCo;

    /*** 硫化氢检测值单位：mg/m3 */
    private Float gasH2s;

    /*** 一氧化氮检测值单位：mg/m3 */
    private Float gasNo;

    /*** 二氧化氮检测值单位：mg/m3 */
    private Float gasNo2;

    /*** 臭氧检测值单位：mg/m3 */
    private Float gasO3;

    /*** 二氧化硫检测值单位：mg/m3 */
    private Float gasSo2;

    /*** VOC检测值单位：mg/m3 */
    private Float gasVoc;

}
