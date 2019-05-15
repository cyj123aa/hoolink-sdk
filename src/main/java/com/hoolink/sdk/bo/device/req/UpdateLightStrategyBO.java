package com.hoolink.sdk.bo.device.req;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author zhangxin
 * @date 2019/5/14
 */
@Data
public class UpdateLightStrategyBO extends CreateLightStrategyBO implements Serializable {

    @NotNull(message = "主键不允许为空")
    private Long id;

}
