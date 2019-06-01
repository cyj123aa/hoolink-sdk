package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.util.List;

/**
 * @version V1.0
 * @classname:CameraBO
 * @author: xiaolei.yang
 * @date: 2019/5/16 13:51
 **/

@Data
public class ControlBroadcastParamBO extends DeviceBroadcastBO {

    private Long deviceId;

    /**
     * 广播组的id
     */
    private List<Long> groupIds;

    /**
     * 标志是否开始广播/停止广播(0:开始,1:停止)--世邦
     * @return
     */
    private Byte startOrStop;

}
