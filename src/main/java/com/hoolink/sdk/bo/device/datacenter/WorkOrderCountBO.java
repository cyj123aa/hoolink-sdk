package com.hoolink.sdk.bo.device.datacenter;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-07-12 17:17
 * @Description
 */
@Data
public class WorkOrderCountBO implements Serializable {

    /*** 近10天新建工单趋势 */
    private TrendGraphBO newWorkOrderTrend;

    /*** 工单延期/维修总数统计数据 */
    private WorkStatusBO workDelayPercent;

    /*** 工单已完成/工单统计数据 */
    private WorkStatusBO workedPercent;

    /*** 延期工单数量 */
    private Long delayWorkOrder;

    /*** 工单延期率 */
    private String delayPercent;

    /*** 工单延期TOP */
    private List<NameAndNumBO> workDelayTop;

    /*** 待审核数 */
    private String unAuditNum;

    /*** 待处理数 */
    private String unOperationNum;

    /*** 工单完成率 */
    private List<ValueAndNameBO> workCompletePercent;
}
