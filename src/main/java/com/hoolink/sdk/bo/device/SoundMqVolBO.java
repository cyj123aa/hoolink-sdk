package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhouyun
 * @date 2019/7/9 17:27
 * @desc
 **/
@Data
public class SoundMqVolBO implements Serializable {
    /** 设备ID */
    private Long deviceId;
    /** 子设备类型ID */
    private Long deviceSubTypeId;
    /** 设备音量 */
    private Integer deviceVol;
}
