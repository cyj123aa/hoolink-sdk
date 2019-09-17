package com.hoolink.sdk.bo.datacenter;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-08-27 16:12
 * @Description 独立的趋势图XY组合（折线和柱状图）
 */
@Data
public class TrendGraphBO implements Serializable {

    /*** X轴数组数据 */
    private List<String> x;

    /*** Y轴数组数据 */
    private List<Long> y;
}
