package com.hoolink.sdk.bo.device;

import lombok.Data;

/**
 * @author 朱礼
 * @Date 2019/5/17
 * @Desc
 */
@Data
public class DeviceLightBO {

    /** 单灯扩展表*/
    private Long id;

    /** 所属集中器ID*/
    private Long externalId;

    /** 设备故障时回填的故障ack值 */
    private String ack;

    /** 电压*/
    private Integer voltage;

    /** 电流*/
    private Integer lightCurrent;

    /** 功率*/
    private Integer lightPower;

    /** 调光值*/
    private Integer dimmingValue;

    /** 光衰*/
    private Integer lightWeak;

    /** 耗电量 度*/
    private Integer powerCost;

    /** 温度*/
    private Integer temperature;

    /** 工作时长，从第一开灯到现在，累加 */
    private Integer workingTime;

    /** 巡检时间，上一次查询的时间*/
    private Long lastTime;
}
