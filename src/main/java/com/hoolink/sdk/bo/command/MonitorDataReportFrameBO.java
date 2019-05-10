package com.hoolink.sdk.bo.command;

import lombok.Data;

/**
 * @author zhouyun
 * @description 数据上报内容解析类
 * @date 2018/12/19 10:12
 **/
@Data
public class MonitorDataReportFrameBO {

    /**
     * 监控器MAC
     */
    private String mac;
    /**
     * 平均风向
     */
    private Integer windDirection;
    /**
     * 平均风速
     */
    private Float windSpeed;
    /**
     * 温度
     */
    private Float temperature;
    /**
     * 湿度
     */
    private Float humidity;
    /**
     * 气压
     */
    private Float airPressure;
    /**
     * 雨量
     */
    private Float rainfall;
    /**
     * 辐射
     */
    private Float radiation;
    /**
     * 紫外线
     */
    private Integer ultraviolet;
    /**
     * 噪音
     */
    private Float noise;
    /**
     * PM2.5
     */
    private Float pmTowPointFive;
    /**
     * PM10
     */
    private Float pmTen;
    /**
     * CO气体
     */
    private Float co;
    /**
     * SO2气体
     */
    private Float so2;
    /**
     * H2S气体
     */
    private Float h2s;
    /**
     * NO2气体
     */
    private Float no2;
    /**
     * O3气体
     */
    private Float o3;
    /**
     * NO气体
     */
    private Float no;
    /**
     * 水尺水位
     */
    private Float waterLevel;
    /**
     * 漏电电流
     */
    private Float leakageCurrent;

}
