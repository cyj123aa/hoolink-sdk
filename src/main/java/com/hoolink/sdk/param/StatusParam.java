package com.hoolink.sdk.param;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author zhangxin
 * @date 2019/5/30
 */
@Data
public class StatusParam implements Serializable {

    private static final long serialVersionUID = -6662219877783682328L;

    @NotNull(message = "主键不允许为空")
    private Long id;
    @NotNull(message = "状态不允许为空")
    private Boolean status;
}
