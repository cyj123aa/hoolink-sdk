package com.hoolink.sdk.bo.mdc;

import lombok.AllArgsConstructor;
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
@AllArgsConstructor
public class CreateDeviceMsgBO extends CreateMsgBaseBO implements Serializable {
    private static final long serialVersionUID = 8914952941787249151L;

    /*** 设备id */
    @NotNull(message = "deviceId 不能为空")
    private Long deviceId;

    /*** 消息类型 */
    private Long typeId;

    /*** 故障参数 */
    private List<MessageRecordDetailBO> messageRecordDetailBOList;

    public CreateDeviceMsgBO(Long typeId, Long deviceId, Long projectId, String content, Long messageSubTypeId) {
        super(projectId, content, messageSubTypeId);
        this.typeId = typeId;
        this.deviceId = deviceId;
    }
}
