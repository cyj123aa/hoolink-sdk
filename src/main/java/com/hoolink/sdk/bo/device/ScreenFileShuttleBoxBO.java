package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author wangdong
 * @date 2019/5/24 10:45
 */
@Data
public class ScreenFileShuttleBoxBO implements Serializable {
    private static final long serialVersionUID = -4258413813334858071L;

    /*** 全部显示屏文件 */
    private List<ScreenFileShuttleBoxBasicBO> allScreenFile;

    /*** 已被选择的显示屏文件 */
    private List<ScreenFileShuttleBoxBasicBO> beSelectScreenFile;

    /*** 文件类型列表 */
    private List<String> fileTypeList;
}
