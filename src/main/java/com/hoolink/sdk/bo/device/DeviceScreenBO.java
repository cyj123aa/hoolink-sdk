package com.hoolink.sdk.bo.device;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wangdong
 */
@Data
public class DeviceScreenBO implements Serializable {
    /**
     * <pre>
     * 
     * 表字段 : device_screen.screen_id
     * </pre>
     */
    private Long screenId;

    /**
     * <pre>
     * 
     * 表字段 : device_screen.pole_id
     * </pre>
     */
    private Long poleId;

    /**
     * 标识 screen
     */
    private String type;

    /**
     * <pre>
     * 显示屏编号
     * 表字段 : device_screen.screen_no
     * </pre>
     */
    private String screenNo;

    /**
     * <pre>
     * 显示屏名称
     * 表字段 : device_screen.screen_name
     * </pre>
     */
    private String screenName;

    /**
     * <pre>
     * 显示屏状态(1:开启 2：关闭)
     * 表字段 : device_screen.screen_status
     * </pre>
     */
    private Integer screenStatus;

    /**
     * <pre>
     * 显示屏配置IP
     * 表字段 : device_screen.screen_ip
     * </pre>
     */
    private String screenIp;

    /**
     * <pre>
     * 显示屏配置端口
     * 表字段 : device_screen.screen_port
     * </pre>
     */
    private String screenPort;

    /**
     * <pre>
     * 
     * 表字段 : device_screen.enabled
     * </pre>
     */
    private Boolean enabled;

    /**
     * <pre>
     * 
     * 表字段 : device_screen.updator
     * </pre>
     */
    private String updator;

    /**
     * <pre>
     * 
     * 表字段 : device_screen.updated
     * </pre>
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    private Date updated;

    /**
     * <pre>
     * 
     * 表字段 : device_screen.created
     * </pre>
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    private Date created;

    /**
     * <pre>
     * 
     * 表字段 : device_screen.creator
     * </pre>
     */
    private String creator;

    /**
     * <pre>
     * 显示屏设备类型外键id
     * 表字段 : device_screen.sub_type_id
     * </pre>
     */
    private Long subTypeId;

    /**
     * <pre>
     * 
     * 表字段 : device_screen.last_time
     * </pre>
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    private Date lastTime;

    /**
     * <pre>
     * 亮度值
     * 表字段 : device_screen.screen_brightness
     * </pre>
     */
    private Integer screenBrightness;

    /**
     * <pre>
     * 亮度模式 1：自动调节亮度、2：手动调节亮度、3：定时调节亮度
     * 表字段 : device_screen.brightness_mode
     * </pre>
     */
    private Integer brightnessMode;

    /**
     * <pre>
     * 当前播放序号
     * 表字段 : device_screen.play_num
     * </pre>
     */
    private Integer playNum;

    /**
     * <pre>
     * 当前播放的文件清单
     * 表字段 : device_screen.current_play_file
     * </pre>
     */
    private String currentPlayFile;

    /**
     * <pre>
     * 设备通道号
     * 表字段 : device_screen.channel_no
     * </pre>
     */
    private String channelNo;

    /**
     * <pre>
     * 资源文件数量
     * 表字段 : device_screen.file_num
     * </pre>
     */
    private Integer fileNum;

    /**
     * <pre>
     * 文件大小，单位m
     * 表字段 : device_screen.files_size
     * </pre>
     */
    private Double filesSize;

    /**
     * <pre>
     * 当前播放清单文件的配置
     * 表字段 : device_screen.curren_play_config
     * </pre>
     */
    private Long currenPlayConfig;

    /**
     * <pre>
     * 标识是否有残留文件需要继续删除
     * 表字段 : device_screen.has_residue
     * </pre>
     */
    private Boolean hasResidue;

    /**
     * <pre>
     * 设备是否在线，在线=1 断线为0
     * 表字段 : device_screen.has_online
     * </pre>
     */
    private Boolean hasOnline;

    /**
     * <pre>
     * 显示屏的出厂日期
     * 表字段 : device_screen.screen_factory_time
     * </pre>
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    private Date screenFactoryTime;

    /**
     * <pre>
     * 关联外设ID
     * 表字段 : device_screen.external_id
     * </pre>
     */
    private Long externalId;

    /**
     * <pre>
     * 显示屏类型 1：诺瓦 2：卡莱特
     * 表字段 : device_screen.screen_type
     * </pre>
     */
    private Integer screenType;

    /**
     * <pre>
     * 描述备注
     * 表字段 : device_screen.screen_desc
     * </pre>
     */
    private String screenDesc;

    /**
     * 灯杆名称
     */
    private String poleName;

    /**
     * 道路的id
     */
    private Long roadId;
    /**
     * 保修期
     */
    private Integer warrantyPeriod;

    /**
     * 责任组id
     */
    private Long areaId;
    /**
     * 模型id
     */
    private String  modelNo;

    /**
     * 安装位置
     */
    private String  screenAddress;

    /**
     * 项目Id
     * @return
     */
    private Long projectId;

    /**
     * typeUrl
     * @return
     */
    private String typeUrl;

    private Byte deviceStatus;

}