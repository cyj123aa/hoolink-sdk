package com.hoolink.sdk.bo.alarm;

import com.hoolink.sdk.bo.base.UserBO;
import com.hoolink.sdk.bo.device.DeviceManagerBO;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 设备相关的数据
 *
 * @author zhangxin
 * @date 2019/6/11
 */
@Data
public class DeviceCorrelationData implements Serializable {

    private static final long serialVersionUID = 6001577736807323628L;

    /*** 设备信息 */
    private DeviceManagerBO deviceManager;

    /*** 设备信息 */
    private List<DeviceManagerBO> deviceManagers;

    /*** 用户信息 */
    private List<UserBO> users;

    /*** 当前时间 */
    private Long currentTime;
}
