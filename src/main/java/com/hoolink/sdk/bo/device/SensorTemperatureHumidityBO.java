package com.hoolink.sdk.bo.device;

import lombok.Data;

/**
 * @author lixiaoran
 *@Date 2019-04-09
 */
@Data
public class SensorTemperatureHumidityBO extends DeviceManagerBO{
    private static final long serialVersionUID = -4567140992119105502L;

    /*** 主键ID */
    private Long id;

    /*** 温度，单位:°C */
    private Float temperature;

    /*** 湿度，单位: % */
    private Float humidity;

    /*** 通道号 */
    private String channelNo;

    /** 上次通讯时间 */
    private Long lastTime;

}