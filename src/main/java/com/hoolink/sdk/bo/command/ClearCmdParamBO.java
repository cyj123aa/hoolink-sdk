package com.hoolink.sdk.bo.command;

import lombok.Data;

import java.util.List;

/**
 * @author zhujt
 * @Date 2018/4/26.
 * @Desc 显示屏清除资源文件封装类
 */
@Data
public class ClearCmdParamBO {
    /**
     * 0-清理所有媒体文件  1-清理无效媒体文件 2-清理所有文件  3-清理升级包
     */
    private Integer clearMode;
    /**
     * 通道集合
     */
    private List<String> channelList;
}
