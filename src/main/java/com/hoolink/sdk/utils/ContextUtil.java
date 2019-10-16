package com.hoolink.sdk.utils;

import com.hoolink.sdk.bo.base.CurrentUserBO;
import com.hoolink.sdk.constants.CommonConstants;


/**
 * @author wm
 * @description 工具类
 */
public class ContextUtil {

    private static ThreadLocal<CurrentUserBO> manageUserInfo = new ThreadLocal<CurrentUserBO>();
    private static ThreadLocal<CurrentUserBO> hoolinkUserInfo = new ThreadLocal<CurrentUserBO>();
    private static ThreadLocal<String> txId = new ThreadLocal<String>();



    public ContextUtil() {
    }

    public static CurrentUserBO getManageCurrentUser(){
        return (CurrentUserBO)manageUserInfo.get();
    }

    public static void setManageCurrentUser(CurrentUserBO user){
        manageUserInfo.set(user);
    }
    public static CurrentUserBO getCurrentUser(){
        return (CurrentUserBO)hoolinkUserInfo.get();
    }

    public static void setCurrentUser(CurrentUserBO user){
        hoolinkUserInfo.set(user);
    }

    public static String getTxid(){
        return (String) txId.get();
    }

    public static void setTxid(String Txid){
        txId.set(Txid);
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
     * 获取每次请求的用户ID
     *
     * @return
     */
    public static Long getUserId() {
        return getManageCurrentUser().getUserId();
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

//    /**
//     * 获取每次请求的项目ID
//     *
//     * @return
//     */
//    public static Long getProjectId() {
//        String context = ContextUtils.getInvocationContext().getContext(ContextConstant.PROJECT_ID);
//        return Long.valueOf(context);
//    }
//
//    /**
//     * 设置每次请求的项目ID
//     *
//     * @param projectId
//     */
//    public static void setProjectId(Long projectId) {
//        ContextUtils.getInvocationContext().addContext(ContextConstant.PROJECT_ID, String.valueOf(projectId));
//    }

}
