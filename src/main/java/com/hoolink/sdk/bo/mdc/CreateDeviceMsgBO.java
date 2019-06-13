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
public class CreateDeviceMsgBO extends CreateMsgBaseBO implements Serializable {
    private static final long serialVersionUID = 8914952941787249151L;

    /** 设备id */
    @NotNull(message = "deviceId 不能为空")
    private Long deviceId;

    /** 消息类型 */
    private Long typeId;

    /** 阈值上界*/
    private Double upperBound;

    /** 阈值下界*/
    private Double lowerBound;

    /** 故障参数 */
    private List<MessageRecordDetailBO> messageRecordDetailBOList;
}
