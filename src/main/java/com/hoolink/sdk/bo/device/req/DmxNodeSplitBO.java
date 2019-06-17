package com.hoolink.sdk.bo.device.req;

import java.io.Serializable;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-11 19:32
 * @Description
 */
@Data
public class DmxNodeSplitBO implements Serializable {

    private Long nodeId;
    private Integer x;
    private Integer y;
    private Integer width;
    private Integer height;
    private Byte sendStatus;

}
