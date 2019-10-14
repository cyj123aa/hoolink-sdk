package com.hoolink.sdk.bo.omc;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
 * @author chenyuejun
 */
@Data
public class LabelBO {
    /**
     * 连接线中间文案
     */
    @Length(max = 10, message = "节点线长度为0到10")
    private String text;
}
