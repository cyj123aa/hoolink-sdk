package com.hoolink.sdk.bo.device;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author zhouyun
 * @date 2019/6/18 14:33
 * @desc
 **/
@Data
public class TodayPlanBO implements Serializable {

    private static final long serialVersionUID = 712550341806033316L;
    /** 运行状态已完成常量 */
    public static final Byte END = (byte)1;
    /** 运行状态正在进行常量 */
    public static final Byte STARTING = (byte)2;
    /** 运行状态未开始常量 */
    public static final Byte NON_START = (byte)3;

    /** 计划ID 单灯：策略配置项ID 音响：任务ID 显示屏：配置ID 巡检：巡检计划ID */
    private Long planId;

    /** 设备类型 DeviceTypeEnum枚举 */
    private Long deviceTypeId;

    /** 计划名称 */
    private String planName;

    /** 设备数量 */
    private Integer deviceNum;

    /** 定时开始时间 */
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime startDateTime;

    /** 定时结束时间 */
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime endDateTime;

    /** 运行状态 (1:已完成 2:正在进行 3:未开始) */
    private Byte runStatus;
}
