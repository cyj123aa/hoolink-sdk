package com.hoolink.sdk.bo.command.micro;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author zhouyun
 * @date 2019/8/22 13:50
 * @desc
 **/
@Data
public class UpdatePlayListBO implements Serializable {

    private static final long serialVersionUID = 7912826931889428700L;
    @NotBlank(message = "登录用户名不能为空")
    private String loginName;
    /** 播放列表的ID */
    private String listId;
    /** 播放列表组的ID */
    private String attrId;
    /** 清单音量 */
    private String taskVolume;
    /** 当前时间 */
    private Long time;
}
