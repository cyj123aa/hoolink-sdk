package com.hoolink.sdk.bo.device;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-11 18:44
 * @Description
 */
@Data
public class DmxNodeGroupListBO implements Serializable {
    /*** 分组及节点信息 */
    private List<DmxNodeGroupBO> nodeGroups;
}
