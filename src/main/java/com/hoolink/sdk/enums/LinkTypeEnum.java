package com.hoolink.sdk.enums;

/**
 * @author zhaojunwei
 * @packageName .enums
 * @date 2018/8/15
 * @description: 连接类型
 */
public enum  LinkTypeEnum {
    /***连接类型*/
    HTTP(1),
    FTP(2),
    ;
    private Integer type;

    LinkTypeEnum(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
