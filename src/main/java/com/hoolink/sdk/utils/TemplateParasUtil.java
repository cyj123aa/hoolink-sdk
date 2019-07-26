package com.hoolink.sdk.utils;

import com.hoolink.sdk.exception.BusinessException;
import com.hoolink.sdk.exception.HoolinkExceptionMassageEnum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @ClassName TemplateParasUtil
 * @Author huyaxi
 * @DATE 2019/7/26 16:13
 */
public class TemplateParasUtil {

    /**
     * 拼接短信消息体
     *
     * @param list
     * @return
     */
    private static String getTemplateParams(List<String> list) {
        StringBuilder sb = new StringBuilder("[\"");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append(list.get(i));
            if (i != (size - 1)) {
                sb.append("\",\"");
            }
        }
        return sb.append("\"]").toString();
    }

    public static String getTemplateParams(Date date, String... strs) {
        if (ArrayUtil.isEmpty(strs)) {
            throw new BusinessException(HoolinkExceptionMassageEnum.PARAM_ERROR);
        }
        if (date == null) {
            date = new Date(System.currentTimeMillis());
        }
        List<String> strings = new ArrayList<>();
        strings.add(DateUtil.date2String(date, "yyyy/MM/dd"));
        strings.add(DateUtil.date2String(date, "HH:mm:ss"));
        strings.addAll(Arrays.asList(strs));
        return getTemplateParams(strings);
    }

}
