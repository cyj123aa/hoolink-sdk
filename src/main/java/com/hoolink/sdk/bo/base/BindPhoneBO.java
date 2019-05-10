package com.hoolink.sdk.bo.base;

import com.hoolink.sdk.annotation.valid.Mobile;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author zhangxin
 * @date 2019/4/23
 */
@Data
public class BindPhoneBO {

    /*** 手机号 */
    @Mobile
    private String phone;
    /*** 验证码 */
    @NotBlank(message = "验证码不允许为空")
    private String captcha;
}
