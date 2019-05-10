package com.hoolink.sdk.bo.rpc;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ${zht}
 * @date 2018/9/27
 */
@Data
public class PageParamBO implements Serializable {
    private static final long serialVersionUID = 44186978370985935L;
    private Integer pageNo;
    private Integer pageSize;
}
