package com.hoolink.sdk.bo.device;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 用户查询参数
 *
 * @author zhangxin
 * @date 2019/4/17
 */
@Data
public class SearchLightBO implements Serializable {

    private static final long serialVersionUID = -5451062334242948276L;
    /*** 设备名称，模糊匹配 */
    private String deviceName;

    /*** 分组id */
    private Long groupId;

    /*** 项目ID */
    @NotNull(message = "项目id不能为空")
    private Long projectId;

    /** 设备状态 0:全部,1:工作中,2:在线,3:故障,4:离线,5:维修中 */
    private Integer status;

    /** 设备类型 */
    private Long deviceSubTypeId;

}
