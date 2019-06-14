package com.hoolink.sdk.bo.device;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-11 18:46
 * @Description
 */
@Data
public class DmxNodeGroupBO implements Serializable {

    /** 分组名称 */
    private String groupName;

    /** 节点数量 */
    private Integer nodeNum;

    /*** 分组下节点信息 */
    private List<DmxNodeBO> nodeList;
}
