package com.hoolink.sdk.bo.base;

import com.hoolink.sdk.annotation.valid.Mobile;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.groups.Default;

/**
 * @author zhangxin
 * @date 2019/4/25
 */
@Data
public class UpdatePhoneBO {

    /*** 新手机号 */
    @NotBlank(message = "手机号不允许为空", groups = {Default.class, Group.User.Phone.class})
    @Mobile(groups = {Default.class, Group.User.Phone.class})
    private String phone;

    /*** 新手机验证码 */
    @NotBlank(message = "验证码不允许为空", groups = {Default.class, Group.User.Captcha.class})
    private String captcha;

    /*** 原手机验证码 */
    @NotBlank(message = "验证码不允许为空", groups = {Default.class, Group.User.OldCaptcha.class})
    private String oldCaptcha;
}
