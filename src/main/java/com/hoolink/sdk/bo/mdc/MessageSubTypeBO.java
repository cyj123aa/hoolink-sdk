package com.hoolink.sdk.bo.mdc;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 朱礼
 * @Date 2019/6/11
 * @Desc
 */
@Data
public class MessageSubTypeBO implements Serializable {
    private static final long serialVersionUID = -5364083926374998349L;

    /** 消息子类型id */
    private Long id;

    /** 消息子类型名称 */
    private String subTypeName;

    /** 消息中心是否订阅， true：是，false：否 */
    private Boolean msgChecked;

    /** 短信是否订阅， true：是，false：否 */
    private Boolean smsChecked;
}
