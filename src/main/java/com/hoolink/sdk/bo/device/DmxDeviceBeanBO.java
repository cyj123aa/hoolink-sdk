package com.hoolink.sdk.bo.device;

import java.io.Serializable;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-14 15:08
 * @Description
 */
@Data
public class DmxDeviceBeanBO extends DeviceManagerBO implements Serializable {

    /**
     * 联机数
     */
    private Integer onlineNum;

    /**
     * 控制器总数
     */
    private Integer controllerNum;

    /**
     * 当前播放节目ID
     */
    private Long programConfigId;

    /**
     * 设备状态
     */
    private Integer nodeStatus;

    /**当前播放的节目名称**/
    private String programName;

    /** 节点名称**/
    private String nodeName;
}
