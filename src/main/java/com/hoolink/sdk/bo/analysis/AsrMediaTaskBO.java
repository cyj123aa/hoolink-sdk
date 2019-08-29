package com.hoolink.sdk.bo.analysis;

import lombok.Data;

@Data
public class AsrMediaTaskBO {
    /**
     * 项目表外键
     * 表字段 : screen_play_config.project_id
     */
    private Long projectId;

    /**
     * 清单名称
     * 表字段 : media_task.task_name
     */
    private String taskName;
}
