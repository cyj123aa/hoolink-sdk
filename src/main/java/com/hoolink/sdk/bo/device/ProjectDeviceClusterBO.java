package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/4/17 17:46
 */
@Data
public class ProjectDeviceClusterBO implements Serializable {
    private static final long serialVersionUID = 8627619721606063636L;

    /*** 设备种类ID */
    private Long id;

    /*** 设备种类名称 */
    private String clusterName;

}
