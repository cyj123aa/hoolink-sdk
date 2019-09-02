package com.hoolink.sdk.bo.command.micro;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;

/**
 * @author zhouyun
 * @date 2019/8/22 11:17
 * @desc
 **/
@Data
public class AddPlayListBO implements Serializable {

    private static final long serialVersionUID = -2896626943455717873L;
    /**  登录用户（必填） */
    private String loginName;
    /** 广播室编号 （必填）*/
    private String bcId;
    /** 是否直播 0/1 非直播/直播 （必填）*/
    private String realTime;
    /** 文件名称 （必填）*/
    @NotBlank(message = "文件名称不能为空")
    private List<String> fileName;
    /** 列表名称 */
    private String attrName;
    /** 播放模式 0：顺序播放 1：随机播放 */
    private String playMod;
    /** 播放次数 参考值0-99 0：表示循环 （必填）*/
    @NotBlank(message = "播放次数不能为空")
    private String fileCount;
    /** 清单音量 参考值0-99 （必填）*/
    private String taskVolume;
    /** 音源模式 */
    private String realAudioSrc;
    /** 直播码率 64 128 192 三选一 */
    private String realTimeBitrate;
    /** 开始日期 yyyy-MM-dd */
    private String startDate;
    /** 开始时间 HH:mm:ss */
    private String startTime;
    /** 结束日期 yyyy-MM-dd */
    private String endDate;
    /** 结束时间 HH:mm:ss */
    private String endTime;
    /** 星期几播放 多天用，隔开 */
    private String weekUse;
    /** 当前时间 */
    private Long time;

}
