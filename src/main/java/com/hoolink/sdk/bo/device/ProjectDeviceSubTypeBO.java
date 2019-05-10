package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/4/17 17:46
 */
@Data
public class ProjectDeviceSubTypeBO implements Serializable {
    private static final long serialVersionUID = -682401556786502832L;

    /*** 设备型号ID */
    private Long id;

    /*** 设备型号名称 */
    private String subTypeName;

    /*** 设备类型ID */
    private Long deviceTypeId;

    /*** 维保年限 */
    private Short maintainTime;

    /*** 厂家ID  */
    private Long factoryId;

    /*** 图片路径 */
    private String imgPath;

    /*** 描述 */
    private String description;

}
