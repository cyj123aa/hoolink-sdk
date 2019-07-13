package com.hoolink.sdk.bo.base;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhangxin
 * @date 2019/7/12
 */
@Data
public class UserLogBO implements Serializable {

    private static final long serialVersionUID = 4610714168063415876L;

    private Long userId;

    private String customerNo;

    private String account;

    private String userName;

    private String requestUrl;

    private Boolean requestResult;

    private String requestParam;

    private String traceId;

    private Long created;
}
