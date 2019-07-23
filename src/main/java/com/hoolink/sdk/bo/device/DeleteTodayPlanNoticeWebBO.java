package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.util.List;

/**
 * @author zhouyun
 * @date 2019/6/24 15:35
 * @desc
 **/
@Data
public class DeleteTodayPlanNoticeWebBO {

    /** 设备类型 DeviceTypeEnum枚举 */
    private Long deviceType;

    /** 计划ID列表 */
    private List<Long> planIdList;
}
