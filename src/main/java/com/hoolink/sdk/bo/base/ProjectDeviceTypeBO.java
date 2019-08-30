package com.hoolink.sdk.bo.base;

import lombok.Data;

/**
 * @author chenzhixiong
 * @date 2019/8/9 17:51
 */
@Data
public class ProjectDeviceTypeBO {

    /**
     *设备型号ID
     */
    private  Long  deviceSubTypeId;

    private String deviceSubTypeName;

    private Long  deviceClusterId;

    private String deviceClusterName;

    /**
     *维保年限
     */
    private Integer maintainTime;
}
