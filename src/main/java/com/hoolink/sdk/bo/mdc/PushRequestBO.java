package com.hoolink.sdk.bo.mdc;

import lombok.Data;

import java.util.Collection;

/**
 * @Author: tonghao
 * @Date: 2019/6/17 20:35
 */
@Data
public class PushRequestBO {

    /** 消息内容 */
    private String message;

    /** 推送目标 registerId */
    private Collection<String> jPushList;

    /** 附加字段key */
    private String key;

    /** 附加字段value */
    private String value;

    /** 推送标题 */
    private String title;
}
