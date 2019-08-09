package com.hoolink.sdk.bo.base;

import lombok.Data;

/**
 * @author chenzhixiong
 * @date 2019/8/8 16:18
 */
@Data
public class MiddleProjectAnnexBO {
    /**
     * <pre>
     * 主键id
     * 表字段 : middle_project_file.id
     * </pre>
     */
    private Long id;

    /**
     * <pre>
     * 对应项目id
     * 表字段 : middle_project_file.project_id
     * </pre>
     */
    private Long projectId;

    /**
     * <pre>
     * 对应文件id
     * 表字段 : middle_project_file.file_id
     * </pre>
     */
    private Long fileId;

    /**
     * <pre>
     * 文件名字
     * 表字段 : middle_project_file.file_name
     * </pre>
     */
    private String fileName;

    /**
     * <pre>
     * 文件地址
     * 表字段 : middle_project_file.file_url
     * </pre>
     */
    private String fileUrl;

    /**
     * <pre>
     * 文件大小
     * 表字段 : middle_project_file.file_size
     * </pre>
     */
    private Long fileSize;

    /**
     * <pre>
     * 上传时间
     * 表字段 : middle_project_file.created
     * </pre>
     */
    private Long created;

}
