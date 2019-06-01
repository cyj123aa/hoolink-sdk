package com.hoolink.sdk.param;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author zhangxin
 * @date 2019/6/1
 */
@Data
public class PeriodOfDate implements Serializable {

    private static final long serialVersionUID = 2246932679767392188L;

    /*** 结束时间 */
    private LocalDate startDate;
    /*** 起始时间 */
    private LocalDate endDate;
}
