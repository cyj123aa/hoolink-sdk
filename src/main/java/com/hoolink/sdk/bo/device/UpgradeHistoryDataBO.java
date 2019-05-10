package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: tonghao
 * @Date: 2019/4/26 16:22
 */
@Data
public class UpgradeHistoryDataBO implements Serializable {

    /** 项目列表 */
    private List<DeviceUpgradeHistorySearchBarBO> projectList;

    /** 设备类型列表 */
    private List<DeviceUpgradeHistorySearchBarBO> deviceTypeList;

    /** 设备型号列表 */
    private List<DeviceUpgradeHistorySearchBarBO> deviceSubTypeList;

    /** 固件版本列表 */
    private List<DeviceUpgradeHistorySearchBarBO> versionList;
}
