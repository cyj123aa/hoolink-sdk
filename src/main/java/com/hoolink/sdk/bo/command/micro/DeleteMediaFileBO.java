package com.hoolink.sdk.bo.command.micro;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;

/**
 * @author zhouyun
 * @date 2019/8/23 15:12
 * @desc
 **/
@Data
public class DeleteMediaFileBO implements Serializable {

    private static final long serialVersionUID = 674709999863688328L;
    @NotBlank(message = "登录用户名不能为空")
    private String loginName;
    @NotBlank(message = "媒体文件的ID不能为空")
    private List<String> playFileIdList;
    /** 当前时间 */
    private Long time;
}
