package com.jw.sdk.utils;

import com.jw.sdk.constants.CommonConstants;
import java.text.DecimalFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * @Author zhangyy
 * @DateTime 2019-08-29 14:56
 * @Description
 */
public class DataCenterUtil {



    /**
     * 时间戳转localdate
     * @param timestamp
     * @return
     */
    public static LocalDate timestampToDate(Long timestamp){
        Instant instant = Instant.ofEpochMilli(timestamp);
        ZoneId zone = ZoneId.systemDefault();
        LocalDateTime localDateTime=LocalDateTime.ofInstant(instant,zone);
        LocalDate localDate=localDateTime.toLocalDate();
        return localDate;
    }

    /**
     * 计算百分比保留一位小数
     * @param molecule
     * @param denominator
     */
    public static Double colPercent(Long molecule,Long denominator){
        DecimalFormat df = new DecimalFormat("#");
        molecule=molecule* CommonConstants.INT_ONEHUNDERD;
        if(denominator.equals(CommonConstants.INT_ZERO.longValue())){
            denominator=CommonConstants.INT_ONE.longValue();
        }
        Double dd=Double.valueOf(molecule.toString())/denominator;
        Double d=Double.valueOf(df.format(dd));
        return d;
    }
}
