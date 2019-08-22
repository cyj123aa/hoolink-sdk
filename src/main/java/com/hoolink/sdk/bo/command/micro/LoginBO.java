package com.hoolink.sdk.bo.command.micro;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author zhouyun
 * @date 2019/8/21 11:18
 * @desc
 **/
@Data
public class LoginBO implements Serializable {

    private static final long serialVersionUID = 8252866537138655608L;
    @NotBlank(message = "用户名不能为空")
    private String userName;
    @NotBlank(message = "登录密码不能为空")
    private String password;
}
