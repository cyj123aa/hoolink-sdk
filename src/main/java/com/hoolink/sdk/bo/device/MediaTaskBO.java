package com.hoolink.sdk.bo.device;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalTimeSerializer;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.List;

/**
 * @ClassName MediaTaskBO
 * @Author huyaxi
 * @DATE 2019/5/14 20:31
 */
@Data
public class MediaTaskBO implements Serializable {

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
     * 清单描述
     * 表字段 : media_task.task_description
     */
    private String taskDescription;

    /**
     * 清单类型
     * 表字段 : media_task.task_type
     */
    private Byte taskType;

    /**
     * 播放模式：可以取一下值。2：循环播放，3：随机播放，1：或其他则表示顺序播放，只播一次。
     * 表字段 : media_task.play_mode
     */
    private Byte playMode;

    /**
     * 播放时长：取值单位为秒，0表为无效值，其他大于数字表播放的秒数。-1表示永久播放，当设置为-1时，如果选的播放模式不是循环播放的话这是媒体播放完则停止
     * 表字段 : media_task.task_duration
     */
    private Integer taskDuration;

    /**
     * 项目ID
     * 表字段 : media_task.project_id
     */
    private Long projectId;

    /**
     * 媒体音量
     * 表字段 : media_task.task_vol
     */
    private Integer taskVol;

    /**
     * 删除标志
     * 表字段 : media_task.enabled
     */
    private Boolean enabled;

    /**
     * 开始时间
     * 表字段 : media_task.start_time
     */

    @JsonDeserialize(using = LocalTimeDeserializer.class)
    @JsonSerialize(using = LocalTimeSerializer.class)
    private LocalTime startTime;

    /**
     * 结束时间
     * 表字段 : media_task.end_time
     */
    @JsonDeserialize(using = LocalTimeDeserializer.class)
    @JsonSerialize(using = LocalTimeSerializer.class)
    private LocalTime endTime;

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
     * 三方任务ID
     * 表字段 : media_task.random
     */
    private String random;

    /**
     * 创建时间
     * 表字段 : media_task.created
     */
    private Long created;

    /**
     * 创建时间
     * 表字段 : media_task.play_time
     */
    private Long playTime;

    /**
     * 执行时间，此字段只在通过项目查询任务清单排序的时候使用
     */
    private Long runTime;

    /**
     * 迈可行广播室ID
     * 表字段 : media_task.room_id
     */
    private String roomId;

    /**
     * 策略列表：周或者日期
     */
    private List<TaskStrategyBO> strategys;

    /**
     * 播放清单音乐资源
     */
    private List<TaskMusicBO> musics;

    /**
     * 播放清单设备资源
     */
    private List<TaskDeviceBO> devices;

    /**
     * 创建人
     */
    private Long creator;
}
