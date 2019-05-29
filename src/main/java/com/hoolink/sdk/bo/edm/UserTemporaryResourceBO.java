package com.hoolink.sdk.bo.edm;

import lombok.Data;

/**
 * @description: 用户临时文件资源
 * @author: WeiMin
 * @date: 2019-05-29
 **/
@Data
public class UserTemporaryResourceBO {
    /**
     * 文件id
     */
    private Long id;

    /**
     * 组织架构id
     */
    private Long dept_id;

    /**
     * 文件类型
     */
    private Byte resource_type;
}
