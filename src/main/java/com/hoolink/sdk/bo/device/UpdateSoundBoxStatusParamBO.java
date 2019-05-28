package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.util.List;

/**
 * @author zhouyun
 * @date 2019/5/22 15:53
 * @desc 根据mac更新音响的运行状态
 **/
@Data
public class UpdateSoundBoxStatusParamBO {
    /** 设备mac列表 */
    private List<String> macList;
    /** 设备运行状态 */
    private Boolean runStatus;
    /** 设备子类型ID */
    private Long deviceSubTypeId;
    /** 更新时间 毫秒数 */
    private Long time;
}
