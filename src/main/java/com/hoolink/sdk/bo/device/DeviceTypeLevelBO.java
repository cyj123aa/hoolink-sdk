package com.hoolink.sdk.bo.device;

import lombok.Data;

/**
 * @author chenzhixiong
 * @date 2019/4/24 13:12
 */
@Data
public class DeviceTypeLevelBO {
    /**
     * 该层级节点id
     */
    private Long id;
    /**
     * 该层级name
     */
    private String name;

    /**
     * 父节点id
     */
    private Long parentId;
}
