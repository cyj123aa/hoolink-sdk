package com.hoolink.sdk.bo.device;

import com.hoolink.sdk.bo.ability.ObsBO;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author wangdong
 * @date 2019/5/29 20:12
 */
@Data
public class ScreenAllFileBO implements Serializable {
    private static final long serialVersionUID = -4866122833618017386L;

    /*** 文件总数 */
    private Integer allFileNum;

    /*** 文件总大小 */
    private Double allFileSize;

    /*** 文件列表 */
    private List<ObsBO> files;
}
