package com.hoolink.sdk.bo.device;


import com.hoolink.sdk.bo.rpc.PageParamBO;
import lombok.Data;

import java.io.Serializable;

@Data
public class CallResHistoryParamBO extends PageParamBO implements Serializable {

    /**
     * 事件所属项目id
     * 表字段 : device_call_res_history.project_id
     */
    private Long projectId;

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
     * ip广播的物理地址
     * 表字段 : device_call_res_history.microphone_mac
     */
    private String microphoneMac;

    /**
     * 一键呼叫的物理地址
     * 表字段 : device_call_res_history.call_mac
     */
    private String callMac;

}