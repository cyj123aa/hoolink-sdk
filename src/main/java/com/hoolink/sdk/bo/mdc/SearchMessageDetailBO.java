package com.hoolink.sdk.bo.mdc;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author 朱礼
 * @Date 2019/6/18
 * @Desc
 */
@Data
public class SearchMessageDetailBO implements Serializable {

    private static final long serialVersionUID = 1548385516222643920L;
    /** 用户id */
    @NotNull(message = "userId 不能为空")
    private Long userId;

    /** 消息id */
    @NotNull(message = "msgRecordId 不能为空")
    private Long msgRecordId;
}
