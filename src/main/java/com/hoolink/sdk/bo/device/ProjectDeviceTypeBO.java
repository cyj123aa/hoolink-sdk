package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author wangdong
 * @date 2019/4/17 17:45
 */
@Data
public class ProjectDeviceTypeBO implements Serializable {
    private static final long serialVersionUID = -3459810938347293695L;

    /*** 设备类型ID */
    private Long id;

    /*** 设备类型名称 */
    private String typeName;

    /*** 设备种类id */
    private Long clusterId;

    /*** 设备型号列表 */
    private List<ProjectDeviceSubTypeBO> deviceSubTypes;

}
