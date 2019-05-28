package com.hoolink.sdk.bo.command.nb;

import lombok.Data;

import java.util.List;

/**
 * @author 朱礼
 * @Date 2019/5/8
 * @Desc
 */
@Data
public class NbLightCmdBO {
    /**
     * 设备在电信平台id
     */
    private String deviceId;
    /**
     * 设备mac
     */
    private String mac;
    /**
     * 消息流水号
     */
    private Integer seqNo;
    /**
     * 数据上报周期（单位：second）
     */
    private Integer expireTime;
    /**
     * 起始月
     */
    private Integer startMonth;
    /**
     * 起始日
     * @return
     */
    private Integer startDay;

    /**
     * 策略持续天数
     * @return
     */
    private Integer continueDays;
    /**
     * 调光策略，时分格式：HH:mm-HH:mm-调光值
     */
    private List<String> workTimeList;

}
