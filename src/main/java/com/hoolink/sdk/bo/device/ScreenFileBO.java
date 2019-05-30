package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author wangdong
 * @date 2019/5/23 15:28
 */
@Data
public class ScreenFileBO implements Serializable {
    private static final long serialVersionUID = 6111798293031507988L;

    /*** 文件类型列表 */
    private List<String> fileTypeList;

    /*** 文件列表 */
    private List<FileDetailInfoBO> fileDetailList;
}
