package com.hoolink.sdk.bo.edm;

import lombok.Data;

import java.util.List;

/**
 * @Author: tonghao
 * @Date: 2019/6/11 20:20
 */
@Data
public class TreeParamBO {

    /** 是否展示底层员工 */
    private Boolean showUser;

    /** 传入list表示需要勾选 */
    private List<CheckedParamBO> checkedList;
}
