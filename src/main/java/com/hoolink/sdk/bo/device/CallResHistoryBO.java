package com.hoolink.sdk.bo.device;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
public class CallResHistoryBO implements Serializable {
    private String poleName;
    /**
     * <pre>
     * 
     * 表字段 : call_res_history.id
     * </pre>
     */
    private Long id;

    /**
     * <pre>
     * 
     * 表字段 : call_res_history.caller_tel
     * </pre>
     */
    private String callerTel;

    /**
     * <pre>
     * 
     * 表字段 : call_res_history.start_time
     * </pre>
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")

    private Date startTime;

    /**
     * <pre>
     * 
     * 表字段 : call_res_history.end_time
     * </pre>
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")

    private Date endTime;

    /**
     * <pre>
     * 上行描述
     * 表字段 : call_res_history.call_desc
     * </pre>
     */
    private String callDesc;

    /**
     * <pre>
     * 
     * 表字段 : call_res_history.call_id
     * </pre>
     */
    private Long callId;

    /**
     * <pre>
     * 
     * 表字段 : call_res_history.pole_id
     * </pre>
     */
    private Long poleId;

    /**
     * <pre>
     * 
     * 表字段 : call_res_history.status
     * </pre>
     */
    private Boolean status;

    /**
     * <pre>
     * 广播时长
     * 表字段 : call_res_history.call_duration
     * </pre>
     */
    private Long callDuration;

    private String durationStr;

    private String callMac;

}