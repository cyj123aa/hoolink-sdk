package com.hoolink.sdk.bo.device.req;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * @author zhangxin
 * @date 2019/5/14
 */
@Data
public class CreateLightStrategyItemDeviceBO implements Serializable {

    /*** 设备ID */
    @NotEmpty(message = "设备不允许为空")
    private List<Long> deviceIds;

    /*** 调光值 */
    @NotNull(message = "调光值不允许为空")
    private Integer dimmingValue;

}
