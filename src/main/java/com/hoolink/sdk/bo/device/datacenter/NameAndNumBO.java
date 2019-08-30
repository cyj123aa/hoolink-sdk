package com.hoolink.sdk.bo.device.datacenter;

import java.io.Serializable;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-07-12 17:10
 * @Description
 */
@Data
public class NameAndNumBO implements Serializable {

    /*** 显示的名称 */
    private String name;

    /*** 显示的数量 */
    private Long num;

    /*** 人员ID */
    private Long personId;
}
