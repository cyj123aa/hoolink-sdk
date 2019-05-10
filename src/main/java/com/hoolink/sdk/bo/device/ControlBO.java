package com.hoolink.sdk.bo.device;

import lombok.Data;

/**
 * @version V1.0
 * @classname:CameraBO
 * @author: xiaolei.yang
 * @date: 2019/4/3 13:51
 **/
@Data
public class ControlBO {
    /**
     * 云台速度
     */
    private Integer speed;
    /**
     * 云台命令
     */
    private Integer ptzCommand;

    private Long cameraId;

    private String deviceSerial;

    private Integer channelNo;

}
