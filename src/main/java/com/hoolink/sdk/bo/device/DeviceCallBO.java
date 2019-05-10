package com.hoolink.sdk.bo.device;

import lombok.Data;


/**
 * @author 朱礼
 * @Date 2019/4/29
 * @Desc
 */
@Data
public class DeviceCallBO extends DeviceManagerBO {

    private static final long serialVersionUID = -2680552955239748190L;
    /**
     * 主键id
     */
    private Long id;
    /**
     * 呼叫的广播ID
     */
    private Long broadcastId;
    /**
     * 最后一次通讯时间
     */
    private Long lastTime;
    /**
     * 灯杆mac
     */
    private String poleMac;

    /*** 灯杆型号名称 */
    private String poleSubTypeName;

    /**
     * 广播mac
     */
    private String broadcastMac;

    /*** 广播型号名称 */
    private String broadcastSubTypeName;

}