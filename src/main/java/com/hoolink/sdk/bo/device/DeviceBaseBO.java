package com.hoolink.sdk.bo.device;

import lombok.Data;

/**
 * @author chenyuejun
 */
@Data
public class DeviceBaseBO {

    /*** 设备主键ID */
    private Long id;

    /*** 序列号 */
    private String deviceNo;

    /*** 设备名称 */
    private String deviceName;

    /*** 物理地址*/
    private String mac;

    /*** 项目ID */
    private Long projectId;

    /*** 设备型号 */
    private Long deviceSubTypeId;

    /*** 设备型号 */
    private String deviceSubTypeName;

    /*** 版本号 */
    private Long versionId;

    /*** 版本号名称 */
    private String versionName;


}
