package com.hoolink.sdk.bo.command;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 朱礼
 * @Date 2019/5/15
 * @Desc
 */
@Data
public class CmdResultBO implements Serializable {

    private static final long serialVersionUID = 2821838869259955876L;

    /**设备id*/
    private Long deviceId;

    /**灯杆id*/
    private Long poleId;

    /**设备mac*/
    private String mac;

    /**操作结果*/
    private Boolean cmdResult;

    /**设备型号id*/
    private Long deviceSubTypeId;

    /**指令码*/
    private String cmdCode;
    
}
