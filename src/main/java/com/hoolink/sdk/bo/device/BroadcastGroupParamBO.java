package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;

@Data
public class BroadcastGroupParamBO implements Serializable {
    /**
     * 广播组id
     * 表字段 : broadcast_group.id
     */
    private Long id;

    private Long deviceId;

    private Long projectId;

}