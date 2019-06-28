package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName DeviceMqDataBO
 * @Author huyaxi
 * @DATE 2019/6/28 17:39
 */
@Data
public class DeviceMqDataBO implements Serializable {
    private Long deviceId;
    private Long deviceSubTypeId;
    private Integer deviceStatus;
}
