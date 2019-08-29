package com.hoolink.sdk.bo.datacenter;

import java.time.LocalDate;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-08-29 19:23
 * @Description
 */
@Data
public class DeviceAlarmBO {

    private Long projectId;
    private LocalDate countDate;
    private Long alarmNum;
    private Long creator;
    private Long created;
}
