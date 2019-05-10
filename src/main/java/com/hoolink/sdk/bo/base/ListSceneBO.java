package com.hoolink.sdk.bo.base;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/4/16 17:36
 */
@Data
public class ListSceneBO implements Serializable {
    private static final long serialVersionUID = -2821859933786242509L;
    
    /*** 场景ID */
    private Long id;

    /*** 场景名称 */
    private String scencName;
}
