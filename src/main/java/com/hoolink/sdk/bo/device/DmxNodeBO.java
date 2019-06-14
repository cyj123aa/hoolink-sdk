package com.hoolink.sdk.bo.device;

import java.io.Serializable;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-11 18:47
 * @Description
 */
@Data
public class DmxNodeBO implements Serializable {

    /*** 节点ID */
    private Long id;

    /*** 联机数量 */
    private Integer onlineNum;

    /*** 控制器总数量 */
    private Integer controllerNum;

    /*** 节目名称 */
    private String programName;

    /*** 节点状态 */
    private Integer nodeStatus;

    /*** 节点名称 */
    private String nodeName;
}
