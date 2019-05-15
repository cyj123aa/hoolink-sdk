package com.hoolink.sdk.bo.device.req;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.List;

/**
 * @author zhangxin
 * @date 2019/5/14
 */
@Data
public class CreateLightStrategyItemBO implements Serializable {

    /*** 亮灯起始时间 */
    @NotNull(message = "亮灯时间不允许为空")
    private LocalTime startTime;

    /*** 亮灯结束时间 */
    @NotNull(message = "亮灯时间不允许为空")
    private LocalTime endTime;

    /*** 调光配置 */
    @NotEmpty(message = "调光配置不允许为空")
    private List<CreateLightStrategyItemDeviceBO> subItems;

}
