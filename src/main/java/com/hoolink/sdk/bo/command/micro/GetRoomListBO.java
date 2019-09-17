package com.hoolink.sdk.bo.command.micro;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author zhouyun
 * @date 2019/8/23 15:30
 * @desc
 **/
@Data
public class GetRoomListBO implements Serializable {

    private static final long serialVersionUID = -2990904302554812759L;
    @NotBlank(message = "登录用户名不能为空")
    private String loginName;
    /** 当前页数 */
    private String page;
    /** 每页数据条数 */
    private String perPage;
    /** 广播类型(0：非紧急广播，1：紧急广播)(为空查询所有) */
    private String emergencyFlag;
    /** 电话呼入(0：不支持，1：支持)(为空查询所有) */
    private String phoneFlag;
    /** 任务类型(0：手动模式，1：定时模式)(为空查询所有) */
    private String roomTask;
    /** 输入的查询信息(可查询的字段：广播室编号、终端个数、创建者、备注)(可模糊查询，为空查询所有) */
    private String searchInfo;
    /** 当前时间 */
    private Long time;
}
