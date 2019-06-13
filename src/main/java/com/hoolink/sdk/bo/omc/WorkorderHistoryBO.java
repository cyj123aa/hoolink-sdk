package com.hoolink.sdk.bo.omc;

import lombok.Data;

/**
 * @author chenyuejun
 */
@Data
public class WorkorderHistoryBO {
    /**
     * <pre>
     * 主键
     * 表字段 : workorder_history.id
     * </pre>
     */
    private Long id;

    /**
     * <pre>
     * 工单类型
     * 表字段 : workorder_history.type
     * </pre>
     */
    private String type;

    /**
     * <pre>
     * 工单id
     * 表字段 : workorder_history.work_id
     * </pre>
     */
    private Long workId;

    /**
     * <pre>
     * 描述
     * 表字段 : workorder_history.description
     * </pre>
     */
    private String description;

    /**
     * <pre>
     * 上级处理人
     * 表字段 : workorder_history.superior_id
     * </pre>
     */
    private Long superiorId;

    /**
     * <pre>
     * 当前处理人
     * 表字段 : workorder_history.owner_id
     * </pre>
     */
    private Long ownerId;

    /**
     * <pre>
     * 当前节点
     * 表字段 : workorder_history.node_id
     * </pre>
     */
    private String nodeId;

    /**
     * <pre>
     * 流程id
     * 表字段 : workorder_history.process_id
     * </pre>
     */
    private Long processId;

    /**
     * <pre>
     * 指派人
     * 表字段 : workorder_history.designator
     * </pre>
     */
    private Long designator;

    /**
     * <pre>
     * 数据有效性
     * 表字段 : workorder_history.enabled
     * </pre>
     */
    private Boolean enabled;

    /**
     * <pre>
     * 创建者
     * 表字段 : workorder_history.creator
     * </pre>
     */
    private Long creator;

    /**
     * <pre>
     * 创建时间
     * 表字段 : workorder_history.created
     * </pre>
     */
    private Long created;

    /**
     * <pre>
     * 修改人
     * 表字段 : workorder_history.updator
     * </pre>
     */
    private Long updator;

    /**
     * <pre>
     * 修改时间
     * 表字段 : workorder_history.updated
     * </pre>
     */
    private Long updated;

    /**
     * <pre>
     * 工单状态
     * 表字段 : workorder_history.order_status
     * </pre>
     */
    private Integer orderStatus;
}
