package com.hoolink.sdk.bo.device;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName TaskScheduleAndDataBO
 * @Author huyaxi
 * @DATE 2019/5/16 14:51
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskScheduleAndDataBO<T> implements Serializable {

    private static final long serialVersionUID = 8670818520966777664L;

    private TaskScheduleBO job;
    private JobData<T> jobData;
}
