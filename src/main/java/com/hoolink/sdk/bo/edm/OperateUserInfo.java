package com.hoolink.sdk.bo.edm;

import lombok.Data;

/**
 * @author chenzhixiong
 * @date 2019/6/11 9:20
 */
@Data
public class OperateUserInfo {
    /**
     * 姓名
     */
    private String name;
    /**
     * 公司
     */
    private String company;
    /**
     * 部门
     */
    private String deptName;
    /**
     * 职位
     */
    private String position;

}
