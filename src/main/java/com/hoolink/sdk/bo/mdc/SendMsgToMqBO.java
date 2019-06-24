package com.hoolink.sdk.bo.mdc;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 朱礼
 * @Date 2019/6/13
 * @Desc
 */
@Data
public class SendMsgToMqBO extends MessageUnreadBO implements Serializable {
    private static final long serialVersionUID = 2363170208014517233L;

    /** 消息id */
    private Long id;

    /** 消息标题 */
    private String content;

    /** 消息类型id */
    private Long typeId;

    /** 项目id */
    private Long projectId;

    /** 项目名称 */
    private String projectName;

    /** 工单id */
    private Long orderId;

    /** 消息总数 */
    private Integer total;

    /** 用户id */
    private Long userId;
}
