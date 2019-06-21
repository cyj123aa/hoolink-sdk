package com.hoolink.sdk.bo.edm;

import lombok.Data;

/**
 * @Author : lys
 * @Date : 2019/6/18 15:43
 * @Instructions : 组织架构对应资源BO
 */
@Data
public class OrganizationalStructureFileBO {
    /**
     * 组织架构id
     */
    Long directoryId;

    /**
     * 组织架构名
     */
    String resourceName;

    /**
     * 是否为组织架构
     */
    private Boolean isOrganizationalStructure;

    /**
     * 是否为最下级组织架构
     */
    private Boolean isLastOrganizationalStructure;

}
