package com.hoolink.sdk.bo.ability;

import lombok.Data;

/**
 * 
 * @author lijunling
 *
 * 2019年6月11日-下午8:51:24
 */
@Data
public class MinioBO {
    /**
     * ID
     */
    private Long id;

    /**
     * 桶名称
     */
    private String bucketName;

    /**
     * 对象key值用于查询文件
     */
    private String objectKey;

    /**
     * 文件标签
     */
    private String etag;

    /**
     * 创建人
     */
    private Long creator;

    /**
     * 创建时间
     */
    private Long created;

    /**
     * 文件名称
     */
    private String fileName;

    /**
     * 文件后缀名
     */
    private String fileExt;

    /**
     * 文件大小
     */
    private Long fileSize;

    /**
     * 修改人
     */
    private Long updator;

    /**
     * 修改时间
     */
    private Long updated;

    /**
     * 是否可用
     */
    private Boolean enabled;

}
