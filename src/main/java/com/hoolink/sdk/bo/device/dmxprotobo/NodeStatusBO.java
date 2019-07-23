package com.hoolink.sdk.bo.device.dmxprotobo;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-20 14:13
 * @Description
 */
@Data
public class NodeStatusBO implements Serializable {

    @JSONField(name="NodeNo")
    private String nodeNo;
    @JSONField(name="NodeState")
    private Integer nodeState;
    @JSONField(name="NodeName")
    private String nodeName;
    @JSONField(name="ControllerSum")
    private Integer controllerSum;
    @JSONField(name="ControllerConn")
    private Integer controllerConn;
    @JSONField(name="Longitude")
    private String longitude;
    @JSONField(name="Latitude")
    private String latitude;
    private Long nodeId;
}
