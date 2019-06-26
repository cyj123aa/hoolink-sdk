package com.hoolink.sdk.bo.device;

import java.io.Serializable;

import lombok.Data;

@Data
public class MiddleDmxResourcefileObsBO implements Serializable {
    /**
     * 主键ID
     * 表字段 : middle_dmx_resourcefile_obs.id
     */
    private Long id;

    /**
     * 资源编号
     * 表字段 : middle_dmx_resourcefile_obs.resource_no
     */
    private String resourceNo;

    /**
     * 上传到FTP上的文件名
     * 表字段 : middle_dmx_resourcefile_obs.file_name
     */
    private String fileName;

    /**
     * 资源别名（原本的文件名）
     * 表字段 : middle_dmx_resourcefile_obs.resource_name
     */
    private String resourceName;

    /**
     * 文件大小（单位字节）
     * 表字段 : middle_dmx_resourcefile_obs.file_size
     */
    private Long fileSize;

    /**
     * obs主键ID
     * 表字段 : middle_dmx_resourcefile_obs.obs_id
     */
    private Long obsId;
}