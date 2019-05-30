package com.hoolink.sdk.constants;

/**
 * Created by zhaojunwei on 2018/4/20.
 * 灯具指令常量类
 */
public class LightCodeConsts {
    /**
     * 服务器-集中器
     * 登录指令
     */
    public static final String LOGING = "0x09";
    /**
     * 服务器-集中器
     * 重启集中器
     */
    public static final String RESTART_CONCENTRATOR = "0x0B";
    /**
     * 设置集中器天文时钟调光计划
     */
    public static final String SET_CENTER_ASTRONOMICAL_CLOCK_DIMMING_PLAN = "0x10";

    /**
     * 删除集中器天文时钟调光计划
     */
    public static final String REMOVE_CENTER_ASTRONOMICAL_CLOCK_DIMMING_PLAN = "0x14";
    /**
     * 服务器-集中器
     * 集中器时间同步
     */
    public static final String SYNCHRONIZATION_DATE = "0x11";
    /**
     * 服务器-集中器
     * 查询集中器时间
     */
    public static final String GET_CENTER_DATE = "0x12";
    /**
     * 服务器-集中器
     * 单灯控制器删除时控计划
     */
    public static final String REMOVE_LIGHT_DIMMING_PLAN = "0x4E";
    /**
     * 服务器-集中
     * 调光指令
     * 0：关灯
     * 大于0：代表开灯和调光
     */
    public static final String SET_LIGHT_BRIGHTNESS = "0x26";
    /**
     * 单灯控制器初始化
     */
    public static final String INIT_LIGHT_INFO = "0x25";
    /**
     * 删除单灯控制器
     * 注：该指令是删除集中器下所有的单灯控制器
     */
    public static final String REMOVE_LIGHT = "0x24";
    /**
     * 查询单灯的所有信息值
     */
    public static final String GET_LIGHT_INFO_ALL = "0x3F";

    /**
     * 心跳
     */
    public static final String  HEART_BEAT = "0x0A";

    public static final String SYNCHRONIZED_CENTER = "0xBF";

    public static final String ACK_SUCCESS = "00";

    /**
     * ACK状态码-10H
     * <br>命令部分执行出错，具体查看后面每个单灯控制器的操作的ACK
     * <br>该状态在主动查询设备状态时表示集中器正常，但有设备存在异常
     */
    public static final String ACK_PART_SUCCESS = "10";

    public static final String DOWN_CMD_36 = "0x36";
    public static final String DOWN_CMD_37 = "0x37";
}
