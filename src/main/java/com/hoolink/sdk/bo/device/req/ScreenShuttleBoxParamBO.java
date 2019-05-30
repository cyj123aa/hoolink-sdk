package com.hoolink.sdk.bo.device.req;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/5/24 9:20
 */
@Data
public class ScreenShuttleBoxParamBO implements Serializable {
    private static final long serialVersionUID = 88583699781312411L;
    
    /*** 项目ID */
    private Long projectId;

    /*** 显示屏清单ID */
    private Long screenConfigId;
}
