package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author wangdong
 * @date 2019/5/29 10:09
 */
@Data
public class ReturnConfigListBO implements Serializable {
    private static final long serialVersionUID = -1132625147959576709L;

    /*** 在播清单 */
    private List<ScreenConfigListBO> nowPlayConfigs;

    /*** 未播清单 */
    private List<ScreenConfigListBO> notPlayConfigs;
}
