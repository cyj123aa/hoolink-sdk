package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/4/29 19:01
 */
@Data
public class DeviceFactoryBO implements Serializable {
    private static final long serialVersionUID = 2652256398566702727L;

    /*** 厂商ID */
    private Long id;

    /*** 厂商名称 */
    private String factoryName;

    /*** 描述 */
    private String description;
}
