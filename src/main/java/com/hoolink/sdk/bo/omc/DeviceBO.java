package com.hoolink.sdk.bo.omc;

import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * @author chenyuejun
 */
@Data
public class DeviceBO {
    /*** 设备类型ID */

    private Long deviceSubType;

    /*** 设备ID */

    private Long deviceId;

}
