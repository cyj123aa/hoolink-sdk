package com.hoolink.sdk.bo.command.micro;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author zhouyun
 * @date 2019/8/21 17:11
 * @desc
 **/
@Data
public class CreateRoomBO implements Serializable {

    private static final long serialVersionUID = -3508752996696337650L;
    @NotBlank(message = "用户名不能为空")
    private String userName;
    /** 广播室编号 */
    private String roomId;
    /** 广播室类型 0/1 非紧急/紧急广播 */
    @NotBlank(message = "广播室类型不能为空")
    private String emergencyFlag;
    /** 支持电话呼入标志 0/1 不支持/支持 */
    @NotBlank(message = "支持电话呼入标志不能为空")
    private String phoneFlag;
    /** 电话呼入密码 */
    private String phonePwd;
    /** 备注 */
    private String comment;
    /** 客户端IP */
    @NotBlank(message = "客户端IP不为空")
    private String srcIp;
    /** 当前时间 */
    private Long time;

}
