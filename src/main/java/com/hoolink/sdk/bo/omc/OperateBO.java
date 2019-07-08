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
     * 下一个节点操作人
     */
    private  Long nextId;
    /**
     * 下一个节点ID
     */
    private String  nextNodeId;
    /**
     *  下一个节点类型
     */
    private String  nextNodeType;


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
    /**
     * 原因
     */
    private  String  reason;

}
