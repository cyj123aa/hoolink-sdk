package com.hoolink.sdk.bo.base;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author : lys
 * @Date : 2019/4/23 10:48
 * @Instructions : 创建/修改固件BO
 */
@Data
public class CreateFirmwareBO implements Serializable {
    private static final long serialVersionUID = 4600780605053954510L;

    /**
     * <pre>
     * 主键
     * 表字段 : firmware_version.id
     * </pre>
     */
    private Long id;
    /**
     * <pre>
     * 关联device_sub_type设备型号表外键
     * 表字段 : firmware_version.device_sub_type_id
     * </pre>
     */
    private Long deviceSubTypeId;

    /**
     * <pre>
     * 版本号
     * 表字段 : firmware_version.version
     * </pre>
     */
    private String version;

    /**
     * <pre>
     * 上传包对应的obsId
     * 表字段 : firmware_version.obs_id
     * </pre>
     */
    private Long obsId;

    /**
     * <pre>
     * 描述
     * 表字段 : firmware_version.description
     * </pre>
     */
    private String description;

    /**
     * <pre>
     * 设备类型id
     * 表字段 : firmware_version.device_type_id
     * </pre>
     */
    private Long deviceTypeId;

    /**
     * 是否覆盖
     */
    private Boolean whetherCover;
}
