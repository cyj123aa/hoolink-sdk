package com.hoolink.sdk.bo.command;

import lombok.Data;

import java.util.List;

/**
 * @author 朱礼
 * @Date 2019/4/15
 * @Desc
 */
@Data
public class LightPlanWorkBO {
    /**
     * 单灯物理地址
     */
    private String lightMac;
    /**
     * MMddHHmm-MMddHHmm-xx-xx
     * 开始时间-结束时间-调光值-isOff
     * flag：判断结束时间 是否 设置调光为0 true：关灯；false：不关灯
     */
    private List<String> workTimeList;

}
