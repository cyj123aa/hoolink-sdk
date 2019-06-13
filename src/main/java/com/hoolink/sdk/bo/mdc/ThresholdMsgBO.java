package com.hoolink.sdk.bo.mdc;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * @author 朱礼
 * @Date 2019/6/13
 * @Desc
 */
@Data
public class ThresholdMsgBO implements Serializable {
    private static final long serialVersionUID = 8914952941787249151L;
    /** 标题 */
    @NotNull(message = "content 不能为空")
    private String content;

    /** 设备id */
    @NotNull(message = "deviceId 不能为空")
    private Long deviceId;

    /** 消息子类型id */
    @NotNull(message = "subTypeId 不能为空")
    private Long messageSubTypeId;

    /** 项目id */
    @NotNull(message = "projectId 不能为空")
    private Long projectId;

    /** 故障参数 */
    private List<MessageRecordDetailBO> messageRecordDetailBOList;
}
