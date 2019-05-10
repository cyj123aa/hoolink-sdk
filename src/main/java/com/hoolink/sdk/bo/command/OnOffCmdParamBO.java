package com.hoolink.sdk.bo.command;

import lombok.Data;

import java.util.List;

/**
 * @author zhujt
 * @date 2018/1/9.
 * @desc 显示屏开关屏命令封装
 */
@Data
public class OnOffCmdParamBO {
    /**
     * true 开 false 关
     */
    private Boolean onOff;
    /**
     * 通道集合
     */
    private List<String> channelList;
}
