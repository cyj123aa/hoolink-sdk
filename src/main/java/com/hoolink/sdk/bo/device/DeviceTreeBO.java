package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;

/**
 * @author XuBaofeng.
 * @date 2019-05-21 15:11.
 * <p>
 * description:
 */
@Data
public class DeviceTreeBO implements Serializable {
    /*** 每个节点的唯一标识 */
    private Long key;
    /*** 展示节点 */
    private String title;
    /*** 值 */
    private Long value;
}
