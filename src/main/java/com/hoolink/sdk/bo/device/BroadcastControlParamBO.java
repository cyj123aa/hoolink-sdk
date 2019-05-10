package com.hoolink.sdk.bo.device;

import lombok.Data;
import org.omg.PortableInterceptor.LOCATION_FORWARD;

import java.io.Serializable;
import java.util.List;

/**
 * @author : chenzb
 * @Description : 广播控制BO
 * @date : Created on 2019/4/10 14:38
 */
@Data
public class BroadcastControlParamBO implements Serializable {

    private static final long serialVersionUID = 5069297684075695128L;

    /**
     * 广播的id
     */
    private Long deviceId;

    /**
     * 广播的设备类型(11：itc ， 23：spon)
     */
    private Long deviceSubTypeId;

    /**
     * 广播的mac
     */
    private String broadcastMac;

    /**
     * 项目id
     */
    private Long projectId;

    /**
     * 音响的macList
     */
    private List<String> soundBoxMacs;

    /**
     * 标志是否开始广播/停止广播(1:开始,2:停止)
     */
    private Byte startOrStop;

}
