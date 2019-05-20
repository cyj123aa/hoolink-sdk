package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;

/**
 * @author XuBaofeng.
 * @date 2019-05-18 16:56.
 * <p>
 * description:
 */
@Data
public class LightStrategyDownBO implements Serializable {
    private static final long serialVersionUID = 6693182459923389829L;

    /*** 设备ID */
    private Long lightId;

    /*** 单灯物理地址 */
    private String lightMac;

    /*** 调光值 */
    private Integer dimmingValue;

    /*** 开始时间 */
    private Long startTime;

    /*** 结束时间 */
    private Long endTime;

    /*** 集中器物理地址 */
    private Long externalId;

    /*** 集中器物理地址 */
    private String externalMac;

}
