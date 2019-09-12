package com.hoolink.sdk.bo.command.micro;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;

/**
 * @author zhouyun
 * @date 2019/8/23 9:37
 * @desc
 **/
@Data
public class DeleteDevInfoBO implements Serializable {

    private static final long serialVersionUID = 3485277091525646413L;
    @NotBlank(message = "登录用户名不能为空")
    private String loginName;
    /** 终端ID */
    @NotBlank(message = "终端ID不能为空")
    private List<String> devIdList;
    /** 当前时间 */
    private Long time;
}
