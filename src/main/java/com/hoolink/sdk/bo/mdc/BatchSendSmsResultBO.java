package com.hoolink.sdk.bo.mdc;


import lombok.Data;

/**
 * @Author: tonghao
 * @Date: 2019/6/15 13:41
 */
@Data
public class BatchSendSmsResultBO {

    /** 手机号码 */
    private String originTo;
    /** 状态码 */
    private String status;
    /** 短信唯一id */
    private String smsMsgId;
}
