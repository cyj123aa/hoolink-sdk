package com.hoolink.sdk.enums.command;

/**
 * @author chenyuejun
 */

public enum UpgradeStateEnum {
    /**
     *发送失败
     */
    SEND_ERROR,
    /**
     *发送成功
     */
    SEND_SUCCESS,
    /**
     *接包成功
     */
    SEND_PACKAGE_SUCCESS,
    /**
     *接包失败
     */
    SEND_PACKAGE_ERROR,
    /**
     *升级结束
     */
    UPGRADE_END,
    /**
     *升级结果不对
     */
    UPGRADE_ERROR,
    /**
     * 上线
     */
    ONLINE

}
