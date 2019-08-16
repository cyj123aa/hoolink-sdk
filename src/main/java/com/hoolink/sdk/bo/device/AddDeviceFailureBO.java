package com.hoolink.sdk.bo.device;

import com.hoolink.sdk.enums.AddDeviceFailureReasonEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/8/16 9:39
 */
@Data
@AllArgsConstructor
public class AddDeviceFailureBO implements Serializable {
    private static final long serialVersionUID = 7991389881518614848L;

    /*** 型号名称 */
    private String deviceSubTypeName;

    /*** 设备物理地址 */
    private String mac;

    /*** 添加失败原因 */
    private AddDeviceFailureReasonEnum addDeviceFailureReasonEnum;
}
