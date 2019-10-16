package com.hoolink.sdk.utils;

import com.hoolink.sdk.bo.base.CurrentUserBO;
import com.hoolink.sdk.constants.ContextConstant;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * @author chenzhixiong
 * @date 2019/10/15 15:05
 */
public class UserUtils {
    final static ThreadLocal<CurrentUserBO> curUserIdTL = new ThreadLocal<CurrentUserBO>();


    /***
     *@since : 获取当前用户id\
     *@author
     */
    public static CurrentUserBO getCurrentUser(){
        CurrentUserBO currentUserBO = curUserIdTL.get();
        if (currentUserBO == null){
            try{
                String user = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getHeader(
                    ContextConstant.MANAGE_CURRENT_USER);
                currentUserBO = JSONUtils.parse(user, CurrentUserBO.class);
                curUserIdTL.set(currentUserBO);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return currentUserBO;
    }
}
