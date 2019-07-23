package com.hoolink.sdk.bo.device;

import com.hoolink.sdk.bo.rpc.PageParamBO;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author 朱礼
 * @Date 2019/5/17
 * @Desc
 */
@Data
public class SearchHistoryBO extends PageParamBO implements Serializable {

    private static final long serialVersionUID = -4714326416800491234L;

    @NotNull(message = "projectId不能为空")
    /*** 项目ID */
    private Long projectId;

    /*** 开始时间 */
    private Long beginLongTime;

    /*** 结束时间 */
    private Long endLongTime;

    private Long deviceId;
}
