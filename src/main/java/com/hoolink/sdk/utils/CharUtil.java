package com.hoolink.sdk.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.CharUtils;
import org.apache.commons.lang3.RandomUtils;

/**
 * @author XuBaofeng.
 * @date 2019-05-15 15:59.
 * <p>
 * description:
 */
@Slf4j
public class CharUtil {

    private static final char[] CHARS = {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
            'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
    };

    /**
     * 追加数组:
     * * 将 source 追加到 target 中, 从 index 位开始
     *
     * @param source 源数据
     * @param target 目标
     * @param index  目标追加的起始位置
     */
    public static void charsAppend(char[] source, char[] target, int index) {
        System.arraycopy(source, 0, target, index, source.length);
    }

    /**
     * 追加数组:
     * * 将 source 追加到 target 中
     *
     * @param source 源数据
     * @param target 目标
     * @return
     */
    public static char[] charsAppend(char[] source, char[] target) {
        int index = -1;
        // ----- 获取追加的起始位置
        for (int i = 0; i < target.length; i++) {
            if (isBlank(target[i])) {
                // ----- 找到第一个空字符
                index = i;
                break;
            }
        }
        // ----- 处理数组最终长度
        int length = 0;
        int targetLength = 0;
        if (index == -1) {
            // ----- 没有空字符
            index = 0;
            targetLength = target.length;
            length = target.length + source.length;
        } else if (index == 0) {
            // ----- 第一个就是空字符
            length = source.length;
        } else {
            // ----- 找到第一个空字符的位置
            length = index + source.length;
            targetLength = target.length;
        }
        char[] result = new char[length];
        // ----- 从 target 往 result copy
        charsAppend(target, result, 0);
        // ----- 从 source 往 result copy
        charsAppend(source, result, targetLength);
        return result;
    }

    /**
     * 生成随机英文字符 [A - Z]
     *
     * @return
     */
    public static char getRandomChar() {
        return getRandom(10, 36);
    }

    /**
     * 生成随机数字字符 [0 - 9]
     *
     * @return
     */
    public static char getRandomNumber() {
        return getRandom(0, 10);
    }

    /**
     * 生成随机字符 [0 - 9 | A - Z]
     *
     * @return
     */
    public static char getRandom() {
        return getRandom(0, 36);
    }

    /**
     * 在字符数组后空位追加随机字符 [A - Z]
     *
     * @param chars
     */
    public static void appendRandomChar(char[] chars) {
        for (int i = chars.length - 1; i >= 0; i--) {
            if (isNotBlank(chars[i])) {
                break;
            }
            chars[i] = getRandomChar();
        }
    }

    /**
     * 在字符数组后空位追加随机字符 [0 - 9]
     *
     * @param chars
     */
    public static void appendRandomNumber(char[] chars) {
        for (int i = chars.length - 1; i >= 0; i--) {
            if (isNotBlank(chars[i])) {
                break;
            }
            chars[i] = getRandomNumber();
        }
    }

    /**
     * 在字符数组后空位追加随机字符 [0 - 9 | A - Z]
     *
     * @param chars
     */
    public static void appendRandom(char[] chars) {
        for (int i = chars.length - 1; i >= 0; i--) {
            if (isNotBlank(chars[i])) {
                break;
            }
            chars[i] = getRandom();
        }
    }

    /**
     * 判断字符是否位空: ['\0', '\n', '\r']
     *
     * @param c
     * @return
     */
    public static boolean isBlank(char c) {
        return c == CharUtils.NUL || c == CharUtils.CR || c == CharUtils.LF;
    }

    public static boolean isNotBlank(char c) {
        return !isBlank(c);
    }

    /**
     * 判断字符数组是否位空: ['\0', '\n', '\r']
     * * 所有字符都为空的数组判断为空数组
     *
     * @param chars
     * @return
     */
    public static boolean isBlank(char[] chars) {
        for (char c : chars) {
            if (isBlank(c)) {
                continue;
            }
            return false;
        }
        return true;
    }

    public static boolean isNotBlank(char[] c) {
        return !isBlank(c);
    }

    private static char getRandom(int index, int end) {
        return CHARS[RandomUtils.nextInt(index, end)];
    }

}
