package com.hoolink.sdk.bo.manager;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author : chenzb
 * @Description : TODO
 * @date : Created on 2019/5/30 20:16
 */
@Data
public class DepartmentTreeParamBO {

    /** 层级参数 1-公司 2-部门 3-小组 */
    @NotNull(message = "组织架构层级不能为空")
    private Byte deptType;

}