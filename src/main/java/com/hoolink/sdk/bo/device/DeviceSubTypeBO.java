package com.hoolink.sdk.bo.device;

import lombok.Data;

/**
 * @author xubaofeng
 */
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
    /**
     * <pre>
     * 设备类型ID
     * 表字段 : device_sub_type.device_type_id
     * </pre>
     */
    private Long deviceTypeId;












}
