package com.hoolink.sdk.bo.mdc;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 朱礼
 * @Date 2019/6/11
 * @Desc
 */
@Data
public class MessageRecordBO implements Serializable {
    private static final long serialVersionUID = 7912602189615197005L;

    /** 消息id */
    private Long id;

    /** 标题 */
    private String content;

    /** 时间 */
    private Long created;

    /** 消息类型id */
    private Long typeId;

    /** 消息类型名称 */
    private String typeName;

    /** 是否已读，true：已读，false：未读 */
    private Boolean readStatus;
}
