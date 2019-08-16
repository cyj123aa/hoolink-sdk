package com.hoolink.sdk.bo.base;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 用于展示 项目列表
 * @author chenyuejun
 */
@Data
public class ListProjectBO  implements Serializable {

    private static final long serialVersionUID = -5040714203284797155L;
    /**
     * 项目id   项目表的id
     */
    private Long id;

    /**
     * <pre>
     * 项目编号
     * 表字段 : base_project.project_no
     * </pre>
     */

    private String no;

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
     * 项目所属场景name
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
     * 归属公司编号
     * 表字段 : base_project.customer_no
     * </pre>
     */
    private String customerNo;

    /**
     * <pre>
     * 负责人名称
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
     * 创建时间
     * 表字段 : base_project.created
     * </pre>
     */
    private Long created;

    /**
     * <pre>
     * 项目状态: 启用/禁用
     * 表字段 : base_project.project_status
     * </pre>
     */
    private Boolean status;

    /**
     * <pre>
     * 项目所属场景ID
     * 表字段 : base_project.scenc_id
     * </pre>
     */
    private Long scencId;

    /**
     * 客户名（对应页面展示的公司名）
     */
    private String customerName;

    /**
     * <pre>
     * 流程id
     * 表字段 : base_project.process_id
     * </pre>
     */
    private Long processId;

    /**
     * <pre>
     * 经度
     * 表字段 : base_project.longitude
     * </pre>
     */
    private BigDecimal longitude;

    /**
     * <pre>
     * 纬度
     * 表字段 : base_project.latitude
     * </pre>
     */
    private BigDecimal latitude;

    /**
     * <pre>
     * 省
     * 表字段 : base_project.province
     * </pre>
     */
    private String province;

    /**
     * <pre>
     * 市
     * 表字段 : base_project.city
     * </pre>
     */
    private String city;

    /**
     * <pre>
     * 区
     * 表字段 : base_project.area
     * </pre>
     */
    private String area;

}
