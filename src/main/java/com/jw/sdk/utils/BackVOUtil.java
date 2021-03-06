package com.jw.sdk.utils;

import com.jw.sdk.exception.ExceptionMassageEnum;
import com.jw.sdk.vo.BackVO;

/**
 * @author XuBaofeng.
 * @date 2018-09-29 22:11.
 * <p>
 * description: 这个类仅使用在提供接口给web使用的controller中
 */
public class BackVOUtil {

    /**
     * 当controller捕获到异常时, 如果是
     *
     * @param e
     * @return
     */
    public static <T> BackVO<T> operateError(Exception e) {
        String message = e.getMessage();
        if (!ExceptionMassageEnum.isExist(message)) {
            message = ExceptionMassageEnum.SYSTEM_ERROR.getMassage();
        }
        return operateError(message);
    }

    /**
     * 当web端传递的参数不符合该接口的参数定义, 则直接返回该BackVO
     *
     * @param message
     * @param <T>
     * @return
     */
    public static <T> BackVO<T> operateError(String message) {
        return assembleErrorBackVO(message);
    }

    /**
     * 封装更新操作没有返回值
     *
     * @return
     */
    public static <T> BackVO<T> operateAccess() {
        return operateAccess(null);
    }

    public static <T> BackVO<T> operateAccess(T data) {
        return operateAccess(data, null);
    }

    public static <T> BackVO<T> operateAccess(T data, String message) {
        return assembleAccessBackVO(data, message);
    }

    /**
     * 组建请求错误返回的vo
     *
     * @param message
     * @param <T>
     * @return
     */
    private static <T> BackVO<T> assembleErrorBackVO(String message) {
        return assembleBackVO(null, message, Boolean.FALSE);
    }

    /**
     * 组建请求正常返回组建的vo
     *
     * @param data
     * @param message
     * @param <T>
     * @return
     */
    private static <T> BackVO<T> assembleAccessBackVO(T data, String message) {
        return assembleBackVO(data, message, Boolean.TRUE);
    }

    /**
     * 组建vo
     *
     * @param data
     * @param message
     * @param <T>
     * @return
     */
    private static <T> BackVO<T> assembleBackVO(T data, String message, Boolean boo) {
        BackVO<T> backVO = new BackVO<>();
        backVO.setData(data);
        backVO.setMessage(message);
        backVO.setStatus(boo);
        return backVO;
    }

    public static <T> BackVO<T> operateErrorToLogin(String message) {
        BackVO<T> backVO = new BackVO<>();
        backVO.setData(null);
        backVO.setMessage(message);
        backVO.setStatus(false);
        backVO.setCode("login");
        return backVO;
    }

}
