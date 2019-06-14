package com.hoolink.sdk.bo.device.req;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

import com.hoolink.sdk.bo.device.ProjectParamBO;
import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-11 20:04
 * @Description
 */
@Data
public class DmxProgramParamBO extends ProjectParamBO implements Serializable {

    @NotNull(message = "节目ID不能为空")
    private Long programId;
}
