package com.hoolink.sdk.enums;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 工单设备故障类型枚举
 *
 * @author zhangxin
 * @date 2018/11/14
 */
public enum WorkOrderDeviceFaultType {

    // 灯杆

    // 照明
    NO_BRIGHT("no_bright", "light", "不亮"),
    FLASHING("flashing", "light", "闪烁"),

    // 信息发布
    NO_SHOW("no_show", "screen", "无图像"),

    // 智能监控
    NO_IMAGE("no_image", "camera", "无图像"),
    IMAGE_FLASHING("image_flashing", "camera", "图像闪烁"),
    SHOOTING_ANGLE_ERROR("shooting_angle_error", "camera", "拍摄角度不正确"),
    CLOUD_PLATFORM_FAULT("cloud_platform_fault", "camera", "云平台故障"),

    // 数字音响
    NO_VOICE("no_voice", "broadcast", "没有声音"),

    // NFC 智能巡检
    NO_USE("no_use", "nfc", "不能使用"),

    // 环境评测

    // 一键呼救

    // 通用
    BROKEN("broken", null,"破损"),
    OTHER("other", null,"其他"),
    ;

    private final String code;
    private final String deviceCode;
    private final String name;

    WorkOrderDeviceFaultType(String code, String deviceCode, String name) {
        this.code = code;
        this.deviceCode = deviceCode;
        this.name = name;
    }

    /**
     * 根据编码值及设备编码值获得枚举对象
     */
    public static WorkOrderDeviceFaultType getEnumByCodeAndDeviceCode(String code, String deviceCode) {
        return Arrays.stream(WorkOrderDeviceFaultType.values())
                .filter(faultType -> equalsFaultType(faultType, code, deviceCode)).findFirst().orElse(null);
    }

    public static String getNameByCodeAndDeviceCode(String code, String deviceCode) {
        return Arrays.stream(WorkOrderDeviceFaultType.values())
                .filter(faultType -> equalsFaultType(faultType, code, deviceCode)).map(WorkOrderDeviceFaultType::getName).findFirst().orElse(null);
    }

    public static List<WorkOrderDeviceFaultType> getEnumListByDeviceCode(String device) {
        return Arrays.stream(WorkOrderDeviceFaultType.values())
                .filter(faultType -> faultType.getDeviceCode() == null || faultType.getDeviceCode().equals(device))
                .collect(Collectors.toList());
    }

    private static boolean equalsFaultType(WorkOrderDeviceFaultType faultType, String code, String deviceCode) {
        return Objects.equals(code, faultType.getCode()) && (faultType.deviceCode == null || faultType.deviceCode.equals(deviceCode));
    }

    public String getCode() {
        return code;
    }

    public String getDeviceCode() {
        return deviceCode;
    }

    public String getName() {
        return name;
    }
}
