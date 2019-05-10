package com.hoolink.sdk.bo.base;

import com.hoolink.sdk.bo.rpc.PageParamBO;
import java.io.Serializable;
import java.util.List;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * 项目查询参数
 * @author chenyuejun
 */
@Data
public class SearchProjectByRoleIdBO extends PageParamBO implements Serializable {

    private static final long serialVersionUID = 4236629997370731650L;
    /**
     * <pre>
     * roleId 用户id
     * 表字段 : base_project.scenc_id
     * </pre>
     */
    private Long userId;




}
