package com.hoolink.sdk.bo.omc;

import java.util.List;
import lombok.Data;

/**
 * @author chenyuejun
 */
@Data
public class OperateBO {

    /**
     * 截止时间
     */
        private  Long deadline;
    /**
     * 上一个节点
     */
    private String  lastNodeId;
    /**
     * 上一个处理人
     */
    private  Long superiorId;

    /**
     * 上一个节点类型
     */
    private  String lastNodeType;



    /**
     * 当前节点
     */
    private  Long ownerId;
    /**
     * 当前节点处理人
     */
    private String  nodeId;
    /**
     * 当前节点类型
     */
    private String  nodeType;



    /**
     * 流程id
     */
    private  Long processId;
    /**
     * 描述
     */
    private String description;

    private List<Long> obsIds;

    /**
     * 工单号
     */

    private Long  workId;
    private  String  reason;

}
