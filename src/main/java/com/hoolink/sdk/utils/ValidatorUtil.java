package com.hoolink.sdk.utils;

import com.hoolink.sdk.bo.BackBO;
import com.hoolink.sdk.vo.BackVO;
import org.apache.commons.collections.CollectionUtils;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 参数验证工具类
 *
 * @author zhangxin
 * @date 2019/4/17
 */
public class ValidatorUtil {

    private static final String ERROR_MESSAGE_PREFIX = "参数错误：";

    private static final Validator VALIDATOR = Validation.buildDefaultValidatorFactory().getValidator();

    public static final <T> BackBO<T> validateParamToBackBO(Object object, Class<?>... groups) {
        Set<ConstraintViolation<Object>> validate = VALIDATOR.validate(object, groups);
        if (CollectionUtils.isEmpty(validate)) {
            return null;
        }
        return BackBOUtil.operateError(ERROR_MESSAGE_PREFIX +
                validate.stream().map(ConstraintViolation::getMessage).collect(Collectors.joining(",")));
    }

    public static final <T> BackVO<T> validateParamToBackVO(Object object, Class<?>... groups) {
        Set<ConstraintViolation<Object>> validate = VALIDATOR.validate(object, groups);
        if (CollectionUtils.isEmpty(validate)) {
            return null;
        }
        return BackVOUtil.operateError(ERROR_MESSAGE_PREFIX +
                validate.stream().map(ConstraintViolation::getMessage).collect(Collectors.joining(",")));
    }

    public static final <T> BackBO<T> validateToBackBO(Set<ConstraintViolation<?>> validate) {
        return BackBOUtil.operateError(ERROR_MESSAGE_PREFIX +
                validate.stream().map(ConstraintViolation::getMessage).collect(Collectors.joining(",")));
    }

    public static final <T> BackVO<T> validateToBackVO(Set<ConstraintViolation<?>> validate) {
        return BackVOUtil.operateError(ERROR_MESSAGE_PREFIX +
                validate.stream().map(ConstraintViolation::getMessage).collect(Collectors.joining(",")));
    }
}
