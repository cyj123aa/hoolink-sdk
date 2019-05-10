package com.hoolink.sdk.bo.device.req;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/4/30 11:48
 */
@Data
public class DevicePullDownParamBO implements Serializable {
    private static final long serialVersionUID = -6335166296415480948L;

    /*** 设备名称 */
    private String deviceName;

    /*** 项目ID */
    @NotNull(message = "项目ID不能为空")
    private Long projectId;
}
