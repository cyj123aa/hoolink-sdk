package com.hoolink.sdk.bo.base;

import com.hoolink.sdk.param.PageParam;
import lombok.Data;

/**
 * @author chenzhixiong
 * @date 2019/8/9 9:13
 */
@Data
public class SearchProjectAnnexParamBO extends PageParam {
    private String fileName;
}
