package com.hoolink.sdk.bo.device;


import lombok.Data;

import java.io.Serializable;

@Data
public class CallResHistoryBO implements Serializable {
    /**
     * 主键id
     * 表字段 : device_call_res_history.id
     */
    private Long id;

    /**
     * 开始时间
     * 表字段 : device_call_res_history.start_time
     */
    private Long startTime;

    /**
     * 结束时间
     * 表字段 : device_call_res_history.end_time
     */
    private Long endTime;

    /**
     * 状态
     * 表字段 : device_call_res_history.history_status
     */
    private Byte historyStatus;

    /**
     * 当前事件的事件ID
     * 表字段 : device_call_res_history.sequence_id
     */
    private String sequenceId;

    /**
     * 事件所属项目id
     * 表字段 : device_call_res_history.project_id
     */
    private Long projectId;

    /**
     * 音频对像id
     * 表字段 : device_call_res_history.voice_obs_id
     */
    private Long voiceObsId;

    /**
     * 视频对象id
     * 表字段 : device_call_res_history.video_obs_id
     */
    private Long videoObsId;

    /**
     * ip广播的物理地址
     * 表字段 : device_call_res_history.microphone_mac
     */
    private String microphoneMac;

    /**
     * 一键呼叫的物理地址
     * 表字段 : device_call_res_history.call_mac
     */
    private String callMac;

    /**
     * 创建时间
     * 表字段 : device_call_res_history.created
     */
    private Long created;

    private String file;

}