package com.hoolink.sdk.bo.device.req;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/5/30 11:22
 */
@Data
public class ScreenConfigIdParamBO implements Serializable {
    private static final long serialVersionUID = 744567103272278473L;
    
    /*** 清单ID */
    @NotNull(message = "清单ID不能为空")
    private Long configId;

    /*** 项目ID */
    @NotNull(message = "项目ID不能为空")
    private Long projectId;
}
