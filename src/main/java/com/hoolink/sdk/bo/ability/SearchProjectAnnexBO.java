package com.hoolink.sdk.bo.ability;

import com.hoolink.sdk.param.PageParam;
import lombok.Data;

/**
 * @author chenzhixiong
 * @date 2019/8/6 13:56
 */
@Data
public class SearchProjectAnnexBO extends PageParam {
    private String fileName;
    /**
     * 文件格式
     */
    private String fileType;
    /**
     * 项目桶名
     */
    private String bucketName;
    /**
     * 项目id
     */
    private Long projectId;

}
