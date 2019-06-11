package com.hoolink.sdk.bo.alarm;

import com.hoolink.sdk.enums.DeviceTypeEnum;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author <a herf="mailto:yanwu0527@163.com">XuBaofeng</a>
 * @date 2019-06-10 15:47.
 * <p>
 * description:
 */
@Data
public class DeviceDataBO implements Serializable {
    private static final long serialVersionUID = 4013155475610225458L;

    /*** 设备ID */
    private Long deviceId;

    /*** 设备物理地址 */
    @NotBlank(message = "物理地址不能为空")
    private String deviceMac;

    /*** 设备类型 */
    @NotNull(message = "设备类型不能为空")
    private DeviceTypeEnum deviceType;

}
