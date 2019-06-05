package com.hoolink.sdk.bo;

import com.hoolink.sdk.bo.device.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 设备录入数据
 *
 * @Author: tonghao
 * @Date: 2019/4/30 14:28
 */
@Data
public class DeviceImportDataBO implements Serializable {

    private static final long serialVersionUID = -1859479831665748864L;
    
    /**
     * 灯杆列表
     */
    List<PoleBO> poleInfoList;

    /**
     * 集中器列表
     */
    List<ExternalBO> externalInfoList;

    /**
     * 智慧照明列表
     */
    List<LightBO> lightInfoList;

    /**
     * 数字监控列表
     */
    List<CameraBO> cameraInfoList;

    /**
     * 数字音响列表
     */
    List<DeviceSoundBoxBO> soundBoxInfoList;

    /**
     * 实时广播列表
     */
    List<DeviceBroadcastBO> broadCastInfoList;

    /**
     * 一键呼叫列表
     */
    List<DeviceCallBO> callInfoList;

    /**
     * 智能巡检列表
     */
    List<NfcBO> nfcInfoList;

    /**
     * 信息发布列表
     */
    List<ScreenDeviceBO> screenInfoList;

    /**
     * 监控器列表
     */
    List<MonitorBO> monitorInfoList;

    /**
     * NB单灯
     */
    List<NbLightBO> nbLightBOList;

}
