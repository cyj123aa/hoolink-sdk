package com.hoolink.sdk.bo.alarm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author <a herf="mailto:yanwu0527@163.com">XuBaofeng</a>
 * @date 2019-06-12 20:37.
 * <p>
 * description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlarmHistoryDataBO implements Serializable {
    private static final long serialVersionUID = 3902472395782173081L;

    private Long id;

    /*** 告警历史ID */
    private Long alarmHistoryId;

    /*** 告警项ID */
    private Long configItemId;

    /*** 设备当前值 */
    private String deviceItemValue;

    /*** 阈值上界 */
    private Double upperBound;

    /*** 阈值下界 */
    private Double lowerBound;

    /*** 生成时间 */
    private Long created;

    public AlarmHistoryDataBO(Long created, Long configItemId, Double upperBound, Double lowerBound, String deviceItemValue) {
        this.created = created;
        this.upperBound = upperBound;
        this.lowerBound = lowerBound;
        this.configItemId = configItemId;
        this.deviceItemValue = deviceItemValue;
    }
}
