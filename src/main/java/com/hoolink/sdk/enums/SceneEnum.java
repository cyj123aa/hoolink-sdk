package com.hoolink.sdk.enums;

/**
 * @author ${zht}
 * @date 2018/10/24
 *  场景枚举
 */
public enum SceneEnum {
    /***场景*/
    PARK_SCENE("公园", 1L),
    FACTORY_SCENE("工厂", 5L),
    ROAD_SCENE("道路",3L)
    ;
    private String name;
    private Long type;

    SceneEnum(String name, Long type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public Long getType() {
        return type;
    }

}
