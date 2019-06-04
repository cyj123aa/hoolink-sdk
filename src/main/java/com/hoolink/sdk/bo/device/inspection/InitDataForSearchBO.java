package com.hoolink.sdk.bo.device.inspection;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhangxin
 * @date 2019/6/3
 */
@Data
public class InitDataForSearchBO implements Serializable {

    private static final long serialVersionUID = 7907500980674734860L;

    /*** 巡检设备 */
    List<String> deviceNames;
    /*** 巡检人员 */
    List<String> inspectorNames;
}
