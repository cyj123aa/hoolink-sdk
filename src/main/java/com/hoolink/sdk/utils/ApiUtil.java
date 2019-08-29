package com.hoolink.sdk.utils;

import org.springframework.util.CollectionUtils;

import java.util.Map;

/**
 * @author zhouyun
 * @date 2019/8/26 17:18
 * @desc 组装URL地址
 **/
public class ApiUtil {

    private static final String HTTPS = "https://";

    /**
     * 获取HTTPS协议的API
     * @param host
     * @param api
     * @param params
     * @return
     */
    public static String getApi(String host, String api, Map<String, String> params) {
        StringBuffer sb = new StringBuffer(HTTPS).append(host).append(api);
        if (!CollectionUtils.isEmpty(params)) {
            sb.append("?");
            params.forEach((key, value) -> sb.append(key).append("=").append(value).append("&"));
            sb.deleteCharAt(sb.lastIndexOf("&"));
        }
        return sb.toString();
    }
}
