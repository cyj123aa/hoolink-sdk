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

    /** 风向名称 */
    private String windDirectionName;

    /** 风向符号 */
    private String windDirectionSign;

    /** 风速等级，单位：节 */
    private Integer windLevel;

    /** 水尺水位值单位：m */
    private Float waterLevel;

    /** 风向超出值 */
    private Float windDirectionBeyond;

    /** 风速超出值 */
    private Float windSpeedBeyond;

    /** 温度超出值 */
    private Float temperatureBeyond;

    /** 湿度超出值 */
    private Float humidityBeyond;

    /** 气压超出值 */
    private Float airPressureBeyond;

    /** 雨量超出值 */
    private Float rainfallBeyond;

    /** 辐射超出值 */
    private Float radiationBeyond;

    /** 紫外线超出值 */
    private Float ultravioletBeyond;

    /** 噪音超出值 */
    private Float noiseBeyond;

    /** PM2.5超出值 */
    private Float pmTowpointfiveBeyond;

    /** PM10超出值 */
    private Float pmTenBeyond;

    /** 光照度 */
    private Long light;
}