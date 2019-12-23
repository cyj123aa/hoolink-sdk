package com.jw.sdk.constants;

import java.util.Arrays;
import java.util.List;

/**
 * @author ds
 * Created by ds on 2017/12/11.
 * 常量类
 */
public class CommonConstants {

    public static final String DATE_SPLIT = "-";
    public static final String COMMA = ",";
    public static final Long DEFAULT_USER_ID = 1L;
    public static final String DEFAULT_USER_ACCOUNT = "admin";
    public static final String COLON_SEPARATE = ":";
    public static final String UNDERLINE = "_";

    /*** 手机号长度 */
    public static final int MOBIL_PHONE_LENGTH = 11;

    /**
     * 账号
     */
    public static final String LOG_ACCOUNT = "[Account]";
    /**
     * 方法名
     */
    public static final String LOG_METHOD = "[Method]";
    /**
     * 参数
     */
    public static final String LOG_PARAM = "[Param]";
    /**
     * 返回值
     */
    public static final String LOG_RETURN = "[Return]";
    /**
     * 其它觉得必要的描述信息
     */
    public static final String LOG_CONTENT = "[Content]";
    public static final String LOG_ERROR = "[Exception]";

    /**
     * 指令
     */
    public static final String COMMAND_OPERATE_SUCCESS = "指令下发成功";
    public static final String COMMAND_OPERATE_ERROR = "指令下发异常";
    public static final String COMMAND_PARAM_EMPTY = "参数校验为空";
    public static final String COMMAND_UPGRADE_VERSION_ERROR = "版本号格式不正确";
    public static final String COMMAND_UPGRADE_FILE_ERROR = "文件格式不正确";

    /**
     * 获取全局用户信息
     */
    public static final String CURRENT_LOGIN_AUTH = "CURRENT_LOGIN_AUTH";

    /**
     * 显示屏进度条redisKey前缀 progress
     */
    public static final String SCREEN_SEND_PREFIX = "progress_";

    /**
     * 显示屏重发redisKey前缀 restart
     */
    public static final String SCREEN_CONFIG_PREFIX = "restart_";

    /**
     * 世邦替换字段"jsondata["
     */
    public static final String SPON_REPLACE_1 = "jsondata[";
    /**
     * 世邦替换字段"]"
     */
    public static final String SPON_REPLACE_2 = "]";

    /**
     * 字符串零
     */
    public static final String STRING_NUM_0 = "0";
    /**
     * 初始化默认值
     */
    public static final Integer DEFAULT_VALUE_0 = 0;
    public static final String REDIS_RESULT_OK = "OK";

    public static Integer INT_ZERO=0;

    public static Integer INT_ONEHUNDERD=100;

    public static Integer INT_ONE=1;

    /*** 物理地址特殊字符 */
    public static List<String> GET_SPECIAL_CHAR = Arrays.asList(":");

    /*** 文件下发状态:下发中 */
    public static final String SCREEN_FILE_SEND_ING = "0";

    /*** 文件下发状态:下发成功 */
    public static final String SCREEN_FILE_SEND_SUCCESS = "1";

    /*** 文件下发状态:下发失败 */
    public static final String SCREEN_FILE_SEND_FAILURE = "2";
}
