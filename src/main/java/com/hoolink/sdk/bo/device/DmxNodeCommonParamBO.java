package com.hoolink.sdk.bo.device;

import java.io.Serializable;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-12 20:16
 * @Description
 */
@Data
public class DmxNodeCommonParamBO extends ProjectParamBO implements Serializable {

    /*** 节点名称 */
    private String nodeName;

    /*** 分组ID */
    private Long groupId;

    /*** 节点状态 */
    private Integer nodeStatus;
}
