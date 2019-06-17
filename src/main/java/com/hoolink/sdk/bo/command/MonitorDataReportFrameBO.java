package com.hoolink.sdk.bo.command;

import lombok.Data;

/**
 * @author zhouyun
 * @description 数据上报内容解析类
 * @date 2018/12/19 10:12
 **/
@Data
public class MonitorDataReportFrameBO {

    /*** 设备id */
    private Long monitorId;

    /*** 环境传感器扩展表外键ID */
    private Long deviceSensorEnvironmentId;

    /*** 气体传感器扩展表外键ID */
    private Long deviceSensorGasId;

    /*** 漏电传感器扩展表外键ID */
    private Long deviceSensorLeakageId;

    /*** 水位传感器扩展表外键ID */
    private Long deviceSensorWaterLevelId;

    /*** 监控器MAC */
    private String mac;

    /*** 平均风向 */
    private Integer windDirection;

    /*** 平均风速 */
    private Float windSpeed;

    /*** 温度 */
    private Float temperature;

    /*** 湿度*/
    private Float humidity;

    /*** 气压 */
    private Float airPressure;

    /*** 雨量*/
    private Float rainfall;

    /*** 辐射 */
    private Float radiation;

    /*** 紫外线 */
    private Integer ultraviolet;

    /*** 噪音 */
    private Float noise;

    /*** PM2.5 */
    private Float pmTowPointFive;

    /*** PM10 */
    private Float pmTen;

    /*** CO气体 一氧化碳 */
    private Float gasCo;

    /*** SO2气体 */
    private Float gasSo2;

    /*** H2S气体 硫化氢 */
    private Float gasH2s;

    /*** NO2气体 二氧化氮 */
    private Float gasNo2;

    /*** O3气体 臭氧 */
    private Float gasO3;

    /*** NO气体 一氧化氮 */
    private Float gasNo;

    /*** 水尺水位 */
    private Float waterLevel;

    /*** 漏电电流 */
    private Float leakageCurrent;

    /*** 最新通讯时间 */
    private Long lastTime;

    /*** 项目id */
    private Long projectId;
}
