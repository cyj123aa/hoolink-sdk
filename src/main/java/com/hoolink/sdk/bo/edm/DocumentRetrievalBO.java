package com.hoolink.sdk.bo.edm;

import com.hoolink.sdk.bo.rpc.PageParamBO;
import lombok.Data;

/**
 * @Author : lys
 * @Date : 2019/6/3 9:43
 * @Instructions : 文档资源检索BO类
 */
@Data
public class DocumentRetrievalBO extends PageParamBO {
    /**
     * 目录id
     */
    String directoryId;

    /**
     * 目录类型
     */
    Integer repertoryTypeCode;

    /**
     * 资源名
     */
    String fileName;

    /**
     * 创建时间排序标志位
     * 1：升序 2：降序
     */
    Integer createTimeSort;

    /**
     * 文件类型排序标志位
     * 1：升序 2：降序
     */
    Integer fileTypeSort;

    /**
     * 文件名排序标志位
     * 1：升序 2：降序
     */
    Integer fileNameSort;

    /**
     * 文件大小排序标志位
     * 1：升序 2：降序
     */
    Integer fileSizeSort;

    /**
     * 资源输出时间排序标志位
     * 1：升序 2：降序
     */
    Integer outputTimeSort;

    /**
     * 是否为最下级组织架构
     */
    Boolean isMostJunior;

    /**
     * 菜单类别  null:权限菜单 true：组织架构  false：资源列表
     */
    Boolean menuType;

    /**
     * 为最下级组织架构时传值，表示部门id
     */
    String departmentId;
}
