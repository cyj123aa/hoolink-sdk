package com.hoolink.sdk.bo.analysis;

import lombok.Data;

@Data
public class AsrScreenPlayConfigBO {
    /**
     * 显示屏播放清单的名字
     * 表字段 : screen_play_config.screen_config_name
     */
    private String screenConfigName;

    /**
     * 项目表外键
     * 表字段 : screen_play_config.project_id
     */
    private Long projectId;
}
