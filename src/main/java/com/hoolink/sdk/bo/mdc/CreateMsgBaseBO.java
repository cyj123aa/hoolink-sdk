package com.hoolink.sdk.bo.mdc;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * @author 朱礼
 * @Date 2019/6/13
 * @Desc
 */
@Data
@NoArgsConstructor
public class CreateMsgBaseBO implements Serializable {

    private static final long serialVersionUID = 7019956848918559989L;
    /*** 标题 */
    @NotNull(message = "content 不能为空")
    private String content;

    /*** 消息子类型id */
    @NotNull(message = "subTypeId 不能为空")
    private Long messageSubTypeId;

    /*** 项目id */
    @NotNull(message = "projectId 不能为空")
    private Long projectId;

    /** 推送的用户id */
    private List<Long> pushUserIdList;

    CreateMsgBaseBO(Long projectId, String content, Long messageSubTypeId) {
        this.content = content;
        this.projectId = projectId;
        this.messageSubTypeId = messageSubTypeId;
    }
}
