package com.hoolink.sdk.bo.device.req;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author wangdong
 * @date 2019/5/21 10:28
 */
@Data
public class ScreenStrategyCycleBO implements Serializable {
    private static final long serialVersionUID = 2507981248739543576L;

    /*** 周几 1-7 */
    private Byte dayOfWeek;

    /*** 特殊日期 */
    private LocalDate specialDate;
}
