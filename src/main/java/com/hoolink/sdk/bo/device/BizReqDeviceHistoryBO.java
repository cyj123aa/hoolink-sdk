package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 朱礼
 * @Date 2019/5/13
 * @Desc
 */
@Data
public class BizReqDeviceHistoryBO implements Serializable {
    private static final long serialVersionUID = -6018356492696542147L;
    /**主键id*/
    private Long id;

    /**操作记录id*/
    private Long bizId;

    /**设备id*/
    private Long deviceId;

    /**灯杆id*/
    private Long poleId;

    /**设备型号id*/
    private Long deviceTypeId;

    /**操作结果(1:成功,0:失败)*/
    private Boolean cmdResult;

    /**项目id*/
    private Long projectId;

    /**设备地址*/
    private System mac;
}