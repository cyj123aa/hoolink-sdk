package com.hoolink.sdk.bo.datacenter;

import java.io.Serializable;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-07-15 09:29
 * @Description
 */
@Data
public class ValueAndNameBO implements Serializable {

    /*** 属性名称 */
    private String name;

    /*** 属性值 */
    private Long value;
}
