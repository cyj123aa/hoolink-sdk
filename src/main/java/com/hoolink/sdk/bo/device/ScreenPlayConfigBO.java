package com.hoolink.sdk.bo.device;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/***
 * @author
 */
@Data
public class ScreenPlayConfigBO implements Serializable {
    /**
     * <pre>
     * 
     * 表字段 : screen_play_config.screen_config_id
     * </pre>
     */
    private Long screenConfigId;

    /**
     * <pre>
     * 显示屏播放清单的名字
     * 表字段 : screen_play_config.screen_config_name
     * </pre>
     */
    private String screenConfigName;

    /**
     * <pre>
     * 显示屏播放清单描述
     * 表字段 : screen_play_config.screen_config_desc
     * </pre>
     */
    private String screenConfigDesc;

    /**
     * <pre>
     * 播放模式：1：播放一次，2：循环播放
     * 表字段 : screen_play_config.play_mode
     * </pre>
     */
    private Integer playMode;

    /**
     * <pre>
     * lst播放清单文件在obs中的id
     * 表字段 : screen_play_config.obs_id
     * </pre>
     */
    private Long obsId;

    /**
     * <pre>
     * 
     * 表字段 : screen_play_config.enabled
     * </pre>
     */
    private Boolean enabled;

    /**
     * <pre>
     * 
     * 表字段 : screen_play_config.created
     * </pre>
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    @ApiModelProperty(dataType = "java.lang.String", example = "2016-01-01 15:00:00")
    private Date created;

    /**
     * <pre>
     * 
     * 表字段 : screen_play_config.creator
     * </pre>
     */
    private String creator;

    /**
     * <pre>
     * 
     * 表字段 : screen_play_config.updated
     * </pre>
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    @ApiModelProperty(dataType = "java.lang.String", example = "2016-01-01 15:00:00")
    private Date updated;

    /**
     * <pre>
     * 
     * 表字段 : screen_play_config.updator
     * </pre>
     */
    private String updator;

    /**
     * <pre>
     * 项目表外键
     * 表字段 : screen_play_config.project_id
     * </pre>
     */
    private Long projectId;

    /**
     * <pre>
     * 该配置文件里面的文件数
     * 表字段 : screen_play_config.file_num
     * </pre>
     */
    private Integer fileNum;

    /**
     * <pre>
     * 播放状态：1：正在播放， 2：停止
     * 表字段 : screen_play_config.play_status
     * </pre>
     */
    private Integer playStatus;

    /**
     * <pre>
     * 下行的播放清单名称：格式为play001.lst-play100.lst
     * 表字段 : screen_play_config.inner_name
     * </pre>
     */
    private String innerName;

    /**
     * <pre>
     * 播放文件序号，与inner_name相对应
     * 表字段 : screen_play_config.play_index
     * </pre>
     */
    private Integer playIndex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table screen_play_config
     *
     * @mbggenerated
     */

    /**
     * <pre>
     * 文件下发状态状态：0：下发中， 1：下发成功，2：下发失败
     * 表字段 : screen_play_config.send_status
     * </pre>
     */
    private Byte sendStatus;
    private Integer sendStr;
    private static final long serialVersionUID = 1L;

}