package com.hoolink.sdk.bo.sms;


import lombok.Data;

/**
 * @Author: tonghao
 * @Date: 2019/6/15 13:41
 */
@Data
public class BatchPublishSmsMessageResultBO {

    /** 短信唯一标识 */
    private String messageId;
    /** 手机号码 */
    private String endpoint;
    /** 错误码 */
    private String code;
    /** 错误提示信息 */
    private String message;
}
