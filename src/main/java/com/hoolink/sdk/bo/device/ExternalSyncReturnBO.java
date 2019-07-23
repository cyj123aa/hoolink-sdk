package com.hoolink.sdk.bo.device;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-25 15:17
 * @Description
 */
@Data
public class ExternalSyncReturnBO implements Serializable {
    private Long externalId;
    private String externalMac;
    private Byte changeStatus;
    private Byte syncStatus;
    private List<NodeOnlineResultBO> lightNodeList;
}
