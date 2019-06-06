package com.hoolink.sdk.bo.omc;

import java.util.List;
import lombok.Data;

/**
 * @author chenyuejun
 */
@Data
public class NodeBO {
    /**
     * <pre>
     * 节点id
     * 表字段 : node.id
     * </pre>
     */
    private Long id;
    /**
     * <pre>
     * 流程id
     * 表字段 : node.process_id
     * </pre>
     */
    private Long processId;
    /**
     * <pre>
     * 节点名字
     * 表字段 : node.Node_name
     * </pre>
     */
    private String nodeName;

    /**
     * <pre>
     * 节点类型
     * 表字段 : node.Node_type
     * </pre>
     */
    private Boolean nodeType;

    /**
     * <pre>
     * 节点key
     * 表字段 : node.key
     * </pre>
     */
    private Long key;

    /**
     * <pre>
     * 描述
     * 表字段 : node.description
     * </pre>
     */
    private String description;

    private List<Long>  parents;


}
