package com.hoolink.sdk.bo.omc;

import lombok.Data;

/**
 * @author chenyuejun
 */

@Data
public class EdgesBO {
    private String id;

    /**
     * 连线颜色
     */
    private String shape;
    /**
     * 连线颜色
     */
    private String source;
    /**
     * 连线颜色
     */
    private Long sourceAnchor;
    /**
     * 连线颜色
     */
    private String target;
    /**
     * 连线颜色
     */
    private Long targetAnchor;
    /**
     * 连线颜色
     */
    private String edgesId;
    /**
     * 连线颜色
     */
   // private StyleBO style;

    /**
     * 连线颜色
     */
    private Long index;
    /**
     * 连线颜色
     */
    private String label;


    /**
     * 连线颜色
     */
    private LabelRectStyleBO labelRectStyle;


}
