package com.hoolink.sdk.bo.device.inspection;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.List;

/**
 * @author zhangxin
 * @date 2019/5/30
 */
@Data
public class CreateInspectionPlanBO implements Serializable {

    private static final long serialVersionUID = -4880312050275748424L;

    @NotNull(message = "项目ID不允许为空")
    private Long projectId;

    /*** 名称 */
    private String name;

    /*** 巡检时间，开始时间 */
    @NotNull(message = "请选择巡检时间")
    private LocalTime startTime;

    /*** 巡检时间，结束时间 */
    @NotNull(message = "请选择巡检时间")
    private LocalTime endTime;

    /*** 策略模式 */
    private Byte model;

    /*** 周一到周天的数组 */
    private List<Integer> strategyDates;

    /*** 巡检设备 */
    @NotEmpty(message = "请选择设备")
    private List<Long> deviceIds;

    /*** 描述 */
    private String description;

}
