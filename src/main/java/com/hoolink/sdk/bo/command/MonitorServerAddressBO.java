package com.hoolink.sdk.bo.command;

import lombok.Data;

import java.util.List;

/**
 * @author zhouyun
 * @date 2019/4/26 13:25
 * @desc
 **/
@Data
public class MonitorServerAddressBO {

    /**
     * 监控器MAC列表
     */
    private List<String> macList;
    /**
     * 远程服务器IP
     */
    private String serverIp;
    /**
     * 远程服务器端口
     */
    private String serverPort;
}
