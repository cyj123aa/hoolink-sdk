package com.hoolink.sdk.utils;

import java.util.UUID;

/**
 * 日志ID工具类
 *
 * 获取日志的txId作为日志检索的唯一标志, 在每行日志输出的时候都应该加上该txId
 * 并在gateway && command && schedule三个入口中将该标志存入到对应的日志表
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
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

}
