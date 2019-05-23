package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author wangdong
 * @date 2019/5/23 20:42
 */
@Data
public class ScreenShuttleBoxBO implements Serializable {
    private static final long serialVersionUID = -8442680451501821327L;

    /*** 全部显示屏 */
    private List<ScreenShuttleBoxBasicBO> allScreen;

    /*** 已被选择的显示屏 */
    private List<ScreenShuttleBoxBasicBO> beSelectScreen;
    
}
