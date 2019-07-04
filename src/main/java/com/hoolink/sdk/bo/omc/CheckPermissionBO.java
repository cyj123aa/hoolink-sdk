package com.hoolink.sdk.bo.omc;

import lombok.Data;

/**
 * @author Administrator
 */
@Data
public class CheckPermissionBO {
    /**
     *原因
     */
    private String msg;
    /**
     * 是否可以创建
     */
    private Boolean check;

    /**
     * 指派人是否必填
     */
    private Boolean transfer;
}
