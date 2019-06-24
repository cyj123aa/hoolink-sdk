package com.hoolink.sdk.enums.mdc;

import lombok.Getter;

/**
 * @author 朱礼
 * @Date 2019/6/11
 * @Desc
 */
@Getter
public enum MessageSubTypeEnum {
    /** 漏电故障 */
    LEAKAGE_FAULT(1L, "漏电故障"),
    /** 电压故障 */
    VOLTAGE_FAULT(2L, "电压故障"),
    /** 电流故障 */
    CURRENT_FAULT(3L,"电流故障"),
    /** 短路故障 */
    SHORT_CIRCUIT_FAULT(4L, "短路故障"),
    /** 设备阈值 */
    DEVICE_THRESHOLD(5L, "设备阈值"),
    /** 环境阈值 */
    ENVIRONMENT_THRESHOLD(6L, "环境阈值"),
    /** 气体阈值 */
    GAS_THRESHOLD(7L, "气体阈值"),
    /** 水质阈值 */
    WATER_QUALITY_THRESHOLD(8L, "水质阈值"),
    /** 水位阈值 */
    WATER_LEVEL_THRESHOLD(9L, "水位阈值"),
    /** 土壤阈值 */
    SOIL_THRESHOLD(10L, "土壤阈值"),
    /** 漏电阈值 */
    LEAKAGE_THRESHOLD(11L, "漏电阈值"),
    /** 特殊阈值 */
    SPECIAL_THRESHOLD(12L, "特殊阈值"),
    /** 创建消息 */
    CREATE_MESSAGE(13L, "创建消息"),
    /** 审批消息 */
    APPROVAL_MESSAGE(14L, "审批消息"),
    /** 完成消息 */
    FINISH_MESSAGE(15L, "完成消息"),
    /** 进出门事件 */
    ENTRY_EXIT_EVENT(16L, "进出门事件"),
    /** 异常外出事件 */
    ABNORMAL_OUT_EVENT(17L, "异常外出事件"),
    /** 区域入侵事件 */
    REGIONAL_INVASION_EVENT(18L, "区域入侵事件"),
    /** 非本区域人员事件 */
    NON_REGIONAL_PERSON_EVENT(19L, "非本区域人员事件"),
    /** 访客事件 */
    VISITOR_EVENT(20L, "访客事件"),
    /** 升级公告 */
    UPGRADE_ANNOUNCEMENT(21L, "升级公告"),
    /** 推广公告 */
    PROMOTION_ANNOUNCEMENT(22L, "推广公告"),
    /** 手动开启 */
    MANUALLY_OPEN(23L, "手动开启"),
    /** 手动关闭 */
    MANUALLY_CLOSE(24L, "手动关闭"),
    /** 定时开启 */
    TIMING_OPEN(25L, "定时开启"),
    /** 定时关闭 */
    TIMING_CLOSE(26L, "定时关闭");

    private Long subTypeId;
    private String subTypeName;

    MessageSubTypeEnum(Long subTypeId, String subTypeName) {
        this.subTypeId = subTypeId;
        this.subTypeName = subTypeName;
    }

    public static final MessageSubTypeEnum getBySubTypeId(Long subTypeId) {
        for (MessageSubTypeEnum typeEnum : MessageSubTypeEnum.values()) {
            if (typeEnum.subTypeId.equals(subTypeId)) {
                return typeEnum;
            }
        }
        return null;
    }
}
