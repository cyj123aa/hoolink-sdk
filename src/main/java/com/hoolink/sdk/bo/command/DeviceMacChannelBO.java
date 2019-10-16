package com.hoolink.sdk.bo.command;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wangdong
 */
@Data
public class DeviceMacChannelBO implements Serializable {
    private static final long serialVersionUID = 3378749881370821475L;

    /*** 物理地址 */
    private String mac;

    /*** 通道号 */
    private String channelNo;
}
