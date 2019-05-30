package com.hoolink.sdk.bo.manager;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * @Author: tonghao
 * @Date: 2019/5/30 11:06
 */
@Data
public class ManageDepartmetTreeParamBO implements Serializable {

    /** 组织架构id集合 */
    @NotEmpty(message = "组织架构id不能为空")
    private List<Long> idList;

    /** 是否需要查询架构下人员 */
    @NotNull(message = "是否需要查询组织架构的人员标识不能为空")
    private Boolean flag;
}
