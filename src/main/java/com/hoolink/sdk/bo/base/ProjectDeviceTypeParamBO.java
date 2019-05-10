package com.hoolink.sdk.bo.base;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * @author wangdong
 * @date 2019/4/18 16:55
 */
@Data
public class ProjectDeviceTypeParamBO implements Serializable {
    private static final long serialVersionUID = -6237200630746025624L;

    /*** 项目ID */
    @NotNull
    private Long projectId;

    /*** 项目设备类型集合 */
    @NotNull
    private List<DeviceTypeBO> deviceTypes;
}
