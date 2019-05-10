package com.hoolink.sdk.bo.base;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * @author wangdong
 * @date 2019/4/18 16:10
 */
@Data
public class ProjectAuthParamBO implements Serializable {
    private static final long serialVersionUID = 1290317820956160055L;

    /*** 项目ID */
    @NotNull(message = "项目ID不能为空")
    private Long projectId;

    /*** 权限ID集合 */
    @NotNull(message = "权限集合不能为空")
    private List<Long> menuIds;
}
