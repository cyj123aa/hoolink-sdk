package com.hoolink.sdk.bo.device.inspection;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author zhangxin
 * @date 2019/6/1
 */
@Data
public class InspectionTaskBO implements Serializable {

    private static final long serialVersionUID = 1023965217960276602L;

    /*** 巡检计划ID */
    private Long inspectionPlanId;
    /*** 设备ID */
    private Long deviceId;
    /*** 起始时间 */
    private LocalTime startTime;
    /*** 结束时间 */
    private LocalTime endTime;
    /*** 巡检任务日期 */
    private LocalDate taskDate;
    /*** 巡检完成 */
    private Boolean complete;
}
