package com.hoolink.sdk.bo.command.micro;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author zhouyun
 * @date 2019/8/23 15:53
 * @desc
 **/
@Data
public class GetPlayListInRoomBO implements Serializable {

    private static final long serialVersionUID = -7565012757405891016L;
    @NotBlank(message = "登录用户名不能为空")
    private String loginName;
    @NotBlank(message = "广播室编号不能为空")
    private String bcId;
    /** 任务类型(0：手动模式，1：定时模式) */
    private String taskFlag;
    /** 当前页数 */
    private String page;
    /** 每页数据条数 */
    private String perPage;
    /** 当前时间 */
    private Long time;
}
