package com.hoolink.sdk.vo.chart;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Chart 数据封装类
 *
 * @author zhangxin
 * @date 2018/11/22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OptionVO<L, A, S> {

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
