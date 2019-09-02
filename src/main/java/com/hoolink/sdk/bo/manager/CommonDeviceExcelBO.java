package com.hoolink.sdk.bo.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author by lixiaoran
 * @date 2019-05-06
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonDeviceExcelBO {

    private Long deviceTypeId;
    /**
     * 设备型号名称
     */
    private String subTypeName;
    /**
     * 设备名称
     */
    private String deviceName;
    /**
     * 灯杆物理地址
     */
    private String poleMac;
    /**
     * 灯杆型号
     */
    private String poleSubTypeName;
    /**
     * 集中器物理地址
     */
    private String externalMac;
    /**
     * 集中器型号
     */
    private String externalSubTypeName;
    /**
     * 物理地址
     */
    private String mac;
    /**
     * 安装地址
     */
    private String installAddress;
    /**
     * 描述
     */
    private String description;

    /**
     * 模型编号
     */
    private String modelNo;
    /**
     * 操作：新增/修改
     */
    private String operateType;

    /**
     * 摄像头ip
     */
    private String ipAddr;
    /**
     * 摄像头端口
     */
    private String ipPort;
    /**
     * 验证码
     */
    private String validateCode;
    /**
     * 漏电设备
     */
    private String existLeakage;
    /**
     * 环境
     */
    private String existEnvironment;
    /**
     * 水尺
     */
    private String existWaterLevel;
    /**
     * 气体
     */
    private String existGas;
    /**
     * 实时广播的型号
     */
    private String broadcastSubTypeName;
    /**
     * 实时广播的物理地址
     */
    private String broadcastMac;
    /**
     * 设备识别码
     */
    private String verifyCode;
    /**
     * 宽
     */
    private String width;
    /**
     * 高
     */
    private String height;
    /**
     * 错误信息
     */
    private String errorInfo;

    /**
     * nvr型号
     */
    private String nvrSubTypeName;

    /**
     * nvr 物理地址
     */
    private String nvrMac;

    /**
     * 账号
     */
    private String account;

    /**
     * 密码
     */
    private String pwd;
}

