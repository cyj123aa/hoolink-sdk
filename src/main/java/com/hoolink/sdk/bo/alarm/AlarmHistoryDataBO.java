package com.hoolink.sdk.bo.alarm;

import lombok.Data;

import java.io.Serializable;

/**
 * @author <a herf="mailto:yanwu0527@163.com">XuBaofeng</a>
 * @date 2019-06-12 20:37.
 * <p>
 * description:
 */
@Data
public class AlarmHistoryDataBO implements Serializable {

    private Long id;

    /*** 告警历史ID */
    private Long alarmHistoryId;

    /*** 告警项ID */
    private Long configItemId;

    /*** 设备当前值 */
    private Double deviceItemValue;

    /*** 阈值上界 */
    private Double upperBound;

    /*** 阈值下界 */
    private Double lowerBound;

    /*** 生成时间 */
    private Long created;
}
