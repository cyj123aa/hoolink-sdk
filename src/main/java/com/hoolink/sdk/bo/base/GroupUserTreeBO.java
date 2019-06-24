package com.hoolink.sdk.bo.base;

import com.hoolink.sdk.bo.device.DeviceTreeBO;
import java.util.List;
import lombok.Data;

/**
 * @author chenyuejun
 */
@Data
public class GroupUserTreeBO {

    /*** 每个节点的唯一标识 */
    private Long key;

    /*** 展示节点 */
    private String title;

    /*** 值 */
    private Long value;

    /*** 该组人员个数 */
    private Integer userSize;

    /*** 每个节点的唯一标识 */
    private List<UserTreeBO> children;
}
