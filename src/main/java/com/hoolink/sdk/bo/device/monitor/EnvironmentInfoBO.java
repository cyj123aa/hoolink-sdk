package com.hoolink.sdk.bo.device.monitor;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 朱礼
 * @Date 2019/5/30
 * @Desc
 */
@Data
public class EnvironmentInfoBO implements Serializable {

    private static final long serialVersionUID = 2903904326751882663L;
    /** 风向*/
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

    /** 一氧化碳检测值单位：mg/m3 */
    private Float gasCo;

    /** 硫化氢检测值单位：mg/m3 */
    private Float gasH2s;

    /** 一氧化氮检测值单位：mg/m3 */
    private Float gasNo;

    /** 二氧化氮检测值单位：mg/m3 */
    private Float gasNo2;

    /** 臭氧检测值单位：mg/m3 */
    private Float gasO3;

    /** 二氧化硫检测值单位：mg/m3 */
    private Float gasSo2;

    /** 水尺水位值单位：m */
    private Float waterLevel;

}