package com.hoolink.sdk.bo.chart;

import lombok.Data;

import java.util.List;

/**
 * Chart 数据封装类
 *
 * @author zhangxin
 * @date 2018/11/22
 */
@Data
public class OptionBO<L, A, S> {

    /**
     * legend.data
     */
    private List<L> legendData;

    /**
     * axis.data
     */
    private List<A> axisData;

    /**
     * series.data
     */
    private List<S> seriesData;

}
