package com.hoolink.sdk.bo.device.req;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/5/28 14:16
 */
@Data
public class ScreenConfigParamBO implements Serializable {
    private static final long serialVersionUID = 1019732616201829207L;
    
    /*** 清单ID */
    private Long configId;

    /*** 显示屏亮度 */
    private Integer brightness;
}
