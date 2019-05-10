package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/4/30 11:55
 */
@Data
public class DevicePullDownReturnBO implements Serializable {
    private static final long serialVersionUID = -8071458678659471704L;

    /*** 设备主键ID */
    private Long id;

    /*** 设备编号 */
    private String deviceNo;

    /*** 设备名称 */
    private String deviceName;
}
