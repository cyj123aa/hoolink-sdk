package com.hoolink.sdk.bo.mdc;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 朱礼
 * @Date 2019/6/12
 * @Desc
 */
@Data
public class MessageRecordDetailBO implements Serializable {
    private static final long serialVersionUID = -6298846100355860869L;

    /** 参数名称 */
    private String itemName;

    /** 参数单位 */
    private String itemUnit;

    /** 数值 */
    private String itemValue;

    /** 告警项标识（false：非告警项，true：告警项） */
    private Boolean sign;
}
