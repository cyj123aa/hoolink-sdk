package com.hoolink.sdk.bo.base;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/4/20 10:33
 */
@Data
public class CustomerProjectBO implements Serializable {
    private static final long serialVersionUID = 6058082111536993946L;

    /*** 项目ID */
    private Long id;

    /**
     * 项目编号
     */
    private String no;

    /*** 项目名称 */
    private String name;

    /*** 客户号 */
    private String customerNo;

    /**
     * <pre>
     * 流程id
     * 表字段 : base_project.process_id
     * </pre>
     */
    private Long processId;

}
