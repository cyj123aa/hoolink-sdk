package com.hoolink.sdk.bo.mdc;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 朱礼
 * @Date 2019/6/13
 * @Desc
 */
@Data
public class UnreadMsgCountBO implements Serializable {

    private static final long serialVersionUID = 4618321525246192483L;
    /** 消息未读数量 */
    private Integer unreadCount;
}
