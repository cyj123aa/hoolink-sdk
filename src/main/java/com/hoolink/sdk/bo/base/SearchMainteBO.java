package com.hoolink.sdk.bo.base;

import com.hoolink.sdk.bo.rpc.PageParamBO;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

/**
 * @author Administrator
 */
@Data
public class SearchMainteBO extends PageParamBO implements Serializable {

    /**
     * <pre>
     * 项目名称   可不填 模糊查询
     * 表字段 : base_project.project_name
     * </pre>
     */
    private String name;

    /**
     * <pre>
     *
     * 表字段 : base_project.customer_no
     * </pre>
     */

    private List<String> customerNo;
}
