package com.jw.sdk.utils;

import com.jw.sdk.exception.BusinessException;
import com.jw.sdk.exception.ExceptionMassageEnum;

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

    public static String[] assemblyCron(LocalTime timingStart, LocalTime timingEnd) {
        if (Objects.isNull(timingStart) || Objects.isNull(timingEnd)) {
            throw new BusinessException(ExceptionMassageEnum.PARAM_ERROR);
        }
        LocalDate today = LocalDate.now();
        LocalTime nowTime = LocalTime.now();
        if (timingStart.isBefore(LocalTime.of(nowTime.getHour(), nowTime.getMinute(), nowTime.getSecond()))) {
            // ----- 在 当前时间 之前[次日] ||  在 当前时间 之后[当日]
            today = today.plusDays(1);
        }
        String start = assemblyCron(timingStart, today);
        String end = assemblyCron(timingEnd, today);
        return new String[]{start, end};
    }

    /**
     * 组装corn
     *
     * @param time
     * @return
     */
    private static String assemblyCron(LocalTime time, LocalDate day) {
        return time.getSecond() + TEMP + time.getMinute() + TEMP + time.getHour() + TEMP +
                day.getDayOfMonth() + TEMP + day.getMonthValue() + TEMP + "?" + TEMP + day.getYear();
    }
}
