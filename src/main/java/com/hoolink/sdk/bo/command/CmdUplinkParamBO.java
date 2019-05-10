package com.hoolink.sdk.bo.command;

import lombok.Data;

/**
 * @author 朱礼
 * @Date 2019/4/15
 * @Desc
 */
@Data
public class CmdUplinkParamBO {
    /**
     * 协议报文
     */
    private Byte[] bytes;
    /**
     * 通道号
     */
    private String ctxId;
    /**
     * 端口
     */
    private String port;
    /**
     * 是否移除本地通道
     */
    private Boolean remove;
    private String txId;
}
