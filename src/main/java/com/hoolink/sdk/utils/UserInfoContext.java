package com.hoolink.sdk.utils;

import com.hoolink.sdk.bo.base.CurrentUserBO;

/**
 * @author chenzhixiong
 * @date 2019/10/15 11:52
 */
public class UserInfoContext {
    private static ThreadLocal<CurrentUserBO> userInfo = new ThreadLocal<CurrentUserBO>();
    public static String KEY_USERINFO_IN_HTTP_HEADER = "X-AUTO-FP-USERINFO";

    public UserInfoContext() {
    }

    public static CurrentUserBO getUser(){
        return (CurrentUserBO)userInfo.get();
    }

    public static void setUser(CurrentUserBO user){
        userInfo.set(user);
    }
}