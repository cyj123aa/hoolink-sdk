package com.hoolink.sdk.enums;

/**
 * @author <a herf="mailto:yanwu0527@163.com">XuBaofeng</a>
 * @date 2019-07-26 17:46.
 * <p>
 * description:
 */
public enum SmsConstantEnum {
    /*** 设备报警提醒 格式：${DATE} ${TIME}，${TXT_60}设备阈值${TXT_10}，${TXT_20}当前值：${TXT_10} */
    DEVICE_ALARM_TEMPLATE_ID("5b0c7a4f0f494fe0bcc8d48db6537c75", 60, 10, 20, 10),

    /*** 工单审批提醒 格式：${DATE} ${TIME}，工单编号：${TXT_12}；故障类型：${TXT_20}；优先级：${TXT_6}；状态：${TXT_20} */
    WORK_TEMPLATE_ID("2666987357b54584ba4324264e953f4c", 12, 20, 6, 20),

    /*** 设备开启关闭提醒 格式：${DATE} ${TIME}，设备${TXT_60}已${TXT_4} */
    DEVICE_ON_OFF_TEMPLATE_ID("622cdf4b908642c4be078106b1b28ac7", 60, 4),

    /*** 策略开启关闭提醒 格式：${DATE} ${TIME}，策略${TXT_60}已${TXT_4} */
    STRATEGY_TEMPLATE_ID("a81bb31537074311b741f8f31020aa10", 60, 4),

    /*** 清单开启关闭提醒 格式：${DATE} ${TIME}，清单${TXT_60}已${TXT_4} */
    CONFIG_TEMPLATE_ID("5b100a5b873249e7bfa6d4d535ceef24", 60, 4),

    /*** 用户对设备进行操作提醒 格式：${DATE} ${TIME}，用户${TXT_20}执行了${TXT_20} */
    USER_OPERATE_TEMPLATE_ID("2b166fdbd4274afd8e9b83b29b228853", 60, 4),

    /*** 广播占用提醒 格式：${DATE} ${TIME}，您用${TXT_20}开启的广播，已被${TXT_20}用户强制关闭 */
    DEVICE_OCCUPY_TEMPLATE_ID("30e9114502e44ee0aee2fef72a144bea", 20, 20),

    /*** EDM短信签名 格式：文控中心提醒你在${DATE}前将相关文件输出到缓存库，要求：${TXT_60} */
    EDM_MESSAGE_TEMPLATE_ID("2027cf05ea414be5bb03b16d1fa2ff57", 60, 4);

    private String id;
    private int[] len;

    SmsConstantEnum(String id, int... len) {
        this.id = id;
        this.len = len;
    }

    public String getId() {
        return id;
    }

    public int[] getLen() {
        return len;
    }
}
