package com.hoolink.sdk.bo.command.micro;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author zhouyun
 * @date 2019/8/22 13:50
 * @desc
 **/
@Data
public class UpdatePlayListBO extends AddPlayListBO {

    private static final long serialVersionUID = 7912826931889428700L;
    @NotBlank(message = "原广播室ID不能为空")
    private String srcRoomId;

}
