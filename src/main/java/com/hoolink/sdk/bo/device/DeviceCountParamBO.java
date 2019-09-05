package com.hoolink.sdk.bo.device;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @ClassName DeviceCountParamBO
 * @Author huyaxi
 * @DATE 2019/9/3 18:00
 */
@Data
public class DeviceCountParamBO implements Serializable {
    @NotNull(message = "项目ID不能为空")
    private Long projectId;
    private Long DeviceTypeId;
}
