package com.hoolink.sdk.bo.alarm;

import com.hoolink.sdk.enums.DeviceTypeEnum;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author <a herf="mailto:yanwu0527@163.com">XuBaofeng</a>
 * @date 2019-06-12 20:37.
 * <p>
 * description:
 */
@Data
public class AlarmHistoryBO implements Serializable {
    private static final long serialVersionUID = 6224421293576535041L;

    private Long id;

    /*** 告警事件 */
    private Long alarmTime;

    /*** 设备ID */
    private Long deviceId;

    /*** 项目ID */
    private Long projectId;

    /*** 设备类型 */
    private DeviceTypeEnum deviceType;

    /*** 设备名称 */
    private String deviceName;

    /*** 设备安装地址 */
    private String deviceAddress;

    /*** 数据有效性 */
    private Boolean enabled;

    /*** 告警产生时间 */
    private Long created;

    /*** 当前一帧的所有数据 */
    private List<AlarmHistoryDataBO> alarmData;

    /*** 当前一帧数据所有的告警项 */
    private List<AlarmHistoryItemBO> alarmItem;
}
