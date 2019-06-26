package com.hoolink.sdk.bo.device;

import java.io.Serializable;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-26 13:39
 * @Description
 */
@Data
public class ExternalHistoryListBO implements Serializable {
    private String deviceNo;
    private String deviceName;
    private String mac;
    private Long projectId;
    private Integer totalNum;
    private Integer failNum;
    private Long created;
    private Long account;
    private Long id;
}
