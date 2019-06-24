package com.hoolink.sdk.bo.omc;

import java.util.List;
import lombok.Data;

/**
 * @author chenyuejun
 */
@Data
public class SelectProcessBO {

    /**
     * manger 需要根据公司名字模糊查询出 公司编号list
     */
    private List<String> customerNo;

    /**
     * 流程名字/项目名称
     */
    private String name;
    /**
     * manger 需要根据项目名称， 去base查询出 project/listProcessId，流程的ids集合
     */
    private List<Long> ids;

}
