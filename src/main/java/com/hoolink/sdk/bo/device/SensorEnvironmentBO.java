package com.hoolink.sdk.bo.device;

import lombok.Data;

/**
 * @author zhouyun
 * @description
 * @date 2019/4/3 16:41
 **/
@Data
public class SensorEnvironmentBO extends DeviceManagerBO {

    private static final long serialVersionUID = -5550830972662941192L;
    /*** 主键ID */
    private Long id;

    /*** 监控器外键ID */
    private Long deviceMonitorId;

    /*** 设备通道号 */
    private String channelNo;

    /*** 最后通讯时间 */
    private Long lastTime;

    /*** 风向测量范围：0-360° */
    private Integer windDirection;

    /*** 风速单位：m/s */
    private Float windSpeed;

    /*** 温度检测值单位：°C */
    private Float temperature;

    /*** 湿度检测值单位：% */
    private Float humidity;

    /*** 气压检测值单位：kPa */
    private Float airPressure;

    /*** 雨量检测值单位：mm */
    private Float rainfall;

    /*** 辐射检测值单位：w/m2 */
    private Float radiation;

    /*** 紫外线检测值单位：UVI */
    private Integer ultraviolet;

    /*** 噪音检测值单位：dB */
    private Float noise;

    /*** PM2.5单位：μg/m3 */
    private Float pmTowpointfive;

    /*** PM10单位：μg/m3 */
    private Float pmTen;

}
