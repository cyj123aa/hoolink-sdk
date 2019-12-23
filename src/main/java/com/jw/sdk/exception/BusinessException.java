package com.jw.sdk.exception;

/**
 * @author zhao_aken
 * Created by zhao_aken on 16/5/1.
 */
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 6975474977247031741L;

    public BusinessException(String msg) {
        super(msg);
    }

    public BusinessException(String msg, Throwable e) {
        super(msg, e);
    }

    public BusinessException(ExceptionMassageEnum exceptionMassageEnum) {
        super(exceptionMassageEnum.getMassage());
    }

    public BusinessException(ExceptionMassageEnum exceptionMassageEnum, Throwable e) {
        super(exceptionMassageEnum.getMassage(), e);
    }
}
