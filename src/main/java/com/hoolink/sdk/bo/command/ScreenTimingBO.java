package com.hoolink.sdk.bo.command;

import lombok.Data;

import java.util.List;

/**
 * @author zhuli
 * @date 2018/12/29
 * @desc
 */
@Data
public class ScreenTimingBO {
    /**
     * 设备编号
     */
    private String screenNo;
    /**
     * 通道号
     */
    private String channelNo;
    /**
     * 时间段,年月日时分,格式：201812051300-201812051400
     */
    private List<ScreenTimingWorkBO> screenTimingWorkBOList;

}
