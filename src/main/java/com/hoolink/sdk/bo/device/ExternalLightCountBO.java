package com.hoolink.sdk.bo.device;

import java.io.Serializable;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-24 16:29
 * @Description
 */
@Data
public class ExternalLightCountBO implements Serializable {
    /*** 集中器ID */
    private Long externalId;
    /*** 单灯总数 */
    private Long lightCount;
}
