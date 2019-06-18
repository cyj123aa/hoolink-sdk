package com.hoolink.sdk.bo.mdc;

import lombok.Data;

/**
 * @Author: tonghao
 * @Date: 2019/6/15 13:35
 */
@Data
public class BatchSendSmsRequestBO {

    /** 接收者手机号 */
    private String receiver;

    /** 模板id */
    private String templateId;

    /** 模板参数 */
    private String templateParas;
}
