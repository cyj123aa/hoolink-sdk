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
     * 文件类型，如图片，视频，pdf等
     */
    private Integer type;

    /**
     * 是否是组织架构
     */
    private boolean ifDepartment;

    /**
     * 是否是最后一层组织架构
     */
    private boolean ifLastDepartment;

    /**
     * 文件大小
     */
    private String fileSize;

    /**
     * 文件后缀
     */
    private String fileSuffix;

    /**
     * 文件时间
     */
    private Long created;

    /**
     * 是否是文件夹
     */
    private Boolean fileType;

    /**
     * 文件url
     */
    private String fileUrl;

    /**
     * 是否已收藏
     */
    private Boolean ifCollect;
}
