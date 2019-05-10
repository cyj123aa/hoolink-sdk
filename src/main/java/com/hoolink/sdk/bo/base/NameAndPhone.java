package com.hoolink.sdk.bo.base;

import lombok.Data;

/**
 * @author chenyuejun
 */
@Data
public class NameAndPhone {

    /**
     * <pre>
     * 手机号
     * 表字段 : base_user.phone
     * </pre>
     */
    private String phone;

    /**
     * <pre>
     * 姓名
     * 表字段 : base_user.user_name
     * </pre>
     */
    private String name;
}
