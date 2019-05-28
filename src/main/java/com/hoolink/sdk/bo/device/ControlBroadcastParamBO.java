package com.hoolink.sdk.bo.device;

import java.util.List;

/**
 * @version V1.0
 * @classname:CameraBO
 * @author: xiaolei.yang
 * @date: 2019/5/16 13:51
 **/
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

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public List<Long> getGroupIds() {
        return groupIds;
    }

    public void setGroupIds(List<Long> groupIds) {
        this.groupIds = groupIds;
    }

    public Byte getStartOrStop() {
        return startOrStop;
    }

    public void setStartOrStop(Byte startOrStop) {
        this.startOrStop = startOrStop;
    }

    @Override
    public String toString() {
        return "ControlBroadcastParamBO{" +
                "deviceId=" + deviceId +
                ", groupIds=" + groupIds +
                ", startOrStop=" + startOrStop +
                '}';
    }
}
