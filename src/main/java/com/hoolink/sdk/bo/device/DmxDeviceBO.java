package com.hoolink.sdk.bo.device;

import java.io.Serializable;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-14 15:08
 * @Description
 */
@Data
public class DmxDeviceBO extends DeviceManagerBO implements Serializable {

    /**
     * 联机数
     * 表字段 : device_dmx.online_node_num
     */
    private Integer onlineNodeNum;

    /**
     * 控制器总数
     * 表字段 : device_dmx.controller_num
     */
    private Integer controllerNum;

    /**
     * 当前播放节目ID
     * 表字段 : device_dmx.program_config_id
     */
    private Integer programConfigId;

    /**
     * 设备状态
     */
    private Integer deviceStatus;

    /**当前播放的节目名称**/
    private String programName;
}
