package com.hoolink.sdk.bo.edm;

import lombok.Data;

/**
 * 
 * @author lijunling
 *
 * @date 2019/06/17 19:22
 */
@Data
public class OperateFileLogBO {
    /**
     * 操作时间
     */
    private Long created;
    
    /**
     * 操作者
     */
    private String operateName;
    
    /**
     * 操作内容
     */
    private String operateContent;
    
    /**
     * 相关文件
     */
    private String targetResouceName;
    
    /**
     * 操作结果
     */
    private String operateResult;

}
