package com.hoolink.sdk.bo.command;

import lombok.Data;

import java.util.List;

/**
 * @author  by zhujt on 2018/1/9.
 * 显示屏的播放序号参数封装
 */
@Data
public class SendPlayCmdParamBO {
    /**
     * 清单序号 1-100
     */
    private Integer playNo;
    /**
     * 通道集合
     */
    private List<String> channelList;

    /*** 亮度 */
    private Integer brightness;
}
