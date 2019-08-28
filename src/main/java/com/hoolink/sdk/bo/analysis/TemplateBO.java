package com.hoolink.sdk.bo.analysis;

import java.util.List;
import lombok.Data;

/**
 *@author  chenyuejun
 */
@Data
public class TemplateBO {

    /**
     * 设备类型(0，基础模板 ,1单灯，2音响，3显示屏，4 全部加载 5，取消单词匹配)
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
