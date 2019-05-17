package com.hoolink.sdk.bo.base;

import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * @author chenyuejun
 */
@Data
public class UpdateStatusBO {

    /**
     * 项目ID
     */
    @NotNull(message = "项目ID不能为空")
    private Long projectId;

    /**
     * 项目状态
     */
    @NotNull(message = "状态不能为空")
    private Boolean status;

    private Long  updator;

    private Long  updated;
}
