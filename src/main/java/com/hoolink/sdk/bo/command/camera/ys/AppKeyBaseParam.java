package com.hoolink.sdk.bo.command.camera.ys;

/**
 * @author chenzhixiong
 * @date 2018/12/29 14:02
 */

public class AppKeyBaseParam {
    private String appKey;
    private String appSecret;

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    @Override
    public String toString() {
        return "AppKeyBaseParam{" +
                "appKey='" + appKey + '\'' +
                ", appSecret='" + appSecret + '\'' +
                '}';
    }
}
