package com.hoolink.sdk.bo.device.datacenter;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName ProjectDeviceCountBO
 * @Author huyaxi
 * @DATE 2019/9/5 9:57
 */
@Data
public class ProjectDeviceCountBO implements Serializable {

    private Long projectId;

    private Integer count;
}
