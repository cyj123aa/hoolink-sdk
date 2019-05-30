package com.hoolink.sdk.utils;

import java.math.BigDecimal;

/**
 * 数字工具类
 *
 * @author zhangxin
 * @date 2019/1/8
 */
public class NumberUtil {

    /**
     * 两个Double相加
     *
     * @param n1 number 1
     * @param n2 number 2
     * @return n1 + n2
     */
    public static Double add(Double n1, Double n2) {
        BigDecimal b1 = new BigDecimal(n1.toString());
        BigDecimal b2 = new BigDecimal(n2.toString());
        return b1.add(b2).doubleValue();
    }

    /**
     * 两个Float相加
     *
     * @param n1 number 1
     * @param n2 number 2
     * @return n1 + n2
     */
    public static Float add(Float n1, Float n2) {
        BigDecimal b1 = new BigDecimal(n1.toString());
        BigDecimal b2 = new BigDecimal(n2.toString());
        return b1.add(b2).floatValue();
    }

    /**
     * 两个Double数相减
     *
     * @param n1 number 1
     * @param n2 number 2
     * @return n1 - n2
     */
    public static Double sub(Double n1, Double n2) {
        BigDecimal b1 = new BigDecimal(n1.toString());
        BigDecimal b2 = new BigDecimal(n2.toString());
        return b1.subtract(b2).doubleValue();
    }

    /**
     * 两个Float数相减
     *
     * @param n1 number 1
     * @param n2 number 2
     * @return n1 - n2
     */
    public static Float sub(Float n1, Float n2) {
        BigDecimal b1 = new BigDecimal(n1.toString());
        BigDecimal b2 = new BigDecimal(n2.toString());
        return b1.subtract(b2).floatValue();
    }

    /**
     * 两个Double数相乘
     *
     * @param n1 number 1
     * @param n2 number 2
     * @return n1 * n2
     */
    public static Double mul(Double n1, Double n2) {
        BigDecimal b1 = new BigDecimal(n1.toString());
        BigDecimal b2 = new BigDecimal(n2.toString());
        return b1.multiply(b2).doubleValue();
    }

    /**
     * 两个Float数相乘
     *
     * @param n1 number 1
     * @param n2 number 2
     * @return n1 * n2
     */
    public static Float mul(Float n1, Float n2) {
        BigDecimal b1 = new BigDecimal(n1.toString());
        BigDecimal b2 = new BigDecimal(n2.toString());
        return b1.multiply(b2).floatValue();
    }

    /**
     * 两个Double数相除
     *
     * @param n1 number 1
     * @param n2 number 2
     * @return n1 / n2
     */
    public static Double div(Double n1, Double n2) {
        BigDecimal b1 = new BigDecimal(n1.toString());
        BigDecimal b2 = new BigDecimal(n2.toString());
        return b1.divide(b2).doubleValue();
    }

    /**
     * 两个Float数相除
     *
     * @param n1 number 1
     * @param n2 number 2
     * @return n1 / n2
     */
    public static Float div(Float n1, Float n2) {
        BigDecimal b1 = new BigDecimal(n1.toString());
        BigDecimal b2 = new BigDecimal(n2.toString());
        return b1.divide(b2).floatValue();
    }

    /**
     * 两个Double数相除后取四舍五入保留两位小数
     *
     * @param n1 number 1
     * @param n2 number 2
     * @return n1 / n2 后四舍五入
     */
    public static Double round(Double n1, Double n2){
        Double div = div(n1, n2);
        BigDecimal b1 = new BigDecimal(div);
        return b1.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
