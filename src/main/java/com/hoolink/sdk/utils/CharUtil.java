package com.hoolink.sdk.utils;

import org.apache.commons.lang3.RandomUtils;

/**
 * @author XuBaofeng.
 * @date 2019-05-15 15:59.
 * <p>
 * description:
 */
public class CharUtil {

    private static final char[] CHARS = {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
    };

    /**
     * 追加数组:
     * * 将 source 追加到 target 中, 从 index 位开始
     *
     * @param source 源数据
     * @param target 目标
     * @param index  起始位置
     */
    public static void charsAppend(char[] source, char[] target, int index) {
        for (int i = 0; i < source.length; i++) {
            target[index + i] = source[i];
        }
    }

    /**
     * 生成随机字符
     *
     * @return
     */
    public static char getRandomChar() {
        return CHARS[RandomUtils.nextInt(0, 26)];
    }
}
