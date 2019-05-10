package com.hoolink.sdk.enums;

import java.util.HashMap;
import java.util.Map;

public enum AiConfigEnum {

    /**
     * UNCONNECTED
     */
    UNCONNECTED(1, "未连接", "UNCONNECTED"),

    /**
     * READY
     */
    READY(2, "已准备", "READY"),

    /**
     * RUNNING
     */
    RUNNING(3, "运行中", "RUNNING"),

    /**
     * FAIL
     */
    FAIL(4, "失败", "FAIL"),

    /**
     * STOPPED
     */
    STOPPED(5, "停止", "STOPPED"),

    ;
    private Integer key;
    private String value;
    private String name;

    AiConfigEnum(Integer key, String value, String name) {
        this.key = key;
        this.value = value;
        this.name = name;
    }

    public static String getValue(Integer key) {
        for (com.hoolink.sdk.enums.AiConfigEnum aiConfigEnum : com.hoolink.sdk.enums.AiConfigEnum.values()) {
            if (aiConfigEnum.key.equals(key)) {
                return aiConfigEnum.value;
            }
        }
        return null;
    }

    public static Map getKeyAndValueValue(String name) {
        for (com.hoolink.sdk.enums.AiConfigEnum aiConfigEnum : com.hoolink.sdk.enums.AiConfigEnum.values()) {
            if (aiConfigEnum.name.equals(name)) {
                Integer key = aiConfigEnum.key;
                String value = aiConfigEnum.value;
                Map<String, Object> resultMap = new HashMap<>(2);
                resultMap.put("nodeState", value);
                resultMap.put("nodeStateKey", key);
                return resultMap;
            }
        }
        return null;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
