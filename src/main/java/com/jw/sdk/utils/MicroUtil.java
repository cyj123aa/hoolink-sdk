package com.jw.sdk.utils;

import lombok.extern.slf4j.Slf4j;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.cert.X509Certificate;

/**
 * @author zhouyun
 * @date 2019/8/21 10:10
 * @desc 迈可行请求工具类
 **/
@Slf4j
public class MicroUtil {

    /** 建立连接超时时间 */
    private static final int TIMEOUT = 45000;
    /** 编码方式 */
    public static final String ENCODING = "UTF-8";
    /** 请求方法 */
    public static final String REQUEST_METHOD = "GET";

    /**
     * 创建http连接
     * @param url
     * @param method
     * @return
     * @throws Exception
     */
    private static HttpURLConnection createConnection(String url, String method) throws Exception {
        URL ul = new URL(url);
        trustAllHttpsCertificates();
        HttpURLConnection httpConnection = (HttpURLConnection) ul
                .openConnection();
        // 设置请求时间
        httpConnection.setConnectTimeout(TIMEOUT);
        httpConnection.setRequestProperty("Content-Type",
                "application/x-www-form-urlencoded;charset=" + ENCODING);

        // 设置请求方法
        httpConnection.setRequestMethod(method);
        httpConnection.setDoOutput(true);
        httpConnection.setDoInput(true);

        return httpConnection;
    }

    /**
     * https证书设置
     * @throws Exception
     */
    private static void trustAllHttpsCertificates() throws Exception {
        HttpsURLConnection.setDefaultHostnameVerifier((str, session) -> true);
        TrustManager[] trustAllCerts = new TrustManager[1];
        TrustManager tm = new CommonX509TrustManager();
        trustAllCerts[0] = tm;
        SSLContext sc = SSLContext
                .getInstance("SSL");
        sc.init(null, trustAllCerts, null);
        HttpsURLConnection.setDefaultSSLSocketFactory(sc
                .getSocketFactory());
    }

    static class CommonX509TrustManager implements X509TrustManager {
        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }
        @Override
        public void checkServerTrusted(X509Certificate[] certs, String authType){
            return;
        }
        @Override
        public void checkClientTrusted(X509Certificate[] certs, String authType) {
            return;
        }
    }

    /**
     * 代理http请求
     * @param address
     * @param method
     * @return
     * @throws Exception
     */
    public static String proxyHttpRequest(String address, String method) throws Exception {
        String result = null;
        HttpURLConnection httpConnection = null;
        try {
            httpConnection = createConnection(address, method);
            result = inputStream2String(httpConnection.getInputStream(),
                    ENCODING);
            //返回结果去掉null()
            result = result.substring(5, result.lastIndexOf(')'));
        } catch (Exception e) {
            log.error("https request fail {}", e);
        } finally {
            if (httpConnection != null) {
                httpConnection.disconnect();
            }
        }
        return result;
    }

    /**
     * 流转字符串
     * @param input
     * @param encoding
     * @return
     * @throws IOException
     */
    private static String inputStream2String(InputStream input, String encoding)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(input,
                encoding));
        StringBuilder result = new StringBuilder();
        String temp;
        while ((temp = reader.readLine()) != null) {
            result.append(temp);
        }
        return result.toString();
    }

    /**
     * https get请求
     * @param address
     * @return
     * @throws Exception
     */
    public static String get(String address) throws Exception {
        return proxyHttpRequest(address , REQUEST_METHOD);
    }

}
