package com.hoolink.sdk.bo.device;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author zhouyun
 * @date 2019/5/24 15:52
 * @desc 查询音响传参
 **/
@Data
public class SearchSoundBO implements Serializable {

    private static final long serialVersionUID = -9155530465041680097L;
    /*** 设备名称，模糊匹配 */
    private String deviceName;

    /*** 分组id */
    private Long groupId;

    /*** 项目ID */
    @NotNull(message = "项目id不能为空")
    private Long projectId;

    /** 设备状态 0:全部,1:工作中,2:在线,3:故障,4:离线,5:维修中 */
    private Integer status;

    /*** 维修状态      true: 无工单   false: 有工单 */
    private Boolean workStatus;
    /*** 在线断线状态   true: 在线    false: 断线 */
    private Boolean onlineStatus;
    /*** 异常状态      true: 无告警   false: 有告警 */
    private Boolean alarmStatus;
    /*** 运行状态      true: 开      false: 关 */
    private Boolean runStatus;

}
