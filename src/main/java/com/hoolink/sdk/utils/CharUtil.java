package com.hoolink.sdk.utils;

import java.util.Random;

/**
 * @author XuBaofeng.
 * @date 2019-05-15 15:59.
 * <p>
 * description:
 */
public class CharUtil {

    private static final char[] CHARS = {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
            'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
    };

    /**
     * 追加数组:
     * * 将 source 追加到 target 中, 从 index 位开始
     *
     * @param source
     * @param target
     * @param index
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
        return CHARS[new Random().nextInt(36)];
    }
}
