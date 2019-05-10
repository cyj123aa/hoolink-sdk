package com.hoolink.sdk.enums;

/**
 * @author XuBaofeng.
 * @date 2019-04-09 17:43.
 * <p>
 * description:
 */
public enum DeviceRunStatusEnum {
    /*** 未知 */
    UNKNOWN((byte) 0, "未知"),
    /*** 运行中 */
    DEVICE_RUN((byte) 1, "运行中"),
    /*** 关闭中 */
    DEVICE_STOP((byte) 2, "停止");

    private Byte runStatus;
    private String runMsg;

    DeviceRunStatusEnum(Byte runStatus, String runMsg) {
        this.runStatus = runStatus;
        this.runMsg = runMsg;
    }

    public Byte getRunStatus() {
        return runStatus;
    }

    public String getRunMsg() {
        return runMsg;
    }

    public static final DeviceRunStatusEnum getByStatus(Byte status) {
        for (DeviceRunStatusEnum runEnum : DeviceRunStatusEnum.values()) {
            if (runEnum.runStatus.equals(status)) {
                return runEnum;
            }
        }
        return null;
    }

    public static final DeviceRunStatusEnum getByStatus(String msg) {
        for (DeviceRunStatusEnum runEnum : DeviceRunStatusEnum.values()) {
            if (runEnum.runMsg.equals(msg)) {
                return runEnum;
            }
        }
        return null;
    }
}
