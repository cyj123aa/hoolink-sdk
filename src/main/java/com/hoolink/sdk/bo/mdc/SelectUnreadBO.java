package com.hoolink.sdk.bo.mdc;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 朱礼
 * @Date 2019/6/18
 * @Desc
 */
@Data
public class SelectUnreadBO implements Serializable {
    private static final long serialVersionUID = -6012809950638927769L;

    /** 消息类型id */
    private Long typeId;

    /** 数量 */
    private Integer count;
}
