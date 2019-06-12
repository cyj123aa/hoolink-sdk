package com.hoolink.sdk.bo.mdc;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author 朱礼
 * @Date 2019/6/11
 * @Desc
 */
@Data
public class MessageTypeBO implements Serializable {
    private static final long serialVersionUID = 1009580284419624778L;

    /** 消息类型名称 */
    private String typeName;

    /** 消息子类型列表 */
    private List<MessageSubTypeBO> messageSubTypeBOList;
}
