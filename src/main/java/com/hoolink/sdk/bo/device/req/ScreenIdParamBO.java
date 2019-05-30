package com.hoolink.sdk.bo.device.req;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/5/29 20:11
 */
@Data
public class ScreenIdParamBO implements Serializable {
    private static final long serialVersionUID = 154587828461578876L;

    /*** 显示屏ID */
    @NotNull(message = "显示屏ID不能为空")
    private Long screenId;

    /*** 项目ID */
    @NotNull(message = "项目ID不能为空")
    private Long projectId;
}
