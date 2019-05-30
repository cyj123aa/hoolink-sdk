package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author wangdong
 * @date 2019/5/29 11:26
 */
@Data
public class ScreenGroupBO implements Serializable {
    private static final long serialVersionUID = -6684762831958722752L;
    /*** 分组名称 */
    private String groupName;

    /*** 设备数量 */
    private Integer deviceNum;

    /*** 分组下设备信息 */
    private List<ScreenConfigBO> screenConfigs;

}
