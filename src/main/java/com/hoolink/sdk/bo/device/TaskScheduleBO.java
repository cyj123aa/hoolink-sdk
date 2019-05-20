package com.hoolink.sdk.bo.device;

import lombok.Data;

/**
 * @ClassName TaskScheduleBO
 * @Author huyaxi
 * @DATE 2019/5/16 14:51
 */
@Data
public class TaskScheduleBO {
    /**
     * ID
     * 表字段 : middle_task_schedule.id
     */
    private Long id;

    /**
     * 执行任务的类名称
     * 表字段 : middle_task_schedule.class_name
     */
    private String className;

    /**
     * 定时任务表达式
     * 表字段 : middle_task_schedule.cron_expression
     */
    private String cronExpression;

    /**
     * 任务名称
     * 表字段 : middle_task_schedule.job_name
     */
    private String jobName;

    /**
     * 任务分组
     * 表字段 : middle_task_schedule.job_group
     */
    private String jobGroup;

    /**
     * 触发器名称
     * 表字段 : middle_task_schedule.trigger_name
     */
    private String triggerName;

    /**
     * 触发器分组
     * 表字段 : middle_task_schedule.trigger_group
     */
    private String triggerGroup;

    /**
     * 暂停标志
     * 表字段 : middle_task_schedule.pause
     */
    private Boolean pause;

    /**
     * 删除标志
     * 表字段 : middle_task_schedule.enabled
     */
    private Boolean enabled;

    /**
     * 任务描述
     * 表字段 : middle_task_schedule.description
     */
    private String description;

    /**
     * 创建时间
     * 表字段 : middle_task_schedule.create_time
     */
    private Long createTime;

    /**
     * 最后一次更新时间
     * 表字段 : middle_task_schedule.last_update_time
     */
    private Long lastUpdateTime;

    /**
     * 媒体任务ID
     * 表字段 : middle_task_schedule.task_id
     */
    private Long taskId;
}
