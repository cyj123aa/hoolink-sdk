package com.hoolink.sdk.bo.alarm;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/6/10 15:39
 */
@Data
public class AlarmConfigItemBO implements Serializable {
    private static final long serialVersionUID = -294871767414848693L;
    
    /*** 阈值记录ID */
    private Long id;

    /*** 报警项ID */
    private Long itemId;

    /*** 设备ID */
    private Long deviceId;

    /*** 告警阈值项所属设备类型 */
    private Long deviceType;

    /*** 告警阈值项名称 */
    private String itemName;

    /*** 告警阈值项单位 */
    private String itemUnit;

    /*** 上界 */
    private Double upperBound;

    /*** 下界 */
    private Double lowerBound;
}
