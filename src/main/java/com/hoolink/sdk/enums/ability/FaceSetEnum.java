package com.hoolink.sdk.enums.ability;

import com.hoolink.sdk.utils.ByteUtil;

/**
 * @ClassName FaceSetEnum
 * @Author huyaxi
 * @DATE 2019/5/30 20:13
 */
public enum FaceSetEnum {

    /**
     * 巡检人脸库
     */
    FACE_SET_INSPECTION(ByteUtil.intToByte(1),"inspection");

    private Byte key;
    private String value;

    FaceSetEnum(Byte key, String value){
        this.key = key;
        this.value = value;
    }

    public Byte getKey() {
        return key;
    }

    public void setKey(Byte key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }}
