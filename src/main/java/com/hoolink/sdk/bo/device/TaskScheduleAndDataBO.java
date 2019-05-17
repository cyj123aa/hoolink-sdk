package com.hoolink.sdk.bo.device;

import lombok.Data;

/**
 * @ClassName TaskScheduleAndDataBO
 * @Author huyaxi
 * @DATE 2019/5/16 14:51
 */
@Data
public class TaskScheduleAndDataBO {
    private TaskScheduleBO job;
    private MediaTaskBO jobData;
}
