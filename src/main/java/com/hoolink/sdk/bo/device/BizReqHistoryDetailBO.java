package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 朱礼
 * @Date 2019/5/17
 * @Desc
 */
@Data
public class BizReqHistoryDetailBO implements Serializable {

    private static final long serialVersionUID = -3652050095484676922L;

    /** 设备名称 */
    private String deviceName;

    /** 分组名称 */
    private String groupName;

    /** 操作状态，true：成功，false：失败*/
    private Boolean cmdResult;
}
