package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;

/**
 * @author XuBaofeng.
 * @date 2019-05-18 17:41.
 * <p>
 * description:
 */
@Data
public class ExternalAndLightBO implements Serializable {
    private static final long serialVersionUID = -4136692099808058380L;

    /*** 设备ID */
    private Long lightId;

    /*** 单灯物理地址 */
    private String lightMac;

    /*** 集中器物理地址 */
    private Long externalId;

    /*** 集中器物理地址 */
    private String externalMac;
}
