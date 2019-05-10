package com.hoolink.sdk.bo.base;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.groups.Default;
import java.io.Serializable;

/**
 * 登录类
 *
 * @author zhangxin
 * @date 2019/4/18
 */
@Data
public class LoginUserBO implements Serializable {

    private static final long serialVersionUID = 6094530607881521385L;

    /**
     * 客户号
     */
    @NotEmpty(message = "客户号不允许为空", groups = {Group.User.CustomerNo.class, Group.User.Login.class, Default.class})
    private String customerNo;

    /**
     * 账号
     */
    @NotEmpty(message = "账号不允许为空", groups = {Group.User.Account.class, Group.User.Login.class, Default.class})
    private String account;

    /**
     * 密码
     */
    @NotEmpty(message = "密码不允许为空", groups = {Group.User.Password.class, Group.User.Login.class})
    private String password;

    /**
     * 验证码
     */
    @NotBlank(message = "验证码不允许为空", groups = {Group.User.Captcha.class})
    private String captcha;

}
