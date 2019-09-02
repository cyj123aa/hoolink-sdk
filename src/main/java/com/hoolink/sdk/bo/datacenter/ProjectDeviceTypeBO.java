package com.hoolink.sdk.bo.datacenter;

import java.io.Serializable;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-08-29 16:55
 * @Description
 */
@Data
public class ProjectDeviceTypeBO implements Serializable {

    private Long projectId;
    private Long deviceTypeId;
}
