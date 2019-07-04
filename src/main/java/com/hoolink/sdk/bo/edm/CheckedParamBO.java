package com.hoolink.sdk.bo.edm;

import lombok.Data;

/**
 * @Author: tonghao
 * @Date: 2019/6/11 19:17
 */
@Data
public class CheckedParamBO {
    /** 所勾选的节点id 可能是员工id或者部门id */
    private Long id;

    /** 员工所属部门id */
    private Long departId;
}
