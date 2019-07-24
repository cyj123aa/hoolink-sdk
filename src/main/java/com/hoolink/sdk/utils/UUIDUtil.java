package com.hoolink.sdk.utils;

import java.util.UUID;

/**
 * 日志ID工具类
 * <p>
 * 获取日志的txId作为日志检索的唯一标志, 在每行日志输出的时候都应该加上该txId
 *
 * @author XuBaofeng.
 * @date 2018-09-20 13:12.
 */
public class UUIDUtil {

    /**
     * 生成UUID
     *
     * @return
     */
    public static String getTxId() {
        return UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
    }

}
