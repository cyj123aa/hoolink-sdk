package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author : chenzb
 * @ClassName : BizReqDeviceHistoryBO
 * @date : Created on 2018/12/3 11:53
 */
@Data
public class BizReqDeviceHistoryBO implements Serializable {

    private Long id;
    private Long bizId;
    private Long deviceId;
    private Long poleId;
    private String deviceType;
    private Integer cmdResult;
    private Date created;
    private String deviceNo;
    private Long projectId;

}
