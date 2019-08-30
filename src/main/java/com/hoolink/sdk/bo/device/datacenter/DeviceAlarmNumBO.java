package com.hoolink.sdk.bo.device.datacenter;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-08-27 17:39
 * @Description
 */
@Data
public class DeviceAlarmNumBO implements Serializable {

    private Long alarmNum;
    private LocalDate countDate;
}
