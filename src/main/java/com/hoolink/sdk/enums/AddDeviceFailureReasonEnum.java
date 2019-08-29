package com.hoolink.sdk.enums;

/**
 * @author wangdong
 */
public enum AddDeviceFailureReasonEnum {

    /*** 系统错误 */
    SYSTEM_ERROR(1, "系统错误"),

    /*** 第三方平台添加失败 */
    THIRD_PARTY_PLATFORM_FAILURE(2, "第三方平台添加失败");

    private Integer type;

    private String reason;

    public Integer getType() {
        return type;
    }

    public String getReason() {
        return reason;
    }

    AddDeviceFailureReasonEnum(Integer type, String reason) {
        this.type = type;
        this.reason = reason;
    }

    public static String getReasonByType(Integer type) {
        for (AddDeviceFailureReasonEnum addDeviceFailureReasonEnum : AddDeviceFailureReasonEnum.values()) {
            if (addDeviceFailureReasonEnum.reason.equals(type)) {
                return addDeviceFailureReasonEnum.reason;
            }
        }
        return null;
    }
}
