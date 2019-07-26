package com.hoolink.sdk.utils;

import java.util.Arrays;
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
    public static String getTemplateParams(List<String> list) {
        StringBuilder sb = new StringBuilder("[\"");
        for (int i = 0; i < list.size(); i++) {
            if (i == (list.size() - 1)) {
                sb.append(list.get(i));
            } else {
                sb.append(list.get(i))
                        .append("\",\"");
            }
        }
        return sb.append("\"]").toString();
    }
}
