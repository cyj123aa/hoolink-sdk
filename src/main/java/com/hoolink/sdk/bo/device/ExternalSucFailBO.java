package com.hoolink.sdk.bo.device;

import java.io.Serializable;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-27 10:22
 * @Description
 */
@Data
public class ExternalSucFailBO implements Serializable {
    private Long bizId;
    private Integer num;
}
