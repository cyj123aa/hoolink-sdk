package com.hoolink.sdk.bo.device;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author zhouyun
 * @description 监控器BO
 * @date 2018/12/25 11:06
 **/
@Data
public class DeviceMonitorBO {
    /**
     * 主键
     */
    private Long id;

    /**
     * 监控器名称
     */
    private String monitorName;

    /**
     * 监控器编号
     */
    private String monitorNo;

    /**
     * 监控器uid
     */
    private String mac;

    /**
     * 设备通道号
     */
    private String channelNo;

    /**
     * 项目外键ID
     */
    private Long projectId;

    /**
     * 责任组外键ID
     */
    private Long areaId;

    /**
     * 区域外键ID
     */
    private Long regionId;

    /**
     * 道路外键ID
     */
    private Long roadId;

    /**
     * 灯杆外键ID
     */
    private Long poleId;

    /**
     * 子设备类型外键
     */
    private Long subTypeId;

    /**
     * 模型编号
     */
    private String modelNo;

    /**
     *  监视器运行状态0：正常 1：故障 2：断线 3：维修中
     */
    private Byte monitorStatus;

    /**
     * 监控器运行状态0：关闭 1：监测
     */
    private Boolean runStatus;

    /**
     * 外设描述
     */
    private String description;

    /**
     * 安装位置
     */
    private String monitorAddress;

    /**
     * 监控器IP
     */
    private String monitorIp;

    /**
     * 监控器子网掩码
     */
    private String monitorMask;

    /**
     * 监控器网关
     */
    private String monitorGateway;

    /**
     * 连接服务器IP
     */
    private String serviceIp;

    /**
     * 连接服务器端口
     */
    private Integer servicePort;

    /**
     * 3D模型x轴
     */
    private Integer xaxis;

    /**
     * 3D模型y轴
     */
    private Integer yaxis;

    /**
     * 3D模型z轴
     */
    private Integer zaxis;

    /**
     * 最后通讯时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    private Date lastTime;

    /**
     * 出厂时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    private Date factoryTime;

    /**
     * 设备过期时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    private Date deadlineTime;

    /**
     * 是否可用0：不可用 1：可用
     */
    private Boolean enabled;

    /**
     * 创建者
     */
    private String creator;

    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    private Date created;

    /**
     * 更新者
     */
    private String updator;

    /**
     * 更新时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    private Date updated;

}
