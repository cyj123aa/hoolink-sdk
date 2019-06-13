package com.hoolink.sdk.bo.alarm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author <a herf="mailto:yanwu0527@163.com">XuBaofeng</a>
 * @date 2019-06-13 9:17.
 * <p>
 * description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlarmHistoryItemBO implements Serializable {
    private static final long serialVersionUID = -5848092934030172265L;

    private Long id;

    /*** 告警历史ID */
    private Long alarmHistoryId;

    /*** 设备当前值 */
    private Double deviceItemValue;

    /*** 告警项ID */
    private Long configItemId;

    /*** 告警类型[true:恢复; false:告警] */
    private Boolean alarmType;

    /*** 生成时间 */
    private Long created;

    public AlarmHistoryItemBO(Long created, Boolean alarmType, Long configItemId, Double deviceItemValue) {
        this.created = created;
        this.alarmType = alarmType;
        this.configItemId = configItemId;
        this.deviceItemValue = deviceItemValue;
    }
}
