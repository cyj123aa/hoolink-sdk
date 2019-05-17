package com.hoolink.sdk.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @ClassName StatusVO
 * @Author huyaxi
 * @DATE 2019/5/15 20:18
 */
@Data
public class StatusVO implements Serializable {
    @NotNull(message = "主键不允许为空")
    private Long id;
    @NotNull(message = "状态不允许为空")
    private Boolean status;
}
