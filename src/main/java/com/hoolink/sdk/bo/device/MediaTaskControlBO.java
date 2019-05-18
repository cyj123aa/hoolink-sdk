package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName MediaTaskControlBO
 * @Author huyaxi
 * @DATE 2019/5/17 16:40
 */
@Data
public class MediaTaskControlBO implements Serializable {
    /**
     * ID
     * 表字段 : media_task.id
     */
    private Long id;

    /**
     * 清单名称
     * 表字段 : media_task.task_name
     */
    private String taskName;

    /**
     * 清单类型
     * 表字段 : media_task.task_type
     */
    private Byte taskType;


    /**
     * 项目ID
     * 表字段 : media_task.project_id
     */
    private Long projectId;


    /**
     * 删除标志
     * 表字段 : media_task.enabled
     */
    private Boolean enabled;

    /**
     * 冲突时间
     */
    private String conflictTime;

    /**
     * 定时类型：1：每天，2：自定义，3：特殊日期
     * 表字段 : media_task.strategy_type
     */
    private Byte strategyType;

    /**
     * 配置清单播放状态：0 未播放，1，播放
     * 表字段 : media_task.play_status
     */
    private Boolean playStatus;

    /**
     * 定时任务暂停状态：0 暂停，1，启动，默认启动
     * 表字段 : media_task.using_status
     */
    private Boolean usingStatus;


    /**
     * 时间
     */
    private List<String> strategys;

    /**
     * 设备
     */
    private List<MediaTaskConflictDeviceBO> deviceIds;
}
