package com.hoolink.sdk.enums;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author : chenzb
 * @ClassName : DeviceSubTypeEnum
 * @date : Created on 2018/12/21 11:08
 */
public enum DeviceSubTypeEnum {
    // ----- 海康摄像头
    CAMERA_HIKVISION(1L, "camera_hikvision", "hikvision", "海康摄像头", InstructionCodeType.HIKVISION, 1L),
    // ----- 数字音箱
    SOUND_BOX_ITC(2L, "sound_box_itc", "itc", "数字音箱", InstructionCodeType.ITC, 2L),
    // ----- 世邦数字音箱
    SOUND_BOX_SPON(3L, "sound_box_spon", "spon", "世邦数字音箱", InstructionCodeType.SPON, 2L),
    // ----- itc一键呼叫
    CALL_ITC(4L, "call_itc", "itc", "itc一键呼叫", InstructionCodeType.ITC, 3L),
    // ----- 世邦一键呼叫
    CALL_SPON(5L, "call_spon", "spon", "世邦一键呼叫", InstructionCodeType.SPON, 3L),
    // ----- 金万马巡检设备
    NFC_JWM(6L, "nfc_jwm", "jwm", "金万马巡检设备", InstructionCodeType.JWM, 4L),
    // ----- 诺瓦显示屏
    SCREEN_NOVA(7L, "screen_nova", "nova", "诺瓦显示屏", InstructionCodeType.NOVA, 5L),
    // ----- 仁科环境监测设备
    ENVIRONMENT_RENKE(8L, "environment_renke", "renke", "仁科环境监测设备", InstructionCodeType.RENKE, 6L),
    // ----- 富奥通环境监测
    ENVIRONMENT_FUAOTONG(9L, "environment_fuaotong", "fuaotong", "富奥通环境监测", InstructionCodeType.MONITOR_HOOLINK, 6L),
    // ----- 鸣志智能照明设备
    LIGHT_MINGZHI(10L, "light_mingzhi", "mingzhi", "鸣志智能照明设备", InstructionCodeType.MING_ZHI, 7L),
    // ----- 互灵NB智能照明设备
    LIGHT_HOOLINK(11L, "light_hoolink", "hoolink", "互灵NB智能照明设备", InstructionCodeType.NB_LIGHT, 7L),
    // ----- itc数字广播设备
    BROADCAST_ITC(12L, "broadcast_itc", "itc", "itc数字广播设备", InstructionCodeType.ITC, 8L),
    // ----- 世邦数字广播设备
    BROADCAST_SPON(13L, "broadcast_spon", "spon", "世邦数字广播设备", InstructionCodeType.SPON, 8L),
    // ----- 互灵监控器设备
    MONITOR_HOOLINK(14L, "monitor_hoolink", "hoolink", "互灵监控器设备", InstructionCodeType.MONITOR_HOOLINK, 9L),
    // ----- 互灵气体监测设备
    GAS_HOOLINK(16L, "gas_hoolink", "hoolink", "互灵气体监测设备", InstructionCodeType.MONITOR_HOOLINK, 11L),
    // ----- 互灵水位监测设备
    WATER_GAUGE_HOOLINK(17L, "water_gauge_hoolink", "hoolink", "互灵水位监测设备", InstructionCodeType.MONITOR_HOOLINK, 12L),
    // ----- 互灵智能灯杆设备
    POLE_HOOLINK(18L, "pole_hoolink", "hoolink", "互灵智能灯杆设备", InstructionCodeType.MONITOR_HOOLINK, 13L),
    // ----- 互灵集中器设备
    EXTERNAL_HOOLINK(19L, "external_hoolink", "hoolink", "互灵集中器设备", InstructionCodeType.MING_ZHI, 14L),
    // ----- 互灵土壤监测设备
    SOIL_HOOLINK(20L, "soil_hoolink", "hoolink", "互灵土壤监测设备", InstructionCodeType.MONITOR_HOOLINK, 15L),
    // ----- 互灵水质监测设备
    WATER_HOOLINK(21L, "water_hoolink", "hoolink", "互灵水质监测设备", InstructionCodeType.MONITOR_HOOLINK, 16L),
    // ----- 互灵漏电监测设备
    LEAKAGE_HOOLINK(22L, "leakage_hoolink", "hoolink", "互灵漏电监测设备", InstructionCodeType.MONITOR_HOOLINK, 10L),
    // ----- DMX景观照明
    DMX_HOOLINK(23L, "dmx_hoolink", "hoolink", "DMX景观照明", InstructionCodeType.DMX, 17L),
    // ----- 智能1+灯杆
    POLE_YEAH(24L, "pole_yeah", "hoolink", "智能1+", InstructionCodeType.MONITOR_HOOLINK, 13L),
    // ----- 芳华灯杆
    POLE_YOUNG(25L, "pole_young", "hoolink", "芳华", InstructionCodeType.MONITOR_HOOLINK, 13L),
    // ----- F9灯杆
    POLE_F9(26L, "pole_f9", "hoolink", "F9", InstructionCodeType.MONITOR_HOOLINK, 13L);

    private Long subType;
    private String subCode;
    private String factory;
    private String typeName;
    private Long type;
    private InstructionCodeType instructionCodeType;

    public Long getSubType() {
        return subType;
    }

    public String getSubCode() {
        return subCode;
    }

    public String getFactory() {
        return factory;
    }

    public String getTypeName() {
        return typeName;
    }

    public Long getType() {
        return type;
    }

    DeviceSubTypeEnum(Long subType, String subCode, String factory, String typeName, InstructionCodeType instructionCodeType, Long type) {
        this.subType = subType;
        this.subCode = subCode;
        this.factory = factory;
        this.typeName = typeName;
        this.instructionCodeType = instructionCodeType;
        this.type = type;
    }

    public static final InstructionCodeType getInstructionByCode(Long type) {
        for (DeviceSubTypeEnum subType : DeviceSubTypeEnum.values()) {
            if (subType.subType.equals(type)) {
                return subType.instructionCodeType;
            }
        }
        return null;
    }

    public static final DeviceSubTypeEnum getByType(Long type) {
        for (DeviceSubTypeEnum subType : DeviceSubTypeEnum.values()) {
            if (subType.subType.equals(type)) {
                return subType;
            }
        }
        return null;
    }

    public static final DeviceSubTypeEnum getByCode(String code) {
        for (DeviceSubTypeEnum subType : DeviceSubTypeEnum.values()) {
            if (subType.subCode.equals(code)) {
                return subType;
            }
        }
        return null;
    }

    public static final DeviceSubTypeEnum getByTypeName(String typeName) {
        for (DeviceSubTypeEnum subType : DeviceSubTypeEnum.values()) {
            if (subType.typeName.equals(typeName)) {
                return subType;
            }
        }
        return null;
    }

    public static final List<Long> getSubTypeByType(DeviceTypeEnum type) {
        return getSubTypeByType(type.getDeviceType());
    }

    public static final List<Long> getSubTypeByType(Long type) {
        List<Long> subTypes = new ArrayList<>();
        for (DeviceSubTypeEnum subType : DeviceSubTypeEnum.values()) {
            if (Objects.equals(subType.getType(), type)) {
                subTypes.add(subType.getSubType());
            }
        }
        return subTypes;
    }
}