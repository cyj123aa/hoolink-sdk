package com.hoolink.sdk.bo.device;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author zhouyun
 * @date 2019/6/25 13:13
 * @desc
 **/
@Data
public class TodayPlanHistoryBO implements Serializable {

    private static final long serialVersionUID = -8911411734074391042L;

    /*** 计划ID 单灯：策略配置项ID 音响：任务ID 显示屏：配置ID 巡检：巡检计划ID */
    @NotNull(message = "计划id不能为空")
    private Long planId;

    /*** 项目ID */
    @NotNull(message = "项目id不能为空")
    private Long projectId;

    /*** 设备类型ID DeviceTypeEnum枚举 */
    @NotNull(message = "设备类型id不能为空")
    private Long deviceTypeId;

    /*** 计划名称 */
    @NotNull(message = "计划名称不能为空")
    private String planName;

    /*** 计划关联设备数量 */
    @NotNull(message = "计划关联的设备数量不能为空")
    private Integer deviceNum;

    /*** 计划定时开始时间 时间戳 */
    @NotNull(message = "计划开始时间不能为空")
    private Long timingStart;

    /*** 计划定时结束时间 时间戳 */
    @NotNull(message = "计划结束时间不能为空")
    private Long timingEnd;

    /*** 创建时间 */
    private Long created;

    /*** 创建人 */
    private Long creator;
}
