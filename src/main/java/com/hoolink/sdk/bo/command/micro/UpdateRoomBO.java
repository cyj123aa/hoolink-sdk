package com.hoolink.sdk.bo.command.micro;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author zhouyun
 * @date 2019/8/22 9:45
 * @desc
 **/
@Data
public class UpdateRoomBO implements Serializable {

    private static final long serialVersionUID = 179271206356546558L;
    @NotBlank(message = "用户名不能为空")
    private String userName;
    /** 广播室编号 */
    private String roomId;
    /** 支持电话呼入标志 0/1 不支持/支持 */
    @NotBlank(message = "支持电话呼入标志不能为空")
    private String phoneFlag;
    /** 电话呼入密码 */
    private String phonePwd;
    /** 备注 */
    private String comment;
    /** 当前时间 */
    private Long time;
}
