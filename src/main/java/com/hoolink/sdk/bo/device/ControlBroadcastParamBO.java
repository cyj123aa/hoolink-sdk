package com.hoolink.sdk.bo.device;

import java.util.List;

/**
 * @version V1.0
 * @classname:CameraBO
 * @author: xiaolei.yang
 * @date: 2019/5/16 13:51
 **/
public class ControlBroadcastParamBO extends DeviceBroadcastBO {

    /**
     * 广播组的id
     */
    private List<Long> configGroupIds;

    /**
     * 标志是否开始广播/停止广播(0:开始,1:停止)--世邦
     * @return
     */
    private Byte startOrStop;

    public List<Long> getConfigGroupIds() {
        return configGroupIds;
    }

    public void setConfigGroupIds(List<Long> configGroupIds) {
        this.configGroupIds = configGroupIds;
    }

    public Byte getStartOrStop() {
        return startOrStop;
    }

    public void setStartOrStop(Byte startOrStop) {
        this.startOrStop = startOrStop;
    }
}
