package com.hoolink.sdk.bo.base;

/**
 * @author zhangxin
 * @date 2019/4/17
 */
public interface Group {

    interface Admin{}

    /** 用户校验分组 */
    interface User{
        interface Login{}

        interface Account{}
        interface CustomerNo{}
        interface Password{}
        interface Role{}
        interface Name{}
        interface Status{}
        interface Sex{}
        interface Image{}
        interface Captcha{}
        interface OldCaptcha{}
        interface Phone{}
    }

    interface Role {
        interface Create{}
        interface Update{}
    }
}
