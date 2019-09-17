package com.hoolink.sdk.bo.device.datacenter;

import lombok.Data;

/**
 * @ClassName DeviceOffOnHistoryBO
 * @Author huyaxi
 * @DATE 2019/8/29 16:09
 */
@Data
public class DeviceOffOnHistoryBO {

    /**
     * <pre>
     * 设备类型ID
     * 表字段 : device_off_on_history.device_type_id
     * </pre>
     */
    private Long deviceTypeId;

    /**
     * <pre>
     * 设备下线时间
     * 表字段 : device_off_on_history.off_time
     * </pre>
     */
    private Long offTime;

    /**
     * <pre>
     * 设备上线时间
     * 表字段 : device_off_on_history.on_time
     * </pre>
     */
    private Long onTime;

    /**
     * <pre>
     * 设备所属项目
     * 表字段 : device_off_on_history.project_id
     * </pre>
     */
    private Long projectId;

    /**
     * <pre>
     * 设备ID
     * 表字段 : device_off_on_history.device_id
     * </pre>
     */
    private Long deviceId;

    /**
     * <pre>
     * 记录创建时间
     * 表字段 : device_off_on_history.created
     * </pre>
     */
    private Long created;

    /**
     * <pre>
     * 记录修改时间
     * 表字段 : device_off_on_history.updated
     * </pre>
     */
    private Long updated;
}
