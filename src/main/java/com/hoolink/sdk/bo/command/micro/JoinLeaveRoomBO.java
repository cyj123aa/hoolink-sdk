package com.hoolink.sdk.bo.command.micro;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;

/**
 * @author zhouyun
 * @date 2019/8/22 10:33
 * @desc
 **/
@Data
public class JoinLeaveRoomBO implements Serializable {

    private static final long serialVersionUID = 8070225640072699860L;
    @NotBlank(message = "登录用户名不能为空")
    private String loginName;
    @NotBlank(message = "广播室编号不能为空")
    private String bcId;
    /** 要加入广播室的终端编号 */
    private List<String> devNoList;
    /** 当前时间 */
    private Long time;
}
