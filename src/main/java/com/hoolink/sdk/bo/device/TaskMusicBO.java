package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName TaskMusicBO
 * @Author huyaxi
 * @DATE 2019/5/15 13:43
 */
@Data
public class TaskMusicBO implements Serializable {
    /**
     * ID
     * 表字段 : middle_task_music.id
     */
    private Long id;

    /**
     * 媒体任务ID
     * 表字段 : middle_task_music.task_id
     */
    private Long taskId;

    /**
     * 文件ID
     * 表字段 : middle_task_music.music_id
     */
    private Long musicId;

    /**
     * 文件名称
     * 表字段 : middle_task_music.music_name
     */
    private String musicName;

    /**
     * 任务音乐ID
     * 表字段 : middle_task_music.task_music_id
     */
    private Long taskMusicId;

    /**
     * 任务音乐名称
     * 表字段 : middle_task_music.task_music_name
     */
    private String taskMusicName;

    /**
     * 播放顺序
     * 表字段 : middle_task_music.play_order
     */
    private Integer playOrder;

    /**
     * <pre>
     * 迈可行文件路径
     * 表字段 : ability_music.micro_file_path
     * </pre>
     */
    private String microFilePath;

    /**
     * <pre>
     * 音乐文件的时长 单位为秒
     * 表字段 : ability_music.file_time
     * </pre>
     */
    private Integer fileTime;
}
