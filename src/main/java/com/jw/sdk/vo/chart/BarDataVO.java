package com.jw.sdk.vo.chart;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 条形图数据类
 *
 * @author zhangxin
 * @date 2018/11/22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BarDataVO {

    private List<Integer> value;

}
