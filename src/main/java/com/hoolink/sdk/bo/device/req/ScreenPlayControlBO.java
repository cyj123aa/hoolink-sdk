package com.hoolink.sdk.bo.device.req;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/5/27 17:58
 */
@Data
public class ScreenPlayControlBO implements Serializable {
    private static final long serialVersionUID = 8919476088151409382L;

    /*** 显示屏清单ID */
    private Long screenConfigId;

    /*** 控制类型：1播放 2停止 */
    private Integer controlType;
}
