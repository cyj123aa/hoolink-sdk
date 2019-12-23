package com.jw.sdk.utils;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 数组工具类
 *
 * @author XuBaofeng.
 * @date 2018-09-28 17:07.
 */
public class ArrayUtil {
    /**
     * 当数组为null或者数组中是否所有的元素全都为null时返回true, 否则返回false
     *
     * @param source
     * @return
     */
    public static boolean isEmpty(Object[] source) {
        if (source == null || source.length == 0) {
            return true;
        }
        for (Object obj : source) {
            if (obj != null) {
                return false;
            }
        }
        return true;
    }

    /**
     * 当数组不为null并且数组中包含不为null的元素时返回true, 否则返回false
     */
    public static boolean isNotEmpty(Object[] source) {
        return !isEmpty(source);
    }

    /**
     * 去重
     * @param originalList
     * @param <T>
     * @return
     */
    public static <T> List<T> removeDuplict(List<T> originalList){
        if(CollectionUtils.isEmpty(originalList)){
            return null;
        }
        Set<T> set = new HashSet(originalList);
        List<T> tempList = new ArrayList(set);
        return tempList;
    }
}
