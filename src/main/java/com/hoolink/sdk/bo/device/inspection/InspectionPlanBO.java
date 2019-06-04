package com.hoolink.sdk.bo.device.inspection;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalTimeSerializer;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.List;

/**
 * @author zhangxin
 * @date 2019/5/29
 */
@Data
public class InspectionPlanBO implements Serializable {

    private static final long serialVersionUID = 3684740511095199492L;

    private Long id;
    /*** 项目ID */
    private Long projectId;
    /*** 计划名称 */
    private String name;
    /*** 描述 */
    private String description;
    /*** 开始时间 */
    @JsonSerialize(using = LocalTimeSerializer.class)
    @JsonDeserialize(using = LocalTimeDeserializer.class)
    private LocalTime startTime;
    /*** 结束时间 */
    @JsonSerialize(using = LocalTimeSerializer.class)
    @JsonDeserialize(using = LocalTimeDeserializer.class)
    private LocalTime endTime;
    /*** 启用状态 */
    private Boolean usingStatus;
    /*** 生效状态，不生效的第二天会通过定时任务生效 */
    private Boolean effectiveStatus;
    /*** 设备IDs */
    private List<Long> deviceIds;
    /*** 策略模式 */
    private Byte model;
    /*** 策略时间 */
    private List<Integer> strategyDates;
}
