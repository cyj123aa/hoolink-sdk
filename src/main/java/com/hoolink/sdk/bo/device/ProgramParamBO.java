package com.hoolink.sdk.bo.device;

import java.io.Serializable;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-12 20:10
 * @Description
 */
@Data
public class ProgramParamBO extends ProjectParamBO implements Serializable {
    private Long programId;
}
