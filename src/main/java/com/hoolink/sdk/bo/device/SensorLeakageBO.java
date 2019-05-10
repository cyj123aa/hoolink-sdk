package com.hoolink.sdk.bo.device;

import lombok.Data;

/**
 * @author zhouyun
 * @description
 * @date 2019/4/4 10:54
 **/
@Data
public class SensorLeakageBO extends DeviceManagerBO {
    private static final long serialVersionUID = -1177530023250164470L;
    /*** 主键ID */
    private Long id;

    /*** 监控器外键ID */
    private Long deviceMonitorId;

    /*** 漏电电流值单位：mA */
    private Float leakageCurrent;

    /*** 设备通道号 */
    private String channelNo;

    /*** 最后通讯时间 */
    private Long lastTime;

}
