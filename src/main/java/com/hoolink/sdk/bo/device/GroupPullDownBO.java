package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wangdong
 */
@Data
public class GroupPullDownBO implements Serializable {
    private static final long serialVersionUID = -3222560435841196311L;

    /**
     * id
     */
    private Long id;
    /**
     * 分组名称
     */
    private String groupName;
}
