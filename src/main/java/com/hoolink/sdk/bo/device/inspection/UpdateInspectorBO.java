package com.hoolink.sdk.bo.device.inspection;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

/**
 * @author zhangxin
 * @date 2019/6/2
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UpdateInspectorBO extends CreateInspectorBO {

    private static final long serialVersionUID = 3678697956504602622L;

    @NotNull(message = "主键不允许为空")
    private Long id;
}
