package com.hoolink.sdk.bo.mdc;

import com.hoolink.sdk.param.PageParam;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author 朱礼
 * @Date 2019/6/11
 * @Desc
 */
@Data
public class SearchMessageBO extends PageParam implements Serializable {
    private static final long serialVersionUID = 364364138678295151L;

    /** 用户id */
    @NotNull(message = "userId 不能为空")
    private Long userId;

    /** 项目id */
    @NotNull(message = "projectId 不能为空")
    private Long projectId;

    /** 消息类型id，0：全部，1:设备故障消息,2:阈值消息,3:工单消息，4：事件消息, 5:公告消息,6:提醒消息 */
    private Long typeId;

    /** 是否已读，true：已读，false：未读，null：全部 */
    private Boolean readStatus;
}
