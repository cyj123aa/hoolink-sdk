package com.hoolink.sdk.bo.edm;

import lombok.Data;

/**
 * @Author: xuli
 * @Date: 2019/6/15 15:01
 */
@Data
public class MobileFileBO {

    private Long id;

    private String name;

    /**
     * 是否是组织架构
     */
    private boolean ifDepartment;

    /**
     * 是否是最后一层组织架构
     */
    private boolean ifLastDepartment;
}
