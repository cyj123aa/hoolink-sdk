package com.hoolink.sdk.bo.device;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * @author zhouyun
 * @date 2019/7/26 16:53
 * @desc
 **/
@Data
public class DeviceGroupParamBO implements Serializable {

    private static final long serialVersionUID = 2020811287210557233L;

    /** 项目ID **/
    @NotNull(message = "项目ID不能为空")
    private Long projectId;
    /** 子设备ID列表 **/
    @NotNull(message = "子设备类型ID不能为空")
    private List<Long> deviceSubTypeIdList;
}
