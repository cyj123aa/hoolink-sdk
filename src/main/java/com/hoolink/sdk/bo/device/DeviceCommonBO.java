package com.hoolink.sdk.bo.device;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/4/29 15:36
 */
@Data
public class DeviceCommonBO implements Serializable {
    private static final long serialVersionUID = 6108865692610199307L;

    /*** 设备类型ID */
    @NotNull(message = "设备类型不能为空")
    private Long deviceTypeId;

    /*** 设备ID */
    @NotNull(message = "设备ID不能为空")
    private Long id;
}
