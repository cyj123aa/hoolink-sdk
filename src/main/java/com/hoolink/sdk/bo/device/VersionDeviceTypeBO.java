package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/4/23 16:04
 */
@Data
public class VersionDeviceTypeBO implements Serializable {
    private static final long serialVersionUID = 541991020828541303L;

    /*** 设备型号ID */
    private Long id;

    /*** 设备类型名称 */
    private String typeName;

    /*** 设备型号名称 */
    private String subTypeName;
}
