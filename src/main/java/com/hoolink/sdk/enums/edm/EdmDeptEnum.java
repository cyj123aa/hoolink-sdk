package com.hoolink.sdk.enums.edm;

/**
 * @description: EDM系统组织架构枚举
 * @author: WeiMin
 * @date: 2019-05-22
 **/
public enum EdmDeptEnum {

    COMPANY(1),
    DEPT(2),
    POSITION(3),
    ;

    private Integer key;

    EdmDeptEnum(Integer key) {
        this.key = key;
    }

    public Integer getKey() {
        return key;
    }
}
