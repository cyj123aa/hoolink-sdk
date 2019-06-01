package com.hoolink.sdk.utils;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

/**
 * @author <a herf="mailto:yanwu0527@163.com">XuBaofeng</a>
 * @date 2019-06-01 15:42.
 * <p>
 * description:
 */
public class ScheduleUtil {
    private static final String TEMP = " ";

    public static String assemblyCron(LocalTime time) {
        return assemblyCron(time, null);
    }

    /**
     * 组装corn
     *
     * @param time
     * @return
     */
    public static String assemblyCron(LocalTime time, LocalDate date) {
        if (Objects.isNull(time)) {
            time = LocalTime.now();
        }
        if (Objects.isNull(date)) {
            date = LocalDate.now();
        }
        return time.getSecond() + TEMP +
                time.getMinute() + TEMP +
                time.getHour() + TEMP +
                date.getDayOfMonth() + TEMP +
                date.getMonthValue() + TEMP +
                "?" + TEMP + date.getYear();
    }
}
