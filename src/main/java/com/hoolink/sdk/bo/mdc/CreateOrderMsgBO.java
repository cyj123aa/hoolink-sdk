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
public class CreateOrderMsgBO extends CreateMsgBaseBO implements Serializable {

    /** 工单id */
    @NotNull(message = "orderId 不能为空")
    private Long orderId;

    /** 设备数量 */
    @NotNull(message = "num 不能为空")
    private Integer num;

    /** 工单描述 */
    @NotNull(message = "description 不能为空")
    private String description;

    /** 工单流程列表 */
    private List<OrderProcessBO> orderProcessBOList;
}
