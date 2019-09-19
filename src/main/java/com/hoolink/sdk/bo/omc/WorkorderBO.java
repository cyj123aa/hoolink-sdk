package com.hoolink.sdk.bo.omc;


import com.hoolink.sdk.bo.device.DeviceManagerBO;
import java.util.List;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

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
    private String type;

    /**
     * <pre>
     * 问题类型
     * 表字段 : workorder.type
     * </pre>
     */
    @NotBlank(message = "问题类型不允许为空")
    private String workType;
    /**
     * <pre>
     * 问题类型
     * 表字段 : workorder.type
     * </pre>
     */
    private String typeName;

    /**
     * <pre>
     * 优先级
     * 表字段 : workorder.priority
     * </pre>
     */
    private Integer priority;

    /**
     * <pre>
     * 优先级
     * 表字段 : workorder.priority
     * </pre>
     */
    private String priorityName;
    /**
     * <pre>
     * 描述
     * 表字段 : workorder.description
     * </pre>
     */
    @NotBlank(message = "描述不允许为空")
    @Length(max=60, message="描述长度必须在0-60之间")
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
     *
     * 表字段 : workorder.node_typy
     * </pre>
     */
    private String nodeType;
    /**
     * <pre>
     * 工单状态
     * 表字段 : workorder.order_status
     * </pre>
     */
    private Integer orderStatus;
    /**
     * <pre>
     * 工单状态 名字
     * 表字段 : workorder.order_status
     * </pre>
     */
    private String orderStatusName;
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
     * 当前处理人
     * 表字段 : workorder.owner_id
     * </pre>
     */
    private String ownerName;

    /**
     * <pre>
     * 项目编号
     * 表字段 : workorder.work_no
     * </pre>
     */
    private String workNo;

    /**
     * <pre>
     * 当前节点
     * 表字段 : workorder.node_id
     * </pre>
     */
    private String nodeId;

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
     * 创建者
     * 表字段 : workorder.creator
     * </pre>
     */
    private String creatName;
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
     * 文件集合
     */
    private List<String> obsUrls;

    /**
     * 设备集合
     */
    private List<DeviceBO> devices;

    /**
     * 设备集合
     */
    private  List<DeviceManagerBO> deviceManagerBOS;
    /**
     * 项目id
     */
    private  Long projectId;
    /**
     * 延期原因  审批原因
     */
    private String  reason;

    /**
     * <pre>
     * 上个节点类型
     * 表字段 : workorder.last_node_type
     * </pre>
     */
    private String lastNodeType;

    /**
     * <pre>
     * 上个节点id
     * 表字段 : workorder.last_node_id
     * </pre>
     */
    private String lastNodeId;
    /**
     * <pre>
     * 类型
     * 表字段 : workorder.order_type
     * </pre>
     */
    private Byte orderType;

    /**
     * <pre>
     * 类型中文
     * 表字段 : workorder.order_type
     * </pre>
     */
    private String orderTypeName;

    private  String info;
    /**
     * <pre>
     * 状态预值
     * 表字段 : workorder.order_status_pre
     * </pre>
     */
    private Integer orderStatusPre;

    /**
     * app 端的描述
     */
    private String bewrite;

    /**
     * <pre>
     * 是否延期
     * 表字段 : workorder.order_status_pre
     * </pre>
     */
    private Boolean delay;

    /**
     * <pre>
     * 是否展示按钮
     * 表字段 : workorder.readonlyButton
     * </pre>
     */
    private Boolean readonlyButton;
}
