package com.hoolink.sdk.bo.device.inspection;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author zhangxin
 * @date 2019/6/1
 */
@Data
public class InspectionHistoryBO implements Serializable {

    private static final long serialVersionUID = -7671711478763249064L;

    /*** 巡检人员ID */
    private Long inspectorId;
    /*** 巡检人员名称 */
    private String inspectorName;
    /*** 设备ID */
    private Long deviceId;
    /*** 设备名称 */
    private String deviceName;

    /*** 计划开始时间 */
    private LocalTime planStartTime;
    /*** 计划结束时间 */
    private LocalTime planEndTime;

    /*** 计划名称 */
    private String planName;

    /*** 巡检打卡时间 */
    private LocalDateTime inspectionTime;
    /*** 打卡抓拍图，大图 */
    private Long bigSnapshotId;
    /*** 打卡抓拍图，小图 */
    private Long smallSnapshotId;
}
