package com.hoolink.sdk.bo.device;

import lombok.Data;

/**
 * @author chenzhixiong
 * @date 2019/4/24 13:12
 */
@Data
public class DeviceModelBO {

    /**
     * 设备种类
     */
    private ClusterTypeLevelBO clusterTypeLevel;
    /**
     * 设备类型
     */
    private DeviceTypeLevelBO  deviceTypeLevel;
    /**
     * 子设备类型
     */
    private DeviceSubTypeLevelBO subTypeLevel;
}
