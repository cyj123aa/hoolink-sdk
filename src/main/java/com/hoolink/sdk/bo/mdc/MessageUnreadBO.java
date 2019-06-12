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

    /** 消息类型id */
    private Long typeId;

    /** 数量 */
    private Integer count;
}
