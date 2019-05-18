package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.util.List;

/**
 * @author zhouyun
 * @date 2019/5/18 13:53
 * @desc 音响的任务列表
 **/
@Data
public class SoundBoxMediaTaskBO {
    /**
     * 正在播放的任务列表
     */
    private List<MediaTaskBO> playingTaskList;
    /**
     * 未播放的任务列表
     */
    private List<MediaTaskBO> noPlayingTaskList;
}
