package com.hoolink.sdk.bo.command;

import lombok.Data;

import java.util.List;
/**
 * @author zhujt on 2018/1/9.
 * 命令通道下发的基类
 */
@Data
public class IdsBaseParam {
    /**
     * 通道集合
     */
    private List<String> channelList;

}
