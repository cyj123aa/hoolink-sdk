package com.hoolink.sdk.utils;

import java.util.Calendar;

/**
 * @author chenyuejun
 * 关于时间的处理
 */
public class TimeUtil {

    public static  Long getMonthDateOne() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_MONTH, 1);

        return c.getTimeInMillis();
    }

    public static  Long getMonthDateLast() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_MONTH, 1);
        c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
        return c.getTimeInMillis();
    }

    public static  Long getMonthNextDateOne() {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH, -1);
        c.set(Calendar.DAY_OF_MONTH, 1);

        return c.getTimeInMillis();
    }

    public static  Long getMonthNextDateLast() {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH, -1);
        c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));

        return c.getTimeInMillis();
    }

    public static  Long getDayStart(Long time) {
        Calendar c = Calendar.getInstance();
        if (null != time) {
            c.setTimeInMillis(time);
        }
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);

        return c.getTimeInMillis();
    }

    public static  Long getDayEnd(Long time) {
        Calendar c = Calendar.getInstance();
        if (null != time) {
            c.setTimeInMillis(time);
        }
        c.set(Calendar.HOUR_OF_DAY, 23);
        c.set(Calendar.MINUTE, 59);
        c.set(Calendar.SECOND, 59);

        return c.getTimeInMillis();
    }

    /**
     * 计算时间差
     * @param start
     * @param end
     * @return
     */
    public static  Integer dilfferentDaysByMillisecond(Long start,Long end) {
        Integer days = (int)(start - end) / (1000*3600*24) +1;
        return days;
    }


}
