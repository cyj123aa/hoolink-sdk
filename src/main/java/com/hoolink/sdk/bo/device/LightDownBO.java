package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author XuBaofeng.
 * @date 2019-04-04 9:50.
 * <p>
 * description: 单灯下行BO
 */
@Data
public class LightDownBO implements Serializable {
    private static final long serialVersionUID = -921588477318807951L;

    /**
     * 鸣志单灯下发使用的数据封装
     * key: 集中器MAC地址
     * value: 该集中器下所属单灯
     */
    private Map<String, List<String>> external;

    /*** 调光值 */
    private Integer dimming;

}
