package com.hoolink.sdk.bo.alarm;

import com.hoolink.sdk.enums.DeviceTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author <a herf="mailto:yanwu0527@163.com">XuBaofeng</a>
 * @date 2019-06-12 11:34.
 * <p>
 * description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MonitorNodeBO implements Serializable {
    private static final long serialVersionUID = 590800442464938944L;

    /*** 所属监控器ID */
    private Long monitorId;

    /*** 项目ID */
    private Long projectId;

    /*** 设备ID */
    private Long deviceId;

    /*** 设备名称 */
    private String deviceName;

    /*** 设备名称 */
    private String deviceAddress;

    /*** 告警时间 */
    private Long alarmTime;

    /*** 设备类型 */
    private DeviceTypeEnum deviceType;

}
