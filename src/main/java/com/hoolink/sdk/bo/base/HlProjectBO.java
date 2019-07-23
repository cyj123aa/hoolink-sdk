package com.hoolink.sdk.bo.base;

import java.util.List;
import lombok.Data;

/**
 * @author cyj
 * 互灵平台的 项目BO类
 */
@Data
public class HlProjectBO {
    private Long id;
    /**
     * <pre>
     * 项目所属场景ID
     * 表字段 : base_project.scenc_id
     * </pre>
     */

    private Long scencId;

    /**
     * <pre>
     * 项目所属场景名字
     * 表字段 : base_project.scenc_id
     * </pre>
     */

    private String scencName;


    /**
     * <pre>
     * 项目名称
     * 表字段 : base_project.project_name
     * </pre>
     */

    private String name;

    /**
     * <pre>
     * 项目编号
     * 表字段 : base_project.project_no
     * </pre>
     */

    private String no;



    private String  customerNo;


    /**
     * <pre>
     * 项目负责人
     * 表字段 : base_project.owner_name
     * </pre>
     */

    private String ownerName;

    /**
     * <pre>
     * 负责人手机号
     * 表字段 : base_project.owner_phone
     * </pre>
     */

    private String ownerPhone;

    /**
     * <pre>
     * 项目地址
     * 表字段 : base_project.address
     * </pre>
     */
    private String address;

    /**
     * <pre>
     * 项目模型ID
     * 表字段 : base_project.model_id
     * </pre>
     */
    private Long modelId;
    /**
     * 项目zip的url
     */
    private String modelUrl;

    /**
     * <pre>
     * 项目设备型号集合
     * 表字段 : 存入中间表
     * </pre>
     */
    private List<Long> deviceSubType;


}
