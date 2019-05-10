package com.hoolink.sdk.bo.device;

import lombok.Data;

/**
 * @author chenzhixiong
 * @date 2019/4/24 13:13
 * 三级子菜单
 */
@Data
public class DeviceSubTypeLevelBO {

    /**
     * 该层级节点id
     */
    private Long id;

    /*** 型号名称 */
    private String subTypeName;

    /*** 设备类型ID */
    private Long deviceTypeId;

    /*** 厂家ID  */
    private Long factoryId;

    /*** 图片路径 */
    private String imgPath;

    /*** 描述 */
    private String description;

    
}
