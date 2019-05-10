package com.hoolink.sdk.bo.command;

import lombok.Data;

/**
 * @author 朱礼
 * @Date 2019/3/13
 * @Desc
 */
@Data
public class SponBaseBO {

    /**
     * 唯一标识ID
     */
    private String uuid;
    /**
     * 事件类型
     * 1: 设备注册
     * 2. 设备对讲
     * 3. 设备监听
     * 4. 设备广播
     * 5. 设备报警
     */
    private String type;
    /**
     * 事件时间
     */
    private String time;
    /**
     * 发起方设备ID
     */
    private String sourceid;
    /**
     * 目标方设备ID （多个目标以“-”分隔）
     */
    private String targetid;
    /**
     * 状态
     * 1：登录 2： 注销 （targetid 为面板编号）
     * 0：停止 1： 呼叫 2： 对讲中
     * 0：停止 1： 呼叫 2： 对讲中
     * 0：停止 2：接收广播中 3： 发起广播中
     * 6：IO 口报警
     */
    private String state;
    /**
     * 事件相关录音文件（对讲/监听/广播类型开始时此字段有值）
     * 注： 对应的http 全路径为http://服务器IP /recordings/ + file
     */
    private String file;
    /**
     * 发起方设备名称
     */
    private String sourcename;
    /**
     * 目标方设备名称
     */
    private String targetname;
    /**
     * 发起方设备扩展信息
     */
    private String sourceext;
    /**
     * 目标方设备扩展信息（为JSON 数组格式）
     */
    private String targetext;
    /**
     * 传入的第三方平台数据
     */
    private String extdata;
    /**
     * 当任务为计划任务时，计划任务的任务编号
     */
    private String taskid;
    /**
     * 当任务为文件广播时，为播放列表的ID（如test.list）
     */
    private String playlistid;
    /**
     * 是否为发起方（1：发起方 0：接收方）
     */
    private String ishost;
}
