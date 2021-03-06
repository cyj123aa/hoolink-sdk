package com.jw.sdk.enums;

/**
 * @author XuBaofeng.
 * @date 2018-11-07 16:05.
 * <p>
 * description:
 */
public enum CheckEnum {

    /*** 非空***/
    DATA_NOT_NULL,
    /***  String不为空或空字符串 ***/
    STRING_NOT_BLANK,
    /*** Integer不为空且>=0 ***/
    LONG_GREATER_THAN_ZERO,
    /*** List不为空且size>0 ***/
    LIST_NOT_EMPTY,
    /*** 不对参数做任何校验 ***/
    DONT_CHECK,

}
