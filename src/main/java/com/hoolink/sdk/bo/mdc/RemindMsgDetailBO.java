package com.hoolink.sdk.bo.mdc;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 朱礼
 * @Date 2019/6/12
 * @Desc
 */
@Data
public class RemindMsgDetailBO implements Serializable {

    private static final long serialVersionUID = -406899598780850066L;
    /** 消息内容 */
    private String content;

    /** 消息类型 */
    private String typeName;

    /** 时间 */
    private Long created;

    /** 策略名称*/
    private String itemName;

    /** 设备数量*/
    private Integer deviceNum;

    /** 文件数量*/
    private Integer fileNum;
}
