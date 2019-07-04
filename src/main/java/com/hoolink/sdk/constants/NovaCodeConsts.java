package com.hoolink.sdk.constants;

/**
 * Created by zhao_aken on 2017/9/18.
 */
public class NovaCodeConsts {
    /**
     * 利雅得显示屏   SCREEN
     */
    public static final byte SCREEN_FRAME_START = (byte) 0xAA;
    public static final byte SCREEN_FRAME_END = (byte) 0xCC;
    public static final byte SCREEN_POWER_ONOFF = (byte) 0x84;
    /**
     * (清空)定时开关屏控制
     */
    public static final byte SCREEN_OFF_SCHEDULE = (byte) 0x8A;
    /**
     * (清空)定时播放
     */
    public static final byte SCREEN_FILE_CLEAR_SCHEDULE = (byte) 0x41;
    /**
     * (清空)定时亮度控制
     */
    public static final byte SCREEN_POWER_OFF_SCHEDULE = (byte) 0x43;
    public static final byte SCREEN_POWER_ONOFF_BACK = (byte) 0x85;
    //心跳
    public static final String SCREEN_HEART_BEAT = "0x00";
    /**
     * 显示屏统一返回状态
     */
    public static final byte SCREEN_CMD_BACK_SUCCESS = (byte) 0x01;
    public static final byte SCREEN_CMD_BACK_FAILED = (byte) 0x00;
    /**
     * RPC消费者接口
     */
    //发送文件名
    public static final String SCREEN_SEND_FILE_NAME = "0x11";
    //发送文件名返回
    public static final byte SCREEN_SEND_FILE_NAME_BACK = (byte) 0x12;
    //发送文件
    public static final String SCREEN_SEND_FILE = "0x13";
    //发送文件返回
    public static final byte SCREEN_SEND_FILE_BACK = (byte) 0x14;
    //下发文件结束
    public static final byte SCREEN_SEND_FILE_END = (byte) 0xF9;
    //屏幕开关
    public static final String SCREEN_ONOFF = "0x05";
    //屏幕开关返回
    public static final byte SCREEN_ONOFF_BACK = (byte) 0x06;
    //设置亮度
    public static final String SCREEN_BRIGHTNESS = "0x07";
    //设置亮度返回
    public static final byte SCREEN_BRIGHTNESS_BACK = (byte) 0x08;
    //根据清单播放
    public static final String SCREEN_PLAY_BY_LIST = "0x1B";
    //根据清单播放返回
    public static final byte SCREEN_PLAY_BY_LIST_BACK = (byte) 0x1C;
    //清除文件
    public static final String SCREEN_FILE_CLEAR = "0x7C";
    //清除文件返回
    public static final byte SCREEN_FILE_CLEAR_BACK = (byte) 0x7D;
    //显示屏招测状态
    public static final String SCREEN_QUERY_STATUS = "0x01";
    /*** 显示屏定时任务下发 */
    public static final String SCREEN_TIMING_CONTROL = "timingControl";
    /*** 清除显示屏时控计划 */
    public static final String SCREEN_CLEAR_TIMING_CONTROL = "clearTimingControl";

    /**
     * ================================指令码内部参数值=============================
     */
    //开屏幕
    public static final byte VALUE_SCREEN_ON = 0x01;
    //关屏幕
    public static final byte VALUE_SCREEN_OFF = 0x02;
    //自动调节亮度
    public static final int VALUE_SCREEN_BRIGHTNESS_AUTO = 1;
    //手动调节亮度
    public static final int VALUE_SCREEN_BRIGHTNESS_HAND = 2;
    //定时调节亮度
    public static final int VALUE_SCREEN_BRIGHTNESS_TIMING = 3;
}
