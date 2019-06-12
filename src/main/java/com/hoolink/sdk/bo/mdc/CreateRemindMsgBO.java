package com.hoolink.sdk.bo.mdc;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 朱礼
 * @Date 2019/6/12
 * @Desc
 */
@Data
public class CreateRemindMsgBO implements Serializable {
    private static final long serialVersionUID = 9154480276605180432L;

    /** 消息内容 */
    private String content;

    /** 消息子类型id */
    private Long messageSubTypeId;

    /** 策略名称*/
    private String itemName;

    /** 设备数量*/
    private Integer deviceNum;

    /** 文件数量*/
    private Integer fileNum;

    /** 项目id */
    private Long projectId;
}
