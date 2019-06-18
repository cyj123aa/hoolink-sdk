package com.hoolink.sdk.bo.mdc;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 朱礼
 * @Date 2019/6/11
 * @Desc
 */
@Data
public class MessageUnreadBO implements Serializable {
    private static final long serialVersionUID = 2441068134979434387L;

    /** 未读消息总数 */
    private Integer totalCount;

    /** 设备故障消息未读数量 */
    private Integer faultCount;

    /** 阈值告警消息未读数量 */
    private Integer boundCount;

    /** 工单消息未读数量 */
    private Integer orderCount;

    /** 事件消息未读数量 */
    private Integer eventCount;

    /** 公告消息未读数量 */
    private Integer announceCount;

    /** 提醒消息未读数量 */
    private Integer remindCount;
}
