package com.hoolink.sdk.bo.device.inspection;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

/**
 * @author zhangxin
 * @date 2019/5/29
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UpdateInspectionPlanBO extends CreateInspectionPlanBO {

    private static final long serialVersionUID = -5141118753264047254L;

    @NotNull(message = "主键不允许为空")
    private Long id;
}
