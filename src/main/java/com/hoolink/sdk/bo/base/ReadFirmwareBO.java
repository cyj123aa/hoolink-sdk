package com.hoolink.sdk.bo.base;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author : lys
 * @Date : 2019/4/23 11:33
 * @Instructions :
 */
@Data
public class ReadFirmwareBO implements Serializable {
    private static final long serialVersionUID = 1194828679605058934L;

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
     * 创建时间
     * 表字段 : firmware_version.created
     * </pre>
     */
    private Long created;

    /**
     * 设备型号
     */
    private String deviceSubTypeStr;

    /**
     * 设备类型
     */
    private String deviceTypeStr;

    /**
     * 固件编号
     */
    private Integer firmwareNo;

    /**
     * 上传包对应的文件名
     */
    private String obsName;

}
