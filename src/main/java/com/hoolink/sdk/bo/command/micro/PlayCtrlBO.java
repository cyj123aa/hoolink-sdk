package com.hoolink.sdk.bo.command.micro;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author zhouyun
 * @date 2019/8/22 14:22
 * @desc
 **/
@Data
public class PlayCtrlBO implements Serializable {

    private static final long serialVersionUID = -1808156996726302261L;
    @NotBlank(message = "登录用户名不能为空")
    private String loginName;
    @NotBlank(message = "广播室ID不能为空")
    private String bcId;
    /** 播放列表的ID */
    private String listId;
    /** 广播类型 */
    private String type;
    /** 当前时间 */
    private Long time;
}
