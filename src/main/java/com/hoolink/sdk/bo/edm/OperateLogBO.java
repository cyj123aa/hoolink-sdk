package com.hoolink.sdk.bo.edm;

import com.hoolink.sdk.param.PageParam;
import lombok.Data;

/**
 * @author chenzhixiong
 * @date 2019/5/28 10:41
 */
@Data
public class OperateLogBO extends PageParam {

    private Long id;

    private Long created;

    private Long creator;
    /**
     * 操作类型
     */
    private String operateType;

}
