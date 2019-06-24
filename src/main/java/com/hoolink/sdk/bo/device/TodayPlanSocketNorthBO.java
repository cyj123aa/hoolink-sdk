package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhouyun
 * @date 2019/6/24 17:30
 * @desc
 **/
@Data
public class TodayPlanSocketNorthBO implements Serializable {

    private static final long serialVersionUID = -438006844816064065L;

    /** 运行状态已完成常量 */
    public static final Byte INSERT = (byte)1;
    /** 运行状态正在进行常量 */
    public static final Byte DELETE = (byte)2;
    /** 运行状态未开始常量 */
    public static final Byte UPDATE = (byte)3;

    /** 操作标志 1：新增 2：删除 3 ：修改 */
    private Byte operateFlag;

    /** 新增计划 */
    private List<TodayPlanNorthBO> insertPlanList;

    /** 删除计划 */
    private DeleteTodayPlanNoticeWebBO deletePlanList;

    /** 修改计划 */
    private List<TodayPlanNorthBO> updatePlanList;
}
