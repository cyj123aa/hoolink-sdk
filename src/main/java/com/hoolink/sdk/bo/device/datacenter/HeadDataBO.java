package com.hoolink.sdk.bo.device.datacenter;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-08-28 14:58
 * @Description
 */
@Data
public class HeadDataBO {

    /*** 头部数据类型 1：设备资产总量，2：设备平均在线率，3：阈值告警次数，4：设备故障量 */
    private Byte type;

    /*** 类型名称（与数据类型对应） */
    private String typeName;

    /*** 统计的数据 */
    private String countNum;

    /*** 较昨天状态：0：无，1：上升，2：下降 */
    private Byte compareYesterdayStatus;

    /*** 较昨天数量 */
    private String compareYesterdayNum;
}
