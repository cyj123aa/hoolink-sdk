package com.hoolink.sdk.bo.device;

import lombok.Data;

/**
 * @version V1.0
 * @classname:AddCameraBO
 * @author: xiaolei.yang
 * @date: 2019/4/4 15:31
 **/
@Data
public class AddCameraBO {
    private String deviceSerial;
    private String validateCode;
    private Long  cameraId;
}
