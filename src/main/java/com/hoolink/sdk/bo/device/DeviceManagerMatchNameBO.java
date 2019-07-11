package com.hoolink.sdk.bo.device;

import java.io.Serializable;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-07-11 11:26
 * @Description
 */
@Data
public class DeviceManagerMatchNameBO implements Serializable {
    private Long id;
    private String deviceName;
}
