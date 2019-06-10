package com.hoolink.sdk.enums.edm;

/**
 * @description: EDM系统资源库枚举
 * @author: WeiMin
 * @date: 2019-05-22
 **/
public enum EdmResourceRepertory {

    DEPT_RESOURCE_CODE(1,"deptRepertory"),
    CACHE_RESOURCE_CODE(2,"cacheRepertory"),
    COMPANY_RESOURCE_CODE(3,"companyRepertory"),
    PUBLIC_RESOURCE_CODE(4,"publicRepertory"),
    COLLECT_RESOURCE_CODE(5,"collectRepertory"),
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
