package com.hoolink.sdk.bo.device;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @ClassName StatusBO
 * @Author huyaxi
 * @DATE 2019/5/15 20:18
 */
@Data
@AllArgsConstructor
public class StatusBO implements Serializable {

    private static final long serialVersionUID = -5855326587641787458L;

    @NotNull(message = "主键不允许为空")
    private Long id;
    @NotNull(message = "状态不允许为空")
    private Boolean status;
}
