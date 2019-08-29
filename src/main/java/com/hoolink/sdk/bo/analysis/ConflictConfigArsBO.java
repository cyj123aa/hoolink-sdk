package com.hoolink.sdk.bo.analysis;

import lombok.Data;

/**
 * @author chenyuejun
 * @descripption
 * @date 2019/8/28 &{TIME}
 */
@Data
public class ConflictConfigArsBO {
    /**
     * 显示屏配置主键id
     * 表字段 : screen_play_config.id
     */
    private Long id;

    /**
     * 显示屏播放清单的名字
     * 表字段 : screen_play_config.screen_config_name
     */
    private String screenConfigName;


    /**
     * 播放状态：1：正在播放， 2：停止
     * 表字段 : screen_play_config.play_status
     */
    private Integer playStatus;


    /**
     * 清单亮度
     * 表字段 : screen_play_config.brightness
     */
    private Integer brightness;


}
