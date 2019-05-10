package com.hoolink.sdk.bo.device;

import lombok.Data;

/**
 * @author wangdong
 * @date 2019/4/2 19:54
 */
@Data
public class CrUpSoundBoxBO extends DeviceManagerBO {

    /**
     * 设备基础表主键ID
     */
    private Long deviceManagerId;

    /**
     * 最近通讯时间
     */
    private Long lastTime;

    /**
     * 音量
     */
    private Integer soundboxVolume;

}
