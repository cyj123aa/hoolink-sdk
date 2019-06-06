package com.hoolink.sdk.bo.edm;

import lombok.Data;

/**
 * @author chenzhixiong
 * @date 2019/5/28 10:41
 */
@Data
public class OperateLogBO {

    private Long id;

    private String created;
    private Long creator;

    private String operateName;
    /**
     * 操作类型
     */
    private String operateType;

}
