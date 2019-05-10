package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/4/26 15:31
 */
@Data
public class DeviceNameAndNoBO implements Serializable {
    private static final long serialVersionUID = -2921847464575503942L;

    /*** 设备主键ID */
    private Long id;

    /*** 设备编号 */
    private String deviceNo;

    /*** 设备名称 */
    private String deviceName;
}
