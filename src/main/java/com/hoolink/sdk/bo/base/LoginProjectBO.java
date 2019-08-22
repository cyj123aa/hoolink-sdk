package com.hoolink.sdk.bo.base;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author <a herf="mailto:yanwu0527@163.com">XuBaofeng</a>
 * @date 2019-05-24 13:53.
 * <p>
 * description:
 */
@Data
public class LoginProjectBO implements Serializable {
    private static final long serialVersionUID = -4870004080790526719L;

    private Long projectId;

    private String projectNo;

    private String projectName;

    private Long scencId;

    private Long modelId;

    private String modelUrl;

    private BigDecimal longitude;

    private BigDecimal latitude;
}
