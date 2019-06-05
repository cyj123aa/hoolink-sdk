package com.hoolink.sdk.bo.device.monitor;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 朱礼
 * @Date 2019/5/30
 * @Desc
 */
@Data
public class EnvironmentHistoryBO implements Serializable {

    private static final long serialVersionUID = 1125996563201582067L;

    /** 时间*/
    private Long created;

    /** 监控器名称*/
    private String monitorName;

    /** 风向测量范围：0-360°*/
    private Integer windDirection;

    /** 风速单位：m/s */
    private Float windSpeed;

    /** 温度检测值单位：°C */
    private Float temperature;

    /** 湿度检测值单位：% */
    private Float humidity;

    /** 气压检测值单位：kPa */
    private Float airPressure;

    /** 雨量检测值单位：mm */
    private Float rainfall;

    /** 辐射检测值单位：w/m2 */
    private Float radiation;

    /** 紫外线检测值单位：UVI */
    private Integer ultraviolet;

    /** 噪音检测值单位：dB */
    private Float noise;

    /** PM2.5单位：μg/m3 */
    private Float pmTowpointfive;

    /**  PM10单位：μg/m3 */
    private Float pmTen;



}