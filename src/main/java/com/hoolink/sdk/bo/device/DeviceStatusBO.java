package com.hoolink.sdk.bo.device;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author <a herf="mailto:yanwu0527@163.com">XuBaofeng</a>
 * @date 2019-06-12 10:24.
 * <p>
 * description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeviceStatusBO implements Serializable {
    private static final long serialVersionUID = 1747580323952075416L;

    /*** 设备ID */
    private Long deviceId;

    /*** 告警状态 */
    private Boolean alarmStatus;

    /*** 事件状态 */
    private Boolean eventStatus;

    /*** 在线状态 */
    private Boolean onlineStatus;

}
