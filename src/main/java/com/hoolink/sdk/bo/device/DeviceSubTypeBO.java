package com.hoolink.sdk.bo.device;

import lombok.Data;

@Data
public class DeviceSubTypeBO {
    /**
     * <pre>
     *
     * 表字段 : device_sub_type.id
     * </pre>
     */
    private Long id;

    /**
     * <pre>
     * 型号code
     * 表字段 : device_sub_type.sub_type_code
     * </pre>
     */
    private String subTypeCode;

    /**
     * <pre>
     * 型号名称
     * 表字段 : device_sub_type.sub_type_name
     * </pre>
     */
    private String subTypeName;

    /*** 图片路径 */
    private String imgPath;

    /*** 描述 */
    private String description;

    /*** 厂商ID */
    private Long factoryId;

    /*** 厂商名称 */
    private String factoryName;

    











}
