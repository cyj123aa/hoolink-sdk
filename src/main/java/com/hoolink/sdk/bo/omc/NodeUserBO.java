package com.hoolink.sdk.bo.omc;

import java.util.List;
import lombok.Data;

/**
 * @author chenyuejun
 */
@Data
public class NodeUserBO {
    /**
     * <pre>
     * 节点id
     * 表字段 : node.id
     * </pre>
     */
    private Long id;

    /**
     * 用户id集合
     */
    private List<Long> users;

}
