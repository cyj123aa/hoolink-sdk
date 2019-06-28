package com.hoolink.sdk.bo.device.light;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author zhangxin
 * @date 2019/6/27
 */
@Data
@AllArgsConstructor
public class CronStrategyBO implements Serializable {

    private static final long serialVersionUID = -1105040222904550966L;

    private Long id;

    /*** 开始 true  结束 false */
    private Boolean status;

}
