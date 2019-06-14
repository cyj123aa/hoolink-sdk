package com.hoolink.sdk.bo.mdc;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 朱礼
 * @Date 2019/6/10
 * @Desc
 */
@Data
public class SelectMessageTypeBO implements Serializable {
    private static final long serialVersionUID = 3676507451874346473L;
    /** 消息类型id */
    private Long typeId;

    /** 消息类型名称 */
    private String typeName;

    /** 消息子类型id */
    private Long subTypeId;

    /** 消息子类型名称 */
    private String subTypeName;

}