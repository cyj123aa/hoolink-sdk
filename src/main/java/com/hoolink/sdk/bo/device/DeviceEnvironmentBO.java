package com.hoolink.sdk.bo.device;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
public class DeviceEnvironmentBO implements Serializable {
    /**
     * <pre>
     * 主键ID
     * 表字段 : device_environment.environment_id
     * </pre>
     */
    private Long environmentId;

    /**
     * 设备名称
     */
    private String environmentName;

    /**
     * 模型
     */
    private String modelNo;

    /**
     * <pre>
     * 灯杆ID
     * 表字段 : device_environment.pole_id
     * </pre>
     */
    private Long poleId;

    /**
     * <pre>
     * 设备IP地址
     * 表字段 : device_environment.environment_ip
     * </pre>
     */
    private String environmentIp;

    /**
     * <pre>
     * 设备编号
     * 表字段 : device_environment.environment_no
     * </pre>
     */
    private String environmentNo;

    /**
     * <pre>
     * 设备描述
     * 表字段 : device_environment.environment_desc
     * </pre>
     */
    private String environmentDesc;

    /**
     * <pre>
     * 最新的PM10值
     * 表字段 : device_environment.pm_ten
     * </pre>
     */
    private Integer pmTen;

    /**
     * <pre>
     * 最新的PM2.5值
     * 表字段 : device_environment.pm_towpointfive
     * </pre>
     */
    private Integer pmTowpointfive;

    /**
     * <pre>
     * 最新的风速值
     * 表字段 : device_environment.wind_speed
     * </pre>
     */
    private Float windSpeed;

    /**
     * <pre>
     * 最新的风向值
     * 表字段 : device_environment.wind_direction
     * </pre>
     */
    private String windDirection;

    /**
     * <pre>
     * 最新的温度值
     * 表字段 : device_environment.temperature
     * </pre>
     */
    private Float temperature;

    /**
     * <pre>
     * 最新的湿度值
     * 表字段 : device_environment.humidity
     * </pre>
     */
    private Float humidity;

    /**
     * <pre>
     * 最新的噪音值
     * 表字段 : device_environment.noise
     * </pre>
     */
    private Float noise;

    /**
     * <pre>
     * 设备当前状态（1运行   0无效）
     * 表字段 : device_environment.enabled
     * </pre>
     */
    private Boolean enabled;

    /**
     * <pre>
     * 数据更新者
     * 表字段 : device_environment.updator
     * </pre>
     */
    private String updator;

    /**
     * 设备所属项目ID
     */
    private Long projectId;

    /**
     * <pre>
     * 数据更新时间
     * 表字段 : device_environment.updated
     * </pre>
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updated;

    /**
     * <pre>
     * 数据创建者
     * 表字段 : device_environment.creator
     * </pre>
     */
    private String creator;

    /**
     * <pre>
     * 数据创建时间
     * 表字段 : device_environment.created
     * </pre>
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date created;

    /**
     * <pre>
     * 通道编号
     * 表字段 : device_environment.channel_no
     * </pre>
     */
    private String channelNo;

    /**
     * <pre>
     * 设备状态（0关闭，1开启）
     * 表字段 : device_environment.environment_status
     * </pre>
     */
    private Boolean environmentStatus;

    /**
     * <pre>
     * 责任组外键
     * 表字段 : device_environment.area_id
     * </pre>
     */
    private Long areaId;

    /**
     * <pre>
     *  出厂时间
     * 表字段 : device_environment.factory_time
     * </pre>
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date factoryTime;

    /**
     * 维保年限
     */
    private Integer maintainTime;

    /**
     * <pre>
     *  过期时间
     * 表字段 : device_environment.deadline_time
     * </pre>
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date deadlineTime;

    /**
     * 物理地址
     */
    private String mac;

    /**
     * 安装地址
     */
    private String envAddress;

    private String typeUrl;

    private Long subTypeId;

    private Long roadId;
}