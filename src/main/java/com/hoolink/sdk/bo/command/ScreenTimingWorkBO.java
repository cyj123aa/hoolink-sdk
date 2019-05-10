package com.hoolink.sdk.bo.command;

import lombok.Data;

import java.util.List;

/**
 * @author zhuli
 * @date 2018/12/29
 * @desc
 */
@Data
public class ScreenTimingWorkBO {

    /**
     * 时间段,年月日时分,格式：201812051300-201812051400
     */
    private String workingTime;
    /**
     * 亮度
     */
    private Integer brightness;
    /**
     * 播放列表号
     */
    private List<Integer> playIndex;
}
