package com.hoolink.sdk.bo.base;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/4/17 9:51
 */
@Data
public class ProjectMenuParamBO implements Serializable {
    private static final long serialVersionUID = -1906059352999617878L;

    /*** 项目ID */
    private Long projectId;

    /*** 场景ID */
    @NotNull(message = "场景ID不能为空")
    private Long sceneId;
}
