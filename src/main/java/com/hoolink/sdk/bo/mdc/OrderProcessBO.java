package com.hoolink.sdk.bo.mdc;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 朱礼
 * @Date 2019/6/12
 * @Desc
 */
@Data
public class OrderProcessBO implements Serializable {
    private static final long serialVersionUID = 7106140286972407562L;

    /** 工单流程内容*/
    private String content;

    /** 流程处理时间 */
    private Long handleTime;

    /*** 流程处理状态  1：灰色 未执行状态 2：绿色 成功状态 3：红色  错误状态 4：蓝色 当前状态 */
    private Byte handleStatus;

    /*** 操作人ID */
    private Long userId;
}
