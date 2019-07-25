package com.hoolink.sdk.bo.omc;

import io.swagger.models.auth.In;
import lombok.Data;

/**
 * @author chenyuejun
 */

@Data
public class EdgesBO {
    private String id;

    /**
     * 节点样式
     */
    private String shape;
    /**
     * 下级关联节点id
     */
    private String source;
    /**
     * 链接线
     */
    private Integer sourceAnchor;
    /**
     * 上级节点
     */
    private String target;
    /**
     * 链接点位
     */
    private Integer targetAnchor;
    /**
     * 当前步骤id
     */
    private String edgesId;
    /**
     * 连线颜色
     */
    private StyleBO style;

    /**
     * 下标
     */
    private Integer index;
    /**
     * 连线中间文案
     */
    private LabelBO label;


    /**
     * 连接线中间文案背景颜色
     */
    private LabelRectStyleBO labelRectStyle;


}
