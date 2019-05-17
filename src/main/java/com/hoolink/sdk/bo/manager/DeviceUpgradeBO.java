package com.hoolink.sdk.bo.manager;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

/**
 * @author : chenzb
 * @Description : TODO
 * @date : Created on 2019/4/25 15:57
 */
@Data
public class DeviceUpgradeBO {

    /*** 设备id */
    private Long deviceId;

    /*** 设备编号 */
    private String deviceNo;

    /*** 设备名称 */
    private String deviceName;

    /*** 设备mac */
    private String deviceMac;

    /*** 设备型号id */
    private Long deviceSubTypeId;

    /*** 项目id */
    private Long projectId;

    /*** 升级目标版本号id */
    private Long versionId;

    /*** 升级目标版本号 */
    private String version;

    /*** 升级目标版本对应的obsId */
    private Long obsId;

    /*** 设备当前源版本号 */
    private String deviceSrcVersion;

    /*** 升级主题 */
    private String theme;

    /*** 升级描述 */
    private String description;

    private String  batchId;

    /*** 升级类型 0 高版本升级 1 强制升级 */
    private Byte type;

    /*** 升级详情id */
    private Long historyDetailId;

    /*** 第一步状态（发送）：0失败，1成功 */
    private Byte firstStepStatus;

    /*** 第二步状态（升级中）：0失败，1未开始升级，2升级中，3成功 */
    private Byte secondStepStatus;

    /*** 第三步状态（完成）：0未开始完成，1完成中，2成功 */
    private Byte thirdStepStatus;




}
