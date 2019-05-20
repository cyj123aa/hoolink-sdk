package com.hoolink.sdk.bo.device;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * @author zhangxin
 * @date 2019/5/17
 */
@Data
public class SearchConflictDeviceBO implements Serializable {

    private static final long serialVersionUID = -1226013551045936803L;

    /*** 设备名称 */
    @NotNull(message = "项目ID不允许为空")
    private Long projectId;

    /*** 设备集合 */
    @NotEmpty(message = "设备不允许为空")
    private List<Long> devices;

}
