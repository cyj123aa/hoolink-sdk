package com.hoolink.sdk.bo.command;

import lombok.Data;

import java.util.List;

/**
 * @author 朱礼
 * @Date 2019/4/18
 * @Desc 显示屏亮度封装
 */
@Data
public class BrightnessCmdParamBO {

    /**
     * 亮度
     */
    private Integer brightness;
    /**
     * 通道集合
     */
    private List<String> channelList;
}
