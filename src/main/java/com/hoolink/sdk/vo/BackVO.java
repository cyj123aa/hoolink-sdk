package com.hoolink.sdk.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author by zhao_aken on 2017/11/28.
 */
@Data
public class BackVO<T> implements Serializable {
    private static final long serialVersionUID = 2646066073040145908L;

    private Boolean status;

    private T data;

    private String message;

    /**
     * 是否跳转到登录页面
     */
    private Boolean ifLogin;

    public BackVO() {

    }

    public BackVO(Boolean status) {
        this.status = status;
    }

}
