package com.hoolink.sdk.enums;

/**
 * @Author: tonghao
 * @Date: 2019/5/9 10:00
 */
public enum OperateTypeEnum {

    INSERT("新增"),
    UPDATE("修改");

    private String operate;

    public String getOperate() {
        return operate;
    }

    OperateTypeEnum(String operate) {
        this.operate = operate;
    }
}
