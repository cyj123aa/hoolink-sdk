package com.hoolink.sdk.bo.mdc;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * @author 朱礼
 * @Date 2019/6/11
 * @Desc
 */
@Data
public class MessageRecordUserBO implements Serializable {
    private static final long serialVersionUID = 6302470322676042322L;

    /** 用户id */
    @NotNull(message = "userId 不能为空")
    private Long userId;

    /** 消息记录id */
    @NotEmpty(message = "msgRecordIds 不能为空")
    private List<Long> msgRecordIds;
}
