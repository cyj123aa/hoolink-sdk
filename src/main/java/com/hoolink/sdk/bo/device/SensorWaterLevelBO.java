package com.hoolink.sdk.bo.device;

import lombok.Data;

/**
 * @author zhouyun
 * @description
 * @date 2019/4/4 13:28
 **/
@Data
public class SensorWaterLevelBO extends DeviceManagerBO {

    private static final long serialVersionUID = 5545865910362672326L;
    /*** 主键ID */
    private Long id;

    /*** 监控器外键ID */
    private Long deviceMonitorId;

    /*** 水尺水位单位：m */
    private Float waterLevel;

    /*** 设备通道号 */
    private String channelNo;

    /*** 最后通讯时间 */
    private Long lastTime;

}
