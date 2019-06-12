package com.hoolink.sdk.bo.device;

import com.hoolink.sdk.bo.rpc.PageParamBO;
import lombok.Data;

@Data
public class BroadcastEventHistoryParamBO extends PageParamBO {

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
     * 发起设备麦克风id
     * 表字段 : broadcast_event_history.microphone_id
     */
    private Long microphoneId;

    /**
     * 项目id
     * 表字段 : broadcast_event_history.project_id
     */
    private Long projectId;

}