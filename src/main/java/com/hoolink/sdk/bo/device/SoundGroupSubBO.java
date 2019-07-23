package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhouyun
 * @date 2019/5/24 17:39
 * @desc
 **/
@Data
public class SoundGroupSubBO implements Serializable {

    private static final long serialVersionUID = 938111778202135373L;
    /** 分组ID */
    private Long groupId;
    /** 分组名称 */
    private String groupName;
    /** 设备数量 */
    private Integer deviceNum;
    /** 设备id */
    private Long id;
    /** 设备名称 */
    private String deviceName;
    /** 设备音量 */
    private Integer taskVol;
    /** 清单名称 */
    private String taskName;
    /** 设备状态 1:工作中,2:在线,3:故障,4:离线,5:维修中 */
    private Integer status;
    /*** 异常状态 */
    private Boolean alarmStatus;
    /*** 运行状态 */
    private Boolean runStatus;
    /*** 在线状态 */
    private Boolean onlineStatus;
    /*** 工作状态 */
    private Boolean workStatus;
}
