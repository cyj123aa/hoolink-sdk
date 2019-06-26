package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName TaskScheduleAndDataBO
 * @Author huyaxi
 * @DATE 2019/5/16 14:51
 */
@Data
public class TaskScheduleAndDataBO<T> implements Serializable {
    private TaskScheduleBO job;
    private JobData<T> jobData;
}
