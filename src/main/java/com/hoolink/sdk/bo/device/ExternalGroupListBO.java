package com.hoolink.sdk.bo.device;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-24 17:44
 * @Description
 */
@Data
public class ExternalGroupListBO implements Serializable{
    /*** 分组及单灯设备信息 */
    private List<GroupBO> deviceGroups;
}
