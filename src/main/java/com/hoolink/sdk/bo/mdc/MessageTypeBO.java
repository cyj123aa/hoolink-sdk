package com.hoolink.sdk.bo.mdc;

import lombok.Data;

/**
 * @author 朱礼
 * @Date 2019/6/10
 * @Desc
 */
@Data
public class MessageTypeBO {
    /** 消息类型id */
    private Long typeId;

    /** 消息类型名称 */
    private String typeName;

    /** 消息子类型id */
    private Long subTypeId;

    /** 消息子类型名称 */
    private String subTypeName;

}
