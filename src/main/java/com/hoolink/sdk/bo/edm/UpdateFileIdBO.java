package com.hoolink.sdk.bo.edm;

import lombok.Data;

/**
 * @author lixiaoran
 * 上传cad
 * @data 2019-09-26 15:36
 */
@Data
public class UpdateFileIdBO {
    /**
     * 数据库已经存在的obsId
     */
    private Long fileResourceId;
    /**
     * 需要修改的备份的minioId
     */
    private Long backupObsId;
    /**
     * 资源库的类型
     */
    private Integer repertoryType;
}
