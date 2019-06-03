package com.hoolink.sdk.param;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhangxin
 * @date 2019/6/3
 */
@Data
public class ShuttleBoxParam implements Serializable {

    private static final long serialVersionUID = -7827269991351073357L;

    /*** 项目ID */
    private Long projectId;
    /*** 配置(计划)ID */
    private Long configId;

}
