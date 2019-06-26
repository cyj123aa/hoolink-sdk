package com.hoolink.sdk.bo.device.req;

import java.io.Serializable;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-24 17:56
 * @Description
 */
@Data
public class ExternalLightParamBO implements Serializable {
    private Long projectId;
    private Long externalId;
}
