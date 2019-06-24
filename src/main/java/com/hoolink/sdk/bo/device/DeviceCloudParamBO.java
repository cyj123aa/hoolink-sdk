package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author xiaolei.yang..
 * @date 2019-05-14 17:38.
 * <p>
 * description:
 */
@Data
public class DeviceCloudParamBO implements Serializable {
    private static final long serialVersionUID = 8136021842994989560L;

    /*** 项目ID */
    private Long projectId;

    List<DeviceCoordParamBO> coordList;
}
