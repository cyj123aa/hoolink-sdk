package com.hoolink.sdk.bo.command.camera.ys;

/**
 * @author chenzhixiong
 * @date 2018/12/29 14:02
 */
public class ControlBackBO {
    private String msg;
    private String code;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "ControlBackBO{" +
                "msg='" + msg + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
