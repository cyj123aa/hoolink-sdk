package com.hoolink.sdk.utils;

import com.hoolink.sdk.bo.base.CurrentUserBO;
import com.hoolink.sdk.constants.CommonConstants;
import com.hoolink.sdk.constants.ContextConstant;
import com.hoolink.sdk.exception.BusinessException;
import com.hoolink.sdk.exception.HoolinkExceptionMassageEnum;
import org.apache.commons.lang3.StringUtils;
import org.apache.servicecomb.swagger.invocation.context.ContextUtils;
import org.apache.servicecomb.swagger.invocation.context.InvocationContext;

import java.net.URLDecoder;

/**
 * @author wm
 * @description 工具类
 */
public class ContextUtil {
    /**
     * 获取全局User
     *
     * @return
     */
    public static CurrentUserBO getCurrentUser() {
        CurrentUserBO userBO = null;
        try {
            InvocationContext context = ContextUtils.getInvocationContext();
            String user = context.getContext(ContextConstant.CURRENT_USER);
            if (StringUtils.isNotEmpty(user)) {
                userBO = JSONUtils.parse(user, CurrentUserBO.class);
                userBO.setUserName(URLDecoder.decode(userBO.getUserName(),"utf-8"));
            }
        } catch (Exception e) {
            return getDefaultUser();
        }
        if (userBO == null) {
            return getDefaultUser();
        }
        return userBO;
    }

    /**
     * 获取全局 UserId
     *
     * @return
     */
    public static Long getCurrentUserId() {
        return getCurrentUser().getUserId();
    }

    /**
     * 获取manage全局User
     *
     * @return
     */
    public static CurrentUserBO getManageCurrentUser() {
        CurrentUserBO userBO = null;
        try {
            InvocationContext context = ContextUtils.getInvocationContext();
            String user = context.getContext(ContextConstant.MANAGE_CURRENT_USER);
            if (StringUtils.isNotEmpty(user)) {
                userBO = JSONUtils.parse(user, CurrentUserBO.class);
            }
        } catch (Exception e) {
            throw new BusinessException(HoolinkExceptionMassageEnum.GET_CURRENT_USER_ERROR);
        }
        if (userBO == null) {
            throw new BusinessException(HoolinkExceptionMassageEnum.GET_CURRENT_USER_ERROR);
        }
        return userBO;
    }

    /**
     * 创建默认用户
     *
     * @return
     */
    private static CurrentUserBO getDefaultUser() {
        CurrentUserBO userBO = new CurrentUserBO();
        userBO.setUserId(CommonConstants.DEFAULT_USER_ID);
        userBO.setAccount(CommonConstants.DEFAULT_USER_ACCOUNT);
        return userBO;
    }

    /**
     * 获取每次请求的全局txID
     *
     * @return
     */
    public static String getTxid() {
        if (ContextUtils.getInvocationContext() == null) {
            return null;
        }
        return ContextUtils.getInvocationContext().getContext(ContextConstant.TX_ID);
    }

    /**
     * 获取每次请求的项目ID
     *
     * @return
     */
    public static Long getProjectId() {
        String context = ContextUtils.getInvocationContext().getContext(ContextConstant.PROJECT_ID);
        return Long.valueOf(context);
    }

    /**
     * 设置每次请求的项目ID
     *
     * @param projectId
     */
    public static void setProjectId(Long projectId) {
        ContextUtils.getInvocationContext().addContext(ContextConstant.PROJECT_ID, String.valueOf(projectId));
    }

    /**
     * 获取每次请求的用户ID
     *
     * @return
     */
    public static Long getUserId() {
        return getCurrentUser().getUserId();
    }
}
