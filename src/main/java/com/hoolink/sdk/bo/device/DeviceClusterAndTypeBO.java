package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author wangdong
 * @date 2019/4/17 17:44
 */
@Data
public class DeviceClusterAndTypeBO implements Serializable {
    private static final long serialVersionUID = 8103431401697756607L;

    /*** 设备种类列表 */
    private List<ProjectDeviceClusterBO> deviceClusters;

    /*** 设备类型列表 */
    private List<ProjectDeviceTypeBO> deviceTypes;

    /*** 设备型号列表 */
    private List<ProjectDeviceSubTypeBO> deviceSubTypes;
}
