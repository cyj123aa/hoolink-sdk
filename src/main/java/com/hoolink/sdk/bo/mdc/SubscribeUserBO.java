package com.hoolink.sdk.bo.mdc;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author 朱礼
 * @Date 2019/6/11
 * @Desc
 */
@Data
public class SubscribeUserBO implements Serializable {

    private static final long serialVersionUID = -6763889285285802548L;
    /** 用户id */
    @NotNull(message = "userId 不能为空")
    private Long userId;

    /** 项目id */
    @NotNull(message = "projectId 不能为空")
    private Long projectId;
}
