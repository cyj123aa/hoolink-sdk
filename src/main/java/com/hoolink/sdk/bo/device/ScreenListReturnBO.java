package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author wangdong
 * @date 2019/5/29 13:03
 */
@Data
public class ScreenListReturnBO implements Serializable {
    private static final long serialVersionUID = -4758478444399017191L;

    /*** 分组下拉框 */
    private List<GroupPullDownBO> groupPullDowns;

    /*** 分组及设备信息 */
    private List<ScreenGroupBO> screenGroups;
}
