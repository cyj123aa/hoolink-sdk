package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: tonghao
 * @Date: 2019/4/26 16:27
 */
@Data
public class DeviceUpgradeHistorySearchBarBO implements Serializable {

    private static final long serialVersionUID = -5238012063578537383L;

    /** 类型id （包括公司、项目、设备类型、设备型号、固件版本） */
    private Long id;

    /**类型名称 */
    private String name;
}

