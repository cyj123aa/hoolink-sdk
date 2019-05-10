package com.hoolink.sdk.bo.base;

import com.hoolink.sdk.bo.rpc.PageParamBO;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

/**
 * 项目查询参数
 * @author chenyuejun
 */
@Data
public class SearchProjectBO extends PageParamBO implements Serializable {

    private static final long serialVersionUID = 4236629997370731650L;
    /**
     * <pre>
     * 项目所属场景ID  工厂公园   精确查询 可不填
     * 表字段 : base_project.scenc_id
     * </pre>
     */
    private Long scencId;


    /**
     * <pre>
     * 项目名称   可不填 模糊查询
     * 表字段 : base_project.project_name
     * </pre>
     */
    private String name;



    /**
     * <pre>
     * 项目负责人 可不填  模糊查询
     * 表字段 : base_project.owner_name
     * </pre>
     */

    private String ownerName;

    /**
     * <pre>
     *
     * 表字段 : base_project.customer_no
     * </pre>
     */

    private List<String> customerNo;
    /**
     * <pre>
     * 负责人手机号 模糊查询
     * 表字段 : base_project.owner_phone
     * </pre>
     */

    private String ownerPhone;

}
