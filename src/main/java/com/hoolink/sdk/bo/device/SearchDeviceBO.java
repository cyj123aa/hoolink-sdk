package com.hoolink.sdk.bo.device;

import com.hoolink.sdk.bo.rpc.PageParamBO;
import lombok.Data;

/**
 * @author XuBaofeng.
 * @date 2019-05-14 11:50.
 * <p>
 * description:
 */
@Data
public class SearchDeviceBO extends PageParamBO {
    private static final long serialVersionUID = -7649784784478892887L;

    /*** 项目ID */
    private Long projectId;

    /*** 序列号 */
    private String deviceNo;

    /*** 名称 */
    private String deviceName;

    /*** 灯杆ID */
    private Long poleId;

    /*** 设备分组ID */
    private Long groupId;

    /*** 设备类型ID */
    private Long typeId;

    /*** 设备型号ID */
    private Long subTypeId;

}
