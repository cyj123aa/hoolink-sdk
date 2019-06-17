package com.hoolink.sdk.bo.sms;

import lombok.Data;

/**
 * @Author: tonghao
 * @Date: 2019/6/15 13:35
 */
@Data
public class SmsPublishMessageBO {

    /** 手机号 */
    private String endpoint;
    /** 短信内容 */
    private String message;
    /** 签名id */
    private String signId;
}
