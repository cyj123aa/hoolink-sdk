package com.hoolink.sdk.bo.base;

import lombok.Data;

import java.io.Serializable;

/**
 * @author <a herf="mailto:yanwu0527@163.com">XuBaofeng</a>
 * @date 2019-05-24 13:53.
 * <p>
 * description:
 */
@Data
public class LoginProjectBO implements Serializable {

    private Long projectId;

    private String projectNo;

    private String projectName;

    private Long scencId;

    private Long modelId;

    private String modelUrl;
}
