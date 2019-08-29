package com.hoolink.sdk.bo.analysis;

import lombok.Data;

@Data
public class ArsLightBO {
    /**
     * 项目表外键
     * 表字段 : screen_play_config.project_id
     */
    private Long projectId;

    /*** 设备名称 */
    private String deviceName;
}
