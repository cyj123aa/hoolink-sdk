package com.hoolink.sdk.bo.mdc;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author 朱礼
 * @Date 2019/6/11
 * @Desc
 */
@Data
public class MessageRecordBO implements Serializable {
    private static final long serialVersionUID = 7912602189615197005L;

    /** 消息id */
    private Long id;

    /** 标题 */
    private String content;

    /** 时间 */
    private Long created;

    /** 消息类型id */
    private Long typeId;

    /** 消息类型名称 */
    private String typeName;

    /** 是否已读，true：已读，false：未读 */
    private Boolean readStatus;

    /** 设备id */
    private Long deviceId;

    /** 工单id */
    private Long orderId;

    /** 设备数量 */
    private Integer num;

    /** 工单描述 */
    private String description;

    /*** 项目id */
    private Long projectId;

    /** 故障参数 */
    private List<MessageRecordDetailBO> messageRecordDetailBOList;

    /** 工单流程列表 */
    private List<OrderProcessBO> orderProcessBOList;
}
