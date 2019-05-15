package com.hoolink.sdk.enums;

import com.hoolink.sdk.utils.ByteUtil;

/**
 * @ClassName MediaTaskEnum
 * @Author huyaxi
 * @DATE 2019/5/15 13:47
 */
public enum  MediaTaskEnum {
    NORMAL(ByteUtil.intToByte(1),"常规"),
    STRATEGY(ByteUtil.intToByte(2),"策略");

    private Byte type;
    private String description;
    MediaTaskEnum(Byte type, String description) {
        this.type = type;
       this.description = description;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }}
