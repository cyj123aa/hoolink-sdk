package com.hoolink.sdk.bo.command.micro;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;

/**
 * @author zhouyun
 * @date 2019/8/23 9:17
 * @desc
 **/
@Data
public class AddDevToSectorBO implements Serializable {

    private static final long serialVersionUID = -427590585959706938L;
    /** 登录用户名(必填) */
    private String loginName;
    /** 终端编号(必填) */
    @NotBlank(message = "终端编号不能为空")
    private List<String> devNoList;
    /** 分区ID(必填) */
    @NotBlank(message = "分区ID不能为空")
    private String sectorId;
    /** 当前时间 */
    private Long time;

}
