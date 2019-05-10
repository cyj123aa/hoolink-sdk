package com.hoolink.sdk.bo.device;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/4/29 16:44
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DeviceManagerTypeBO extends DeviceManagerBO implements Serializable {
    private static final long serialVersionUID = 1178684919469229787L;

    /*** 设备类型名称 */
    private String typeName;

    /*** 设备型号名称 */
    private String subTypeName;
}
