package com.hoolink.sdk.enums;

/**
 * @author XuBaofeng.
 * @date 2019-04-09 17:31.
 * <p>
 * description:
 */
public enum DeviceAlarmStatusEnum {
    /*** 未知 */
    UNKNOWN((byte) 0, "未知"),
    /*** 维修中 */
    MAINTENANCE((byte) 1, "维修中"),
    /*** 断线 */
    DEVICE_OFFLINE((byte) 2, "断线"),
    /*** 在线 */
    DEVICE_ONLINE((byte) 3, "在线");

    private Byte alarmStatus;
    private String alarmMsg;

    DeviceAlarmStatusEnum(Byte alarmStatus, String alarmMsg) {
        this.alarmStatus = alarmStatus;
        this.alarmStatus = alarmStatus;
    }

    public Byte getAlarmStatus() {
        return alarmStatus;
    }

    public String getAlarmMsg() {
        return alarmMsg;
    }

    public static final DeviceAlarmStatusEnum getByStatus(Byte status) {
        for (DeviceAlarmStatusEnum statusEnum : DeviceAlarmStatusEnum.values()) {
            if (statusEnum.alarmStatus.equals(status)) {
                return statusEnum;
            }
        }
        return null;
    }

    public static final DeviceAlarmStatusEnum getByStatus(String msg) {
        for (DeviceAlarmStatusEnum statusEnum : DeviceAlarmStatusEnum.values()) {
            if (statusEnum.alarmMsg.equals(msg)) {
                return statusEnum;
            }
        }
        return null;
    }
}
