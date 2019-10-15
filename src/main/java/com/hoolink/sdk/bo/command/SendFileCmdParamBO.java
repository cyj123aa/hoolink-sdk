package com.hoolink.sdk.bo.command;

import lombok.Data;

import java.util.List;

/**
 * @author  by zhujt on 2018/1/9.
 * 显示屏文件下发参数封装
 */
@Data
public class SendFileCmdParamBO {
    /**
     * 配置清单id
     */
    private Long configId;
    /**
     * 通道集合
     */
    private List<String> channelList;
    /**
     * 发送的文件list
     */
    private List<SendFileCmdBO> sendFileCmdBOS;

    /**
     * mac和通道号对应关系
     */
    private List<DeviceMacChannelBO> deviceMacChannelList;

}
