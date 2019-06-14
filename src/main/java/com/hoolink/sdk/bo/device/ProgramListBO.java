package com.hoolink.sdk.bo.device;

import java.util.List;

import com.hoolink.sdk.bo.device.req.DmxProgramBO;
import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-13 20:09
 * @Description
 */
@Data
public class ProgramListBO {

    /*** 在播节目 */
    private List<DmxProgramBO> nowPlayPrograms;

    /*** 未播节目 */
    private List<DmxProgramBO> notPlayPrograms;
}
