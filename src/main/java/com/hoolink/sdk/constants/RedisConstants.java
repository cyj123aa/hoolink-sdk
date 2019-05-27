package com.hoolink.sdk.constants;

/**
 * @author : chenzb
 * @Description : Redis相关常量
 * @date : Created on 2019/5/10 13:29
 */
public class RedisConstants {

    /**
     * 远程升级和强制回滚
     */
    public static final String DEVICE_UPGRADE_START = "device_upgrade_start";
    public static final String DEVICE_UPGRADE_END = "device_upgrade_end";
    public static final String DEVICE_UPGRADE_All = "device_upgrade_all";

    /** 操作记录缓存*/
    public static final String BIZ_REQ_HISTORY_KEY = "biz_req_history";
    public static final String OPERATION_MAC_KEY = "biz_history_mac_";
    /**设备最新一次操作缓存*/
    public static final String LAST_HISTORY_KEY = "last_history_";
}
