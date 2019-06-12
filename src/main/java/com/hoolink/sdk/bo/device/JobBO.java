package com.hoolink.sdk.bo.device;

import lombok.Data;

/**
 * @author huyaxi
 */
@Data
public class JobBO {
    /**
     * 事件类型
     */
    private String job_type;
    private String trigger_type;
    /**
     * 具体事件
     */
    private String job_status;
    /**
     * 事件ID
     */
    private String event_id;
    /**
     * 序列号，唯一标识
     */
    private String sequence_id;
    /**
     * 时间
     */
    private String datetime;
    private Long id;
    /**
     * 产品序列号
     */
    private String sn;
    private String name;
    private String telephone;
    private String ip;
    private Call caller;
    private Call callee;
}
