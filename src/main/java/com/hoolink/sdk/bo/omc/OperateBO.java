package com.hoolink.sdk.bo.omc;

import java.util.List;
import lombok.Data;

/**
 * @author chenyuejun
 */
@Data
public class OperateBO {


    /**
     * 上级节点
     */
    private Long  nextNodeId;
    /**
     * 上级处理人
     */
    private  Long superiorId;

    /**
     * 当前处理人
     */
    private  Long ownerId;
    /**
     * 当前节点
     */
    private Long  nodeId;

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


}
