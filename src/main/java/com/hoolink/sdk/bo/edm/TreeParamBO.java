package com.hoolink.sdk.bo.edm;

import lombok.Data;

import java.util.List;

/**
 * @Author: tonghao
 * @Date: 2019/6/11 20:20
 */
@Data
public class TreeParamBO {

    /** 所属公司id 1晶日 2互灵 */
    private Long belongId;

    /** 是否展示底层员工 */
    private Boolean showUser;

    /** 传入list表示需要勾选 */
    private List<CheckedParamBO> checkedList;

    /** 搜索的用户名 目前只搜索用户，若需要搜索组织，自己扩展 */
    private String name;
}
