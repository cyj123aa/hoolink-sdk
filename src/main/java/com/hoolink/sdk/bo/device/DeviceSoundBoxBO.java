package com.hoolink.sdk.bo.device;

import lombok.Data;

/**
 * @author 朱礼
 * @Date 2019/4/29
 * @Desc
 */
@Data
public class DeviceSoundBoxBO extends DeviceManagerBO{
    /**
     * device_manager中的Id
     */
    private Long id;
    /**
     * 最近通讯时间
     */
    private Long lastTime;
    /**
     * 音量
     */
    private Integer soundboxVolume;
    /**
     * 灯杆mac
     */
    private String poleMac;

    /*** 灯杆型号名称 */
    private String poleSubTypeName;

}
