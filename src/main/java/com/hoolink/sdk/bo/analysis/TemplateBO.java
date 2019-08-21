package com.hoolink.sdk.bo.analysis;

import java.util.List;
import lombok.Data;

/**
 *@author  chenyuejun
 */
@Data
public class TemplateBO {

    /**
     * 设备类型(1单灯，2音响，3显示屏)
     */
    private Byte type;
    /**
     * 项目id
     */
    private Long projectId;
    /**
     * 模板名字
     */
    private List<String> name;
}
