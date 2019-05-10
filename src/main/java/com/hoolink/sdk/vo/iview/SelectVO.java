package com.hoolink.sdk.vo.iview;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

/**
 * 前台Select查询组件数据类，支持级联操作
 *
 * @author zhangxin
 * @date 2018/11/16
 */
@Data
public class SelectVO<T> {

    private T value;
    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String type;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<SelectVO> children;
}
