package com.hoolink.sdk.bo.device.req;

import lombok.Data;

import java.io.Serializable;

/**
 * @author <a herf="mailto:yanwu0527@163.com">XuBaofeng</a>
 * @date 2019-05-29 15:46.
 * <p>
 * description:
 */
@Data
public class ScreenConfigStatusBO implements Serializable {

    /*** 清单ID */
    private Long configId;

    /*** 清单ID */
    private Boolean configStatus;
}
