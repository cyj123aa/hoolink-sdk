package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;

/**
 * @author XuBaofeng.
 * @date 2019-04-03 19:13.
 * <p>
 * description:
 */
@Data
public class LightAndExternalBO implements Serializable {
    private static final long serialVersionUID = 65695300450665339L;

    /*** 单灯ID */
    private Long lightId;
    /*** 单灯物理地址 */
    private String lightMac;
    /*** 集中器ID */
    private Long externalId;
    /*** 集中器物理地址 */
    private String externalMac;
    /**灯杆id*/
    private Long poleId;
    /**项目id*/
    private Long projectId;
    /** nb平台的设备ID*/
    private String nbDeviceId;
    private Boolean runStatus;
    /** 设备型号Id */
    private Long deviceSubTypeId;

}
