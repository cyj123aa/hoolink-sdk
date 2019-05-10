package com.hoolink.sdk.utils;

import java.util.Random;

/**
 * 随机操作相关工具类
 *
 * @author zhangxin
 * @since sdk 2.0
 */
public class RandomUtil {

    /**
     * 生成当前任务标识task_uuid'
     */
    private static final char[] HEX_STRING = new char[]{
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
    };

    /**
     * 获取32位十六进制随机数
     *
     * @return
     */
    public static String randHexStr() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int length=32;
        for (int i = 0; i < length; i++) {
            sb.append(HEX_STRING[random.nextInt(HEX_STRING.length)]);
            if (i == 7) {
                sb.append("-");
            } else if (i == 11) {
                sb.append("-");
            } else if (i == 15) {
                sb.append("-");
            } else if (i == 19) {
                sb.append("-");
            }
        }
        return sb.toString();
    }
}
