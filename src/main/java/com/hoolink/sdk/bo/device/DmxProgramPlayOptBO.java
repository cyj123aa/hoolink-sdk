package com.hoolink.sdk.bo.device;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-12 15:29
 * @Description
 */
@Data
public class DmxProgramPlayOptBO implements Serializable {

    /*** 播放操作状态：1：无失败节点直接播放，2：节目还在切割中，3：节目下发时有节点失败-nodeGroup存储失败节点分组信息 */
    private Byte optStatus;
    private List<GroupTreeBO> nodeGroup;
}
