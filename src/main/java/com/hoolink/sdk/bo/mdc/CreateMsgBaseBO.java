package com.hoolink.sdk.bo.mdc;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author 朱礼
 * @Date 2019/6/13
 * @Desc
 */
@Data
public class CreateMsgBaseBO implements Serializable {

    private static final long serialVersionUID = 7019956848918559989L;
    /** 标题 */
    @NotNull(message = "content 不能为空")
    private String content;

    /** 消息子类型id */
    @NotNull(message = "subTypeId 不能为空")
    private Long messageSubTypeId;

    /** 项目id */
    @NotNull(message = "projectId 不能为空")
    private Long projectId;
}