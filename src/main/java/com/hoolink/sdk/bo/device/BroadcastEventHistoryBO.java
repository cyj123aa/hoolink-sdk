package com.hoolink.sdk.bo.device;

import lombok.Data;

@Data
public class BroadcastEventHistoryBO {
    /**
     * 广播事件记录Id
     * 表字段 : broadcast_event_history.id
     */
    private Long id;

    /**
     * 广播事件名称
     * 表字段 : broadcast_event_history.event_name
     */
    private String eventName;

    /**
     * 广播组id
     * 表字段 : broadcast_event_history.broadcast_group_id
     */
    private Long broadcastGroupId;

    /**
     * 广播发起时间
     * 表字段 : broadcast_event_history.begin_time
     */
    private Long beginTime;

    /**
     * 广播结束时间
     * 表字段 : broadcast_event_history.end_time
     */
    private Long endTime;

    /**
     * 发起人
     * 表字段 : broadcast_event_history.creator
     */
    private Long creator;

    /**
     * 是否启用(1:启用, 0:禁用)
     * 表字段 : broadcast_event_history.enabled
     */
    private Boolean enabled;

    /**
     * 发起设备麦克风Mac
     * 表字段 : broadcast_event_history.microphone_mac
     */
    private String microphoneMac;

    /**
     * 接收设备id串(broadcastId),格式:1,2,3
     * 表字段 : broadcast_event_history.broadcast_ids
     */
    private String broadcastIds;

    /**
     * 项目id
     * 表字段 : broadcast_event_history.project_id
     */
    private Long projectId;

    /**
     * 唯一会话ID
     * 表字段 : broadcast_event_history.sequence_id
     */
    private String sequenceId;

    /**
     * 0表示失败，1表示成功
     * 表字段 : broadcast_event_history.run_status
     */
    private Boolean runStatus;

    /**
     * obsId
     * 表字段 : broadcast_event_history.obs_id
     */
    private Long obsId;

}