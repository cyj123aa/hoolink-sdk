package com.hoolink.sdk.bo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhao_aken
 * Created by zhao_aken on 2017/11/28.
 */
@Data
public class BackBO<T> implements Serializable {

    private static final long serialVersionUID = 2021890794490866975L;
    /**
     * 本次返回状态
     */
    private Boolean status;

    /**
     * 返回数据
     */
    private T data;

    /**
     * 返回信息
     */
    private String message;

    public BackBO() {
    }

    public BackBO(Boolean status) {
        this.status = status;
    }

    public BackBO(String message) {
        this.message = message;
    }

    public BackBO(Boolean status, String message) {
        this.status = status;
        this.message = message;
    }

}
