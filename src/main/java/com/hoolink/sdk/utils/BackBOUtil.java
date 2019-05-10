package com.hoolink.sdk.utils;

import com.hoolink.sdk.bo.BackBO;
import com.hoolink.sdk.exception.HoolinkExceptionMassageEnum;

/**
 * @author XuBaofeng.
 * @date 2018-12-27 10:00.
 * <p>
 * description:
 */
public class BackBOUtil {

    public static <T> BackBO<T> operateError(HoolinkExceptionMassageEnum message) {
        return new BackBO<>(Boolean.FALSE, message.getMassage());
    }

    public static <T> BackBO<T> operateError(String message) {
        return new BackBO<>(Boolean.FALSE, message);
    }

    public static <T> BackBO<T> operateError(T data, String message) {
        return new BackBO<>(Boolean.FALSE, message);
    }

    public static final <T> BackBO<T> defaultBackBO() {
        return defaultBackBO(null, null);
    }

    public static final <T> BackBO<T> defaultBackBO(T data) {
        return defaultBackBO(data, null);
    }

    /**
     * 封装处理过程中报错或者是参数获取失败等异常情况的返回
     *
     * @return
     */
    public static final <T> BackBO<T> defaultBackBO(T data, String message) {
        BackBO<T> backBO = new BackBO<>();
        backBO.setStatus(Boolean.TRUE);
        backBO.setData(data);
        backBO.setMessage(message);
        return backBO;
    }
}