package com.hoolink.sdk.bo.omc;


import java.util.List;
import lombok.Data;

/**
 * @author chenyuejun
 */
@Data
public class WorkorderBO {
    /**
     * <pre>
     * 主键
     * 表字段 : workorder.id
     * </pre>
     */
    private Long id;

    /**
     * <pre>
     * 问题类型
     * 表字段 : workorder.type
     * </pre>
     */
    private Boolean type;

    /**
     * <pre>
     * 优先级
     * 表字段 : workorder.priority
     * </pre>
     */
    private Boolean priority;

    /**
     * <pre>
     * 描述
     * 表字段 : workorder.description
     * </pre>
     */
    private String description;

    /**
     * <pre>
     * 截止日期
     * 表字段 : workorder.deadline
     * </pre>
     */
    private Long deadline;

    /**
     * <pre>
     * 延期日期
     * 表字段 : workorder.extension
     * </pre>
     */
    private Long extension;

    /**
     * <pre>
     * 工单状态
     * 表字段 : workorder.order_status
     * </pre>
     */
    private Boolean orderStatus;

    /**
     * <pre>
     * 上级处理人
     * 表字段 : workorder.superior_id
     * </pre>
     */
    private Long superiorId;

    /**
     * <pre>
     * 当前处理人
     * 表字段 : workorder.owner_id
     * </pre>
     */
    private Long ownerId;

    /**
     * <pre>
     * 当前节点
     * 表字段 : workorder.node_id
     * </pre>
     */
    private Long nodeId;

    /**
     * <pre>
     * 流程id
     * 表字段 : workorder.process_id
     * </pre>
     */
    private Long processId;

    /**
     * <pre>
     * 指派人
     * 表字段 : workorder.designator
     * </pre>
     */
    private Long designator;

    /**
     * <pre>
     * 数据有效性
     * 表字段 : workorder.enabled
     * </pre>
     */
    private Boolean enabled;

    /**
     * <pre>
     * 创建者
     * 表字段 : workorder.creator
     * </pre>
     */
    private Long creator;

    /**
     * <pre>
     * 创建时间
     * 表字段 : workorder.created
     * </pre>
     */
    private Long created;

    /**
     * <pre>
     * 修改人
     * 表字段 : workorder.updator
     * </pre>
     */
    private Long updator;

    /**
     * <pre>
     * 修改时间
     * 表字段 : workorder.updated
     * </pre>
     */
    private Long updated;

    /**
     * 文件集合
     */
    private List<Long> obsIds;


    /**
     * 设备集合
     */
    private List<DeviceBO> devices;
    /**
     * 项目id
     */
    private  Long projectId;

}
