package com.hoolink.sdk.bo.device;

import java.io.Serializable;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-12 19:48
 * @Description
 */
@Data
public class DeviceDmxBO extends DeviceManagerBO implements Serializable {

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
     * 宽度
     * 表字段 : device_dmx.width
     */
    private Integer width;

    /**
     * 高度
     * 表字段 : device_dmx.height
     */
    private Integer height;
}
