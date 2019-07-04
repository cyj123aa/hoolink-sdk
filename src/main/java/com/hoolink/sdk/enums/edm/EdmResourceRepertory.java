package com.hoolink.sdk.enums.edm;

/**
 * @description: EDM系统资源库枚举
 * @author: WeiMin
 * @date: 2019-05-22
 **/
public enum EdmResourceRepertory {

    DEPT_RESOURCE_CODE(1,"DEPT_REPERTORY"),
    CACHE_RESOURCE_CODE(2,"CACHE_REPERTORY"),
    COMPANY_RESOURCE_CODE(3,"COMPANY_REPERTORY"),
    PUBLIC_RESOURCE_CODE(4,"PUBLIC_REPERTORY"),
    COLLECT_RESOURCE_CODE(5,"COLLECT_REPERTORY"),
    ;

    private Integer key;
    private String code;

    EdmResourceRepertory(Integer key, String code) {
        this.key = key;
        this.code = code;
    }

    public static String getCode(Integer key) {
        for (EdmResourceRepertory repertory : EdmResourceRepertory.values()) {
            if (repertory.key.equals(key)) {
                return repertory.code;
            }
        }
        return null;
    }

    public static final EdmResourceRepertory getByType(Integer type) {
        for (EdmResourceRepertory edmResourceRepertory : EdmResourceRepertory.values()) {
            if (edmResourceRepertory.key.equals(type)) {
                return edmResourceRepertory;
            }
        }
        return null;
    }

    public Integer getKey() {
        return key;
    }

    public String getCode() {
        return code;
    }
}
