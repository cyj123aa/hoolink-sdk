package com.hoolink.sdk.bo.command.micro;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;

/**
 * @author zhouyun
 * @date 2019/8/22 14:22
 * @desc
 **/
@Data
public class PlayCtrlBO implements Serializable {

    private static final long serialVersionUID = -1808156996726302261L;
    /** 登录用户名 （必填）*/
    private String loginName;
    @NotBlank(message = "广播室ID不能为空")
    private String bcId;
    /** 播放列表的ID （必填）*/
    private String listId;
    /** 广播类型 （必填）*/
    private String type;
    /** 当前时间 */
    private Long time;
    @NotBlank(message = "设备编号列表不能为空")
    private List<String> devNoList;
    @NotBlank(message = "清单音量不能为空")
    private String taskVol;
    /** 分区ID */
    private String sectorId;
}
