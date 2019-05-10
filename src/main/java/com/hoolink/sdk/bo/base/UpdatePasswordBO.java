package com.hoolink.sdk.bo.base;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author zhangxin
 * @date 2019/4/26
 */
@Data
public class UpdatePasswordBO {

    /*** 手机号 */
    @NotBlank(message = "密码不允许为空")
    private String password;
    /*** 验证码 */
    @NotBlank(message = "验证码不允许为空")
    private String captcha;
}
