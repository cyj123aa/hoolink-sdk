package com.hoolink.sdk.param;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author zhangxin
 * @date 2019/5/30
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StatusParam implements Serializable {

    private static final long serialVersionUID = -6662219877783682328L;

    @NotNull(message = "主键不允许为空")
    private Long id;
    @NotNull(message = "状态不允许为空")
    private Boolean status;
}
