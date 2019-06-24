package com.hoolink.sdk.enums.mdc;

/**
 * @author 朱礼
 * @Date 2019/6/11
 * @Desc
 */
public enum MessageTypeEnum {
    /** 设备故障消息 */
    DEVICE_FAULT(1L, "设备故障消息"),
    /** 阈值消息 */
    BOUND_MESSAGE(2L, "阈值消息"),
    /** 工单消息 */
    ORDER_MESSAGE(3L,"工单消息"),
    /** 事件消息 */
    EVENT_MESSAGE(4L, "事件消息"),
    /** 公告消息 */
    ANNOUNCEMENT_NEWS(5L, "系统消息"),
    /** 提醒消息 */
    REMIND_MESSAGE(6L, "提醒消息");

    private Long typeId;
    private String typeName;

    public Long getTypeId() {
        return typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    MessageTypeEnum(Long typeId, String typeName) {
        this.typeId = typeId;
        this.typeName = typeName;
    }

    public static final MessageTypeEnum getByTypeId(Long typeId) {
        for (MessageTypeEnum typeEnum : MessageTypeEnum.values()) {
            if (typeEnum.typeId.equals(typeId)) {
                return typeEnum;
            }
        }
        return null;
    }
}
