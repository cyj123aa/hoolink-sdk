package com.hoolink.sdk.bo.alarm;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
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
    private Date alarmTime;

    /*** 设备ID */
    private Long deviceId;

    /*** 设备名称 */
    private String deviceName;

    /*** 设备安装地址 */
    private String deviceAddress;

    /*** 当前一帧的所有数据 */
    private List<AlarmHistoryDataBO> alarmData;

    /*** 当前一帧数据所有的告警项 */
    private List<AlarmHistoryItemBO> alarmItem;
}
