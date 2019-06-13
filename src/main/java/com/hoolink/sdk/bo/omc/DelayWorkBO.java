package com.hoolink.sdk.bo.omc;

import lombok.Data;

/**
 * @author chenyuejun
 */
@Data
public class DelayWorkBO extends OperateBO{

    /**
     * 延期时间
     */
    private Long extension;


    /**
     * 延期原因
     */
    private String  reason;
}
