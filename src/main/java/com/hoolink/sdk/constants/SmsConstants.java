package com.hoolink.sdk.constants;

/**
 * @author wangdong
 * @date 2019/7/26 16:52
 */
public class SmsConstants {

    /**
     * 设备报警提醒 格式：${DATE} ${TIME}，${TXT_60}设备阈值${TXT_10}，${TXT_20}当前值：${TXT_10}
     */
    private static final String DEVICE_ALARM_TEMPLATE_ID = "5b0c7a4f0f494fe0bcc8d48db6537c75";

    /**
     * 工单审批提醒 格式：${DATE} ${TIME}，工单编号：${TXT_12}；故障类型：${TXT_20}；优先级：${TXT_6}；状态：${TXT_20}
     */
    private static final String WORK_TEMPLATE_ID = "2666987357b54584ba4324264e953f4c";

    /**
     * 设备开启关闭提醒 格式：${DATE} ${TIME}，设备${TXT_60}已${TXT_4}
     */
    private static final String DEVICE_ON_OFF_TEMPLATE_ID = "622cdf4b908642c4be078106b1b28ac7";

    /**
     * 策略开启关闭提醒 格式：${DATE} ${TIME}，策略${TXT_60}已${TXT_4}
     */
    private static final String STRATEGY_TEMPLATE_ID = "a81bb31537074311b741f8f31020aa10";

    /**
     * 清单开启关闭提醒 格式：${DATE} ${TIME}，清单${TXT_60}已${TXT_4}
     */
    private static final String CONFIG_TEMPLATE_ID = "5b100a5b873249e7bfa6d4d535ceef24";

    /**
     * 用户对设备进行操作提醒 格式：${DATE} ${TIME}，用户${TXT_20}执行了${TXT_20}
     */
    private static final String USER_OPERATE_TEMPLATE_ID = "2b166fdbd4274afd8e9b83b29b228853";

    /**
     * EDM短信签名 格式：文控中心提醒你在${DATE}前将相关文件输出到缓存库，要求：${TXT_60}
     */
    private static final String EDM_MESSAGE_TEMPLATE_ID = "2027cf05ea414be5bb03b16d1fa2ff57";


}
