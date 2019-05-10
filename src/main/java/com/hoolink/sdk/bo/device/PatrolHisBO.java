package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lixiaoran
 * @date 2019-04-04
 */
@Data
public class PatrolHisBO implements Serializable {
    private static final long serialVersionUID = -639269500864460632L;
    /**
     * <pre>
     * 主键id
     * </pre>
     */
    private Long id;

    /**
     * <pre>
     * 项目Id
     * </pre>
     */
    private Long projectId;

    /**
     * <pre>
     * 巡检计划的名称
     * </pre>
     */
    private String planName;

    /**
     * <pre>
     * 设备名称
     * </pre>
     */
    private String deviceName;

    /**
     * <pre>
     * 灯杆Id
     * </pre>
     */
    private Long poleId;

    /**
     * <pre>
     * 设备Id
     * </pre>
     */
    private Long deviceId;

    /**
     * <pre>
     * 员工名称
     * </pre>
     */
    private String patrolEmployeeName;

    /**
     * <pre>
     * 员工Id
     * </pre>
     */
    private Long employeeId;

    /**
     * <pre>
     * 计划打卡时间
     * </pre>
     */
    private String planTime;

    /**
     * <pre>
     * 巡检计划的Id
     * </pre>
     */
    private Long patrolPlanId;

    /**
     * <pre>
     * 手持设备的编号,用来与巡检人员进行关联
     * </pre>
     */
    private String patrolDeviceNo;

    /**
     * <pre>
     * 是否在巡检计划内打卡
     * </pre>
     */
    private Boolean marking;

    /**
     * <pre>
     * 创建时间
     * </pre>
     */
    private Long created;

    /**
     * <pre>
     * 创建人
     * </pre>
     */
    private String creator;

    /**
     * <pre>
     * 修改时间
     * </pre>
     */
    private Long updated;

    /**
     * <pre>
     * 修改人
     * </pre>
     */
    private String updator;

    /**
     * <pre>
     * 巡检实际打卡时间
     * </pre>
     */
    private Long patrolTime;

    /**
     * <pre>
     * 设备nfc通信编号 如果是camera打卡此字段就会null
     * </pre>
     */
    private String mac;

    /**
     * <pre>
     * 0代表nfc，1代表camera
     * </pre>
     */
    private Boolean patrolType;

    /**
     * <pre>
     * 巡检时的抓拍图片的OBSID，如果是nfc巡检此字段为0,不存在数据
     * </pre>
     */
    private Long patrolObsId;

    /**
     * <pre>
     * 巡检抓拍的视频ID，如果是nfc巡检此字段为0, 不存在数据
     * </pre>
     */
    private Long videoId;

}