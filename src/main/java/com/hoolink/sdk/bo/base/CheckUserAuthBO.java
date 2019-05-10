package com.hoolink.sdk.bo.base;

import lombok.Data;

import java.io.Serializable;

/**
 * @author XuBaofeng.
 * @date 2019-04-18 14:08.
 * <p>
 * description:
 */
@Data
public class CheckUserAuthBO implements Serializable {
    private static final long serialVersionUID = -5943058557337579897L;
    /*** 用户ID */
    private Long userId;
    /*** 项目ID */
    private Long projectId;
    /*** URL_CODE */
    private String authCode;
}
