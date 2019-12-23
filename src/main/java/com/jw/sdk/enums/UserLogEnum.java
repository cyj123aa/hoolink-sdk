package com.jw.sdk.enums;

import java.util.Objects;

/**
 * Created by zhangx on 2018/6/14.
 */
public enum UserLogEnum {
    /**
     * 登录系统
     */
    USER_LOGIN("/base/user/login", "登录系统"),
    /**
     * 退出登录
     */
    USER_EXIT_LOGIN("/base/user/exitLogin", "退出登录");

    private String url;
    private String action;

    UserLogEnum(String url, String action) {
        this.url = url;
        this.action = action;
    }

    public static String getUserActionByUrl(String url) {
        for (UserLogEnum userLogEnum : UserLogEnum.values()) {
            if (Objects.equals(url, userLogEnum.url)) {
                return userLogEnum.action;
            }
        }
        return null;
    }

    public String getUrl() {
        return url;
    }

    public String getAction() {
        return action;
    }
}
