package com.hoolink.sdk.bo.alarm;

import com.hoolink.sdk.enums.DeviceTypeEnum;
import com.hoolink.sdk.enums.alarm.ItemEnum;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author <a herf="mailto:yanwu0527@163.com">XuBaofeng</a>
 * @date 2019-06-12 17:01.
 * <p>
 * description:
 */
@Data
public class MonitorAlarmBO implements Serializable {
    private static final long serialVersionUID = -3472528647490748135L;

    /*** 设备ID */
    private Long deviceId;

    /*** 设备名称 */
    private String deviceName;

    /*** 当前阈值项 */
    private ItemEnum item;

    /*** 设备类型 */
    private DeviceTypeEnum type;

    /*** 当前值 */
    private Double value;

    /*** 产生\恢复 */
    private Boolean status;

    /*** 告警时间 */
    private Date alarmTime;

}
