package com.hoolink.sdk.enums.edm;

/**
 * 文件类型枚举 0 文件 | 1 文件夹
 * @Author: tonghao
 * @Date: 2019/5/29 11:08
 */
public enum ResourceTypeEnum {

    FILE(false),
    FILEFOLER(true);

    private Boolean resourceType;

    public Boolean getResourceType() {
        return resourceType;
    }

    ResourceTypeEnum(Boolean resourceType) {
        this.resourceType = resourceType;
    }
}
