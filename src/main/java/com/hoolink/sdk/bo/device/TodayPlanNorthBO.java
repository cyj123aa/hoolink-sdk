package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhouyun
 * @date 2019/6/24 17:35
 * @desc
 **/
@Data
public class TodayPlanNorthBO implements Serializable {

    private static final long serialVersionUID = 8482606196004445785L;

    public static final Byte TODAY = (byte)1;
    public static final Byte YESTERDAY = (byte)2;

    /** 计划ID 单灯：策略配置项ID 音响：任务ID 显示屏：配置ID 巡检：巡检计划ID */
    private Long planId;
    /** 设备类型 DeviceTypeEnum枚举 */
    private Long deviceType;
    /** 计划名称 */
    private String planName;
    /** 开始时间 时间戳 */
    private Long startTime;
    /** 设备数量 */
    private Integer deviceNum;
    /** 时长 小时 eg:1.2h */
    private String duration;
    /** 运行状态 (1:已完成 2:正在进行 3:未开始) */
    private Byte runStatus;
    /** 开始时间的标志位 (true:今日 false:昨日) */
    private Boolean isToday;
}
