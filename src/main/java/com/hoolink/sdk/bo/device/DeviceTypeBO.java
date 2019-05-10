package com.hoolink.sdk.bo.device;

import lombok.Data;

@Data
public class DeviceTypeBO {
    /**
     * <pre>
     * id
     * 表字段 : device_type.id
     * </pre>
     */
    private Long id;

    /**
     * <pre>
     * 设备类型编码
     * 表字段 : device_type.type_code
     * </pre>
     */
    private String typeCode;

    /**
     * <pre>
     * 设备类型名称
     * 表字段 : device_type.type_name
     * </pre>
     */
    private String typeName;


}
