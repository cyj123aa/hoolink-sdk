package com.hoolink.sdk.bo.alarm;

import lombok.Data;

import java.io.Serializable;

/**
 * @author <a herf="mailto:yanwu0527@163.com">XuBaofeng</a>
 * @date 2019-06-13 9:17.
 * <p>
 * description:
 */
@Data
public class AlarmHistoryItemBO implements Serializable {
    private static final long serialVersionUID = -5848092934030172265L;

    private Long id;

    /*** 告警历史ID */
    private Long alarmHistoryId;

    /*** 告警项ID */
    private Long configItemId;

    /*** 告警类型[true:恢复; false:告警] */
    private Boolean alarmType;
}
