package com.hoolink.sdk.bo.command.nb;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/6/11 19:16
 */
@Data
public class NbRegisterBO implements Serializable {
    private static final long serialVersionUID = 1246848440182658585L;

    private String verifyCode;

    private String factoryName;

    private String deviceTypeName;

    private String deviceSubTypeName;

    private String deviceName;
}
