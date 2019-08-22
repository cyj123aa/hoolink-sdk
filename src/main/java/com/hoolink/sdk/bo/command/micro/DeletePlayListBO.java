package com.hoolink.sdk.bo.command.micro;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author zhouyun
 * @date 2019/8/22 14:03
 * @desc
 **/
@Data
public class DeletePlayListBO implements Serializable {

    private static final long serialVersionUID = 8105740222283028674L;
    @NotBlank(message = "登录用户名不能为空")
    private String loginName;
    @NotBlank(message = "广播室ID不能为空")
    private String bcId;
    /** 播放列表的ID */
    private String listId;
    /** 播放列表组的ID */
    private String attrId;
    /** 当前时间 */
    private Long time;
}
