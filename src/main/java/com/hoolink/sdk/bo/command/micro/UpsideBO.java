package com.hoolink.sdk.bo.command.micro;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhouyun
 * @date 2019/9/6 16:41
 * @desc 迈可行上行BO
 **/
@Data
public class UpsideBO implements Serializable {

    private static final long serialVersionUID = 1280890145684397941L;

    /*** 设备编号 */
    private String devNo;
    /*** 设备注册状态 0：注册成功 1：注册失败 */
    private Byte devState;
    /*** 设备开关 */
    private Byte devSwitch;
    /*** 设备开关状态 只有设备开关和设备开关状态都为1设备才处于播放状态 */
    private Byte devSwitchState;
    /*** 事件类型 四种取值（online/offline/play/stop）*/
    private String eventType;
}
