package com.hoolink.sdk.bo.device;

import lombok.Data;

/**
 * @ClassName TaskDeviceBO
 * @Author huyaxi
 * @DATE 2019/5/15 13:44
 */
@Data
public class TaskDeviceBO {
    /**
     * ID
     * 表字段 : middle_task_device.id
     */
    private Long id;

    /**
     * 任务ID
     * 表字段 : middle_task_device.task_id
     */
    private Long taskId;

    /**
     * 设备ID
     * 表字段 : middle_task_device.device_id
     */
    private Long deviceId;

}
