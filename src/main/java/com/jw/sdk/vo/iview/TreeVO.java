package com.jw.sdk.vo.iview;

import lombok.Data;

import java.util.List;

/**
 * 树形控件类
 *
 * @author zhangxin
 * @date 2018/11/23
 */
@Data
public class TreeVO<T> {

    /**
     * 单项ID
     */
    private String id;
    /**
     * 值
     */
    private T value;
    /**
     * 当前项类型
     */
    private String type;
    /**
     * 标题
     */
    private String title;
    /**
     * 是否展开直子节点
     */
    private Boolean expand;
    /**
     * 是否勾选
     */
    private Boolean checked;
    /**
     * 数据
     */
    private T data;
    /**
     * 子节点
     */
    private List children;
}
