package com.hoolink.sdk.param;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author zhao_aken
 * Created by zhao_aken on 2017/11/27.
 */
public class BaseParam<T> implements Serializable {

    private static final long serialVersionUID = 3710671367322502503L;

    @NotNull(message = "参数不允许为空")
    private T data;

    public BaseParam() {

    }

    public BaseParam(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
