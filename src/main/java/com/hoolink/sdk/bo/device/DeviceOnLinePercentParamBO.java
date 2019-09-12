package com.hoolink.sdk.bo.device;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @ClassName DeviceOnLinePercentParamBO
 * @Author huyaxi
 * @DATE 2019/9/6 17:01
 */
@Data
public class DeviceOnLinePercentParamBO extends DeviceCountParamBO {

    @NotNull(message = "startTime不能为空")
    private Long startTime;

    @NotNull(message = "endTime项目ID不能为空")
    private Long endTime;
}
