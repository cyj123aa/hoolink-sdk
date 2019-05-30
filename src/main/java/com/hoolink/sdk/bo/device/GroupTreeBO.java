package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author XuBaofeng.
 * @date 2019-05-21 15:03.
 * <p>
 * description:
 */
@Data
public class GroupTreeBO implements Serializable {

    /*** 每个节点的唯一标识 */
    private Long key;

    /*** 展示节点 */
    private String title;

    /*** 值 */
    private Long value;

    /*** 该组设备个数 */
    private Integer deviceSize;

    /*** 每个节点的唯一标识 */
    private List<DeviceTreeBO> children;

}
