package com.hoolink.sdk.enums.edm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenzhixiong
 * @date 2019/6/3 14:14
 * 文件密保等级
 */
public enum FileSecurityLevel {
    FIFTH_LEVEL(0,"特级"),
    FIRST_LEVEL(1,"一级"),
    SECOND_LEVEL(2,"二级"),
    THIRD_LEVEL(3,"三级"),
    FOURTH_LEVEL(4,"四级"),
    ;
    private Integer key;
    private String code;

    FileSecurityLevel(Integer key, String code) {
        this.key = key;
        this.code = code;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public static String getCode(Integer key) {
        for (FileSecurityLevel securityLevel : FileSecurityLevel.values()) {
            if (securityLevel.key.equals(key)) {
                return securityLevel.code;
            }
        }
        return null;
    }

    public static List<FileSecurityLevel> getAll() {
        List<FileSecurityLevel> list = new ArrayList<>();
        for (FileSecurityLevel securityLevel : FileSecurityLevel.values()) {
            list.add(securityLevel);
        }
     return list;
    }


}
