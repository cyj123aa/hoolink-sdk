package com.hoolink.sdk.bo.omc;

import java.util.List;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author chenyuejun
 */
@Data
public class ProcessNodeBO {

    /**
     * <pre>
     * 流程id
     * 表字段 : Process.id
     * </pre>
     */
    private Long id;

    /**
     * <pre>
     * 流程名字
     * 表字段 : process.name
     * </pre>
     */
    private String name;

    /**
     * <pre>
     * 流程名字
     * 表字段 : process.name
     * </pre>
     */
    private String processName;
    /**
     * 流程类型
     */
    private String processType;

    /*** 项目id */
    private Long projectId;

    /*** 项目名称 */
    private String projectName;

    /**
     * <pre>
     * 客户号 hoolink为基础模板
     * 表字段 : process.customer_no
     * </pre>
     */
    private String customerNo;

    /*** 客户名称 */
    private String customerName;

    /**
     * <pre>
     * 描述
     * 表字段 : process.description
     * </pre>
     */
    private String description;

    /**
     * 流程下节点
     */
    private NodeWebBO nodes;

    /**
     * 场景id
     */
    private Long scencId;


}
