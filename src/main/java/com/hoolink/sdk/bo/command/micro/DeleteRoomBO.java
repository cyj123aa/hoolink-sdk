package com.hoolink.sdk.bo.command.micro;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author zhouyun
 * @date 2019/8/22 10:12
 * @desc
 **/
@Data
public class DeleteRoomBO implements Serializable {

    private static final long serialVersionUID = 2498275324867871781L;
    @NotBlank(message = "登录用户名不能为空")
    private String loginName;
    @NotBlank(message = "创建用户名不能为空")
    private String userName;
    /** 广播室编号 */
    @NotBlank(message = "广播室编号不能为空")
    private String roomId;
    /** 当前时间 */
    private Long time;
}
