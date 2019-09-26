package com.hoolink.sdk.bo.command;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 朱礼
 * @Date 2019/4/15
 * @Desc
 */
@Data
public final class CmdUplinkParamBO implements Serializable {
    private static final long serialVersionUID = -6620300937429180093L;
    /**
     * 协议报文
     */
    private byte[] bytes;
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
