package com.hoolink.sdk.bo.manager;

import lombok.Data;

/**
 * @author chenzhixiong
 * @date 2019/6/18 10:32
 */
@Data
public class ReadFileOrgInfoParamBO {
    /**
     * 文件部门id
     */
    private Long departmentId;
    /**
     * 库类型
     */
    private Integer repertoryType;
}
