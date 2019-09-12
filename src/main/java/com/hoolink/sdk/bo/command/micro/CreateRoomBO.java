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
    /** 用户名 （必填） */
    private String userName;
    /** 广播室编号 */
    private String roomId;
    /** 广播室类型 0/1 非紧急/紧急广播 （必填）*/
    private String emergencyFlag;
    /** 支持电话呼入标志 0/1 不支持/支持 （必填）*/
    private String phoneFlag;
    /** 电话呼入密码 */
    private String phonePwd;
    /** 备注 */
    private String comment;
    /** 客户端IP （必填）*/
    private String srcIp;
    /** 当前时间 */
    private Long time;

}
