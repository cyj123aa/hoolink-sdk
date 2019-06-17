package com.hoolink.sdk.bo.device.monitor;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 朱礼
 * @Date 2019/5/30
 * @Desc
 */
@Data
public class SensorGasHistoryBO implements Serializable {

    private static final long serialVersionUID = -2000889700973781433L;
    /** 环境传感器名称 */
    private String monitorName;

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

    /** 创建时间*/
    private Long created;

    /**  一氧化碳超出值 */
    private Float gasCoBeyond;

    /** 硫化氢超出值 */
    private Float gasH2sBeyond;

    /** 一氧化氮超出值 */
    private Float gasNoBeyond;

    /** 二氧化氮超出值 */
    private Float gasNo2Beyond;

    /** 臭氧超出值 */
    private Float gasO3Beyond;

    /** 二氧化硫超出值 */
    private Float gasSo2Beyond;
}