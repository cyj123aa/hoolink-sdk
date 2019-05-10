package com.hoolink.sdk.enums;

/**
 * @author wangdong
 * @date 2019/4/26 14:01
 */
public enum LogResultEnum {

    /*** 日志结果 */
    FAILURE(0, "失败"),
    SUCCESS(1, "成功");

    private Integer status;
    private String name;

    private LogResultEnum(Integer status, String name) {
        this.status = status;
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public static String getByStauts(Integer status) {
        for (LogResultEnum logResultEnum : LogResultEnum.values()) {
            if (logResultEnum.getStatus().equals(status)) {
                return logResultEnum.getName();
            }
        }
        return null;
    }
}
