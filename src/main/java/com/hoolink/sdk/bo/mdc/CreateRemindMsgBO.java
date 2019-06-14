package com.hoolink.sdk.bo.mdc;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author 朱礼
 * @Date 2019/6/12
 * @Desc
 */
@Data
public class CreateRemindMsgBO extends CreateMsgBaseBO implements Serializable {
    private static final long serialVersionUID = 9154480276605180432L;

    /** 策略名称*/
    private String itemName;

    /** 设备数量*/
    @NotNull(message = "deviceNum 不能为空")
    private Integer deviceNum;

    /** 文件数量*/
    private Integer fileNum;

}
