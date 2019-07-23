package com.hoolink.sdk.bo.device;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-12 20:10
 * @Description
 */
@Data
public class ProjectParamBO implements Serializable {
    /*** 项目ID */
    private Long projectId;
}
