package com.hoolink.sdk.enums;

/**
 * @Author : LiYuSheng
 * @Date : Created on 15:24 2018/5/28 0028.
 * 流程类型枚举
 */
public enum ProcessType {
    /**
     * 工单流程
     */
    GONG_DAN(1,"工单"),
    ;
    private Integer statusCode;
    private String statusType;

    ProcessType(Integer statusCode,String statusType) {
        this.statusCode = statusCode;
        this.statusType = statusType;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public String getStatusType() {
        return statusType;
    }
}
