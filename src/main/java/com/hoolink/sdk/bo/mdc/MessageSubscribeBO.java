package com.hoolink.sdk.bo.mdc;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * @author 朱礼
 * @Date 2019/6/10
 * @Desc
 */
@Data
public class MessageSubscribeBO implements Serializable {

    private static final long serialVersionUID = -5039072461041954361L;
    /** 消息子类型id列表 */
    @NotNull(message = "msgSubTypeIds 不能为空")
    private List<Long> msgSubTypeIds;

    /** 用户id */
    @NotNull(message = "userId 不能为空")
    private Long userId;

    /** 项目id */
    @NotNull(message = "projectId 不能为空")
    private Long projectId;

    /** 消息订阅类型, true：短信，false：消息中心*/
    @NotNull(message = "subscribeType 不能为空")
    private Boolean subscribeType;

    /** 是否订阅，true：订阅，false：取消订阅*/
    @NotNull(message = "checked 不能为空")
    private Boolean checked;
}
