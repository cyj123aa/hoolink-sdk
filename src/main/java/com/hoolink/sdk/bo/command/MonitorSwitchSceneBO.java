package com.hoolink.sdk.bo.command;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhouyun
 * @date 2019/8/5 14:09
 * @desc
 **/
@Data
public class MonitorSwitchSceneBO implements Serializable {

    /*** 设备MAC列表 */
    private List<String> macList;

    /*** 场景切换标志位 1：开启 0：关闭 */
    private Byte flag;
}
