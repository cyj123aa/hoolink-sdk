package com.hoolink.sdk.bo.device.req;

import com.hoolink.sdk.bo.manager.DeviceUpgradeBO;
import lombok.Data;

import java.util.List;

/**
 * @author : chenzb
 * @Description : TODO
 * @date : Created on 2019/5/8 15:23
 */
@Data
public class DeviceFirmwarUpgradeBO {

    /*** 升级目标版本 */
    private String dstVersion;

    /*** 升级类型 0 高版本升级 1 强制升级 */
    private Byte type;

    /**** 设备型号id */
    private Long deviceSubTypeId;

    /*** 升级设备 */
    private List<DeviceUpgradeBO> deviceUpgradeBOList;

    /*** 升级包 */
    private Byte[] files;
}
