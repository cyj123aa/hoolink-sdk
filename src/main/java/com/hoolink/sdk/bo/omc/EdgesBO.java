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
    private Integer sourceAnchor;
    /**
     * 连线颜色
     */
    private String target;
    /**
     * 连线颜色
     */
    private Integer targetAnchor;
    /**
     * 连线颜色
     */
    private String edgesId;
    /**
     * 连线颜色
     */
    private StyleBO style;

    /**
     * 连线颜色
     */
    private Integer index;
    /**
     * 连线颜色
     */
    private LabelBO label;


    /**
     * 连线颜色
     */
    private LabelRectStyleBO labelRectStyle;


}
