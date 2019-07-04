package com.hoolink.sdk.bo.device;

import java.io.Serializable;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-26 11:38
 * @Description
 */
@Data
public class BizReqDeviceManagerHistoryBO implements Serializable {

    /** 设备名称 */
    private String deviceName;
    /** 操作结果，true成功，false失败 */
    private Boolean cmdResult;
}
