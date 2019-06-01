package com.hoolink.sdk.bo.device.inspection;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author zhangxin
 * @date 2019/6/1
 */
@Data
public class SearchInspectionTaskBO implements Serializable {

    private static final long serialVersionUID = -5294250905387720318L;

    /*** 项目ID */
    private Long projectId;
    /*** 结束时间 */
    private LocalDate startDate;
    /*** 起始时间 */
    private LocalDate endDate;
}
