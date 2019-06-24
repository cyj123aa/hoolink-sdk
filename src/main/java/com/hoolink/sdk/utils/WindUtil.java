package com.hoolink.sdk.utils;

import com.hoolink.sdk.constants.FloatConstant;

/**
 * @author 朱礼
 * @Date 2019/6/1
 * @Desc
 */
public class WindUtil {

    /**
     * 将风向角度转成名称
     * @param windDirection
     * 北：348.76-11.25
     * 东北：11.26-78.75
     * 东：78.76-101.25
     * 东南：101.26-168.75
     * 南：168.76-191.25
     * 西南：191.26-258.75
     * 西：258.76-281.25
     * 西北：281.26-348.75
     * @return
     */
    public static String convertWindName(int windDirection){
        String  windName = "北风";
        if (windDirection >= FloatConstant.FLOAT_11_POINT_26 && windDirection <= FloatConstant.FLOAT_78_POINT_75) {
            windName = "东北风";
        } else if (windDirection >= FloatConstant.FLOAT_78_POINT_76 && windDirection <= FloatConstant.FLOAT_101_POINT_25) {
            windName = "东风";
        } else if (windDirection >= FloatConstant.FLOAT_101_POINT_26 && windDirection <= FloatConstant.FLOAT_168_POINT_75) {
            windName = "东南风";
        } else if (windDirection >= FloatConstant.FLOAT_168_POINT_76 && windDirection <= FloatConstant.FLOAT_191_POINT_25) {
            windName = "南风";
        } else if (windDirection >= FloatConstant.FLOAT_191_POINT_26 && windDirection <= FloatConstant.FLOAT_258_POINT_75) {
            windName = "西南风";
        } else if (windDirection >= FloatConstant.FLOAT_258_POINT_76 && windDirection <= FloatConstant.FLOAT_281_POINT_25) {
            windName = "西风";
        } else if (windDirection >= FloatConstant.FLOAT_281_POINT_26 && windDirection <= FloatConstant.FLOAT_348_POINT_75) {
            windName = "西北风";
        }
        return windName;
    }

    /**
     * 将风向角度转成符号
     * @param windDirection
     * @return
     */
    public static String convertWindSign(int windDirection){
        String sing = "N";
        if (windDirection >= FloatConstant.FLOAT_11_POINT_26 && windDirection <= FloatConstant.FLOAT_78_POINT_75) {
            sing = "EN";
        } else if (windDirection >= FloatConstant.FLOAT_78_POINT_76 && windDirection <= FloatConstant.FLOAT_101_POINT_25) {
            sing = "E";
        } else if (windDirection >= FloatConstant.FLOAT_101_POINT_26 && windDirection <= FloatConstant.FLOAT_168_POINT_75) {
            sing = "ES";
        } else if (windDirection >= FloatConstant.FLOAT_168_POINT_76 && windDirection <= FloatConstant.FLOAT_191_POINT_25) {
            sing = "S";
        } else if (windDirection >= FloatConstant.FLOAT_191_POINT_26 && windDirection <= FloatConstant.FLOAT_258_POINT_75) {
            sing = "WS";
        } else if (windDirection >= FloatConstant.FLOAT_258_POINT_76 && windDirection <= FloatConstant.FLOAT_281_POINT_25) {
            sing = "W";
        } else if (windDirection >= FloatConstant.FLOAT_281_POINT_26 && windDirection <= FloatConstant.FLOAT_348_POINT_75) {
            sing = "WN";
        }

        return sing;
    }

    /**
     * 将风速转成风力等级
     * @param windSpeed
     * @return
     */
    public static Integer convertWindLevel(float windSpeed){
        Integer windLevel = 18;
        if (windSpeed >= 0 && windSpeed <= FloatConstant.FLOAT_0_POINT_2) {
            windLevel = 0;
        } else if (windSpeed >= FloatConstant.FLOAT_0_POINT_3 && windSpeed <= FloatConstant.FLOAT_1_POINT_5) {
            windLevel = 1;
        } else if (windSpeed >= FloatConstant.FLOAT_1_POINT_6 && windSpeed <= FloatConstant.FLOAT_3_POINT_3) {
            windLevel = 2;
        } else if (windSpeed >= FloatConstant.FLOAT_3_POINT_4 && windSpeed <= FloatConstant.FLOAT_5_POINT_4) {
            windLevel = 3;
        } else if (windSpeed >= FloatConstant.FLOAT_5_POINT_5 && windSpeed <= FloatConstant.FLOAT_7_POINT_9) {
            windLevel = 4;
        } else if (windSpeed >= FloatConstant.FLOAT_8_POINT_0 && windSpeed <= FloatConstant.FLOAT_10_POINT_7) {
            windLevel = 5;
        } else if (windSpeed >= FloatConstant.FLOAT_10_POINT_8 && windSpeed <= FloatConstant.FLOAT_13_POINT_8) {
            windLevel = 6;
        } else if (windSpeed >= FloatConstant.FLOAT_13_POINT_9 && windSpeed <= FloatConstant.FLOAT_17_POINT_1) {
            windLevel = 7;
        } else if (windSpeed >= FloatConstant.FLOAT_17_POINT_2 && windSpeed <= FloatConstant.FLOAT_20_POINT_7) {
            windLevel = 8;
        } else if (windSpeed >= FloatConstant.FLOAT_20_POINT_8 && windSpeed <= FloatConstant.FLOAT_24_POINT_4) {
            windLevel = 9;
        } else if (windSpeed >= FloatConstant.FLOAT_24_POINT_5 && windSpeed <= FloatConstant.FLOAT_28_POINT_4) {
            windLevel = 10;
        } else if (windSpeed >= FloatConstant.FLOAT_28_POINT_5 && windSpeed <= FloatConstant.FLOAT_32_POINT_6) {
            windLevel = 11;
        } else if (windSpeed >= FloatConstant.FLOAT_32_POINT_7 && windSpeed <= FloatConstant.FLOAT_36_POINT_9) {
            windLevel = 12;
        } else if (windSpeed >= FloatConstant.FLOAT_37_POINT_0 && windSpeed <= FloatConstant.FLOAT_41_POINT_4) {
            windLevel = 13;
        } else if (windSpeed >= FloatConstant.FLOAT_41_POINT_5 && windSpeed <= FloatConstant.FLOAT_46_POINT_1) {
            windLevel = 14;
        } else if (windSpeed >= FloatConstant.FLOAT_46_POINT_2 && windSpeed <= FloatConstant.FLOAT_50_POINT_9) {
            windLevel = 15;
        } else if (windSpeed >= FloatConstant.FLOAT_51_POINT_0 && windSpeed <= FloatConstant.FLOAT_56_POINT_0) {
            windLevel = 16;
        } else if (windSpeed >= FloatConstant.FLOAT_56_POINT_1 && windSpeed <= FloatConstant.FLOAT_61_POINT_2) {
            windLevel = 17;
        }
        return windLevel;
    }

}
