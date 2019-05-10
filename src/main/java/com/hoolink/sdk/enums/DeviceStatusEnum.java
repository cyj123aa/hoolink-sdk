package com.hoolink.sdk.enums;

/**
 * @author XuBaofeng.
 * @date 2019-04-25 15:25.
 * <p>
 * description:
 */
public enum DeviceStatusEnum {
    /*** 设备状态 */
    OPEN(1, "工作中"),
    CLOSE(2, "在线"),
    ALARM(3, "故障"),
    OFFLINE(4, "离线"),
    MAINTAIN(5, "维修中");

    private Integer status;
    private String name;

    private DeviceStatusEnum(Integer status, String name) {
        this.status = status;
        this.name = name;
    }

    public int getStatus() {
        return this.status;
    }

    public String getName() {
        return this.name;
    }

    public static final DeviceStatusEnum getByStatus(Integer status) {
        for (DeviceStatusEnum statusEnum : DeviceStatusEnum.values()) {
            if (statusEnum.status.equals(status)) {
                return statusEnum;
            }
        }
        return null;
    }
}
