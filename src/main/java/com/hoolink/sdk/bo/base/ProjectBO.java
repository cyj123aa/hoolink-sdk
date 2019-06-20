package com.hoolink.sdk.bo.base;

import com.hoolink.sdk.annotation.valid.Mobile;
import java.io.Serializable;
import java.util.List;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * @author chenyuejun.
 * @date 2019-04-16 16:24.
 * <p>
 * description: 用于项目管理 创建 修改BO *
 */
@Data
public class ProjectBO  implements Serializable {

    private static final long serialVersionUID = -2165369625193431447L;
    /**
     * @NotNull(message = "普通字段a不能为空")：不能为null，但可以为empty
     * @NotEmpty(message = "普通字段a不能为空")：不能为null，而且长度必须大于0
     * @NotBlank(message = "普通字段a不能为空")：只能作用在String上，不能为null，而且调用trim()后，长度必须大于0
     */


    /**
     * <pre>
     * 项目所属场景ID
     * 表字段 : base_project.scenc_id
     * </pre>
     */
    @NotNull(message = "项目所属场景ID不能为空")
    private Long scencId;


    /**
     * <pre>
     * 项目名称
     * 表字段 : base_project.project_name
     * </pre>
     */
    @NotBlank(message = "项目名称不能为空")
    private String name;

    /**
     * <pre>
     * 项目编号
     * 表字段 : base_project.project_no
     * </pre>
     */ //@NotBlank(message = "项目编号不能为空")

    private String no;


    /**
     * <pre>
     * 客户号
     * 表字段 : base_project.customer_no
     * </pre>
     */
    @NotBlank(message = "客户号不能为空")
    private String customerNo;



    /**
     * <pre>
     * 项目负责人
     * 表字段 : base_project.owner_name
     * </pre>
     */
    @NotBlank(message = "项目负责人不能为空")
    private String ownerName;

    /**
     * <pre>
     * 负责人手机号
     * 表字段 : base_project.owner_phone
     * </pre>
     */
    @NotBlank(message = "负责人手机号不能为空")
    @Mobile
    private String ownerPhone;

    /**
     * <pre>
     * 项目地址
     * 表字段 : base_project.address
     * </pre>
     */
    @NotBlank(message = "项目地址不能为空")
    private String address;


    /**
     * <pre>
     * 描述
     * 表字段 : base_project.description
     * </pre>
     */
    private String description;
    /**
     * <pre>
     * 项目模型ID
     * 表字段 : base_project.model_id
     * </pre>
     */

    private Long modelId;

    /**
     * <pre>
     * 项目模型zip文件ID
     * 表字段 : base_project.model_zip_id
     * </pre>
     */
    private Long modelZipId;

    /**
     * <pre>
     * 附件id 集合
     * 表字段 : 存入中间表
     * </pre>
     */
    private List<Long> annexIds;


    /**
     * <pre>
     * 项目设备类型集合
     * 表字段 : 存入中间表
     * </pre>
     */
    private List<DeviceTypeBO> deviceType;


    /**
     * 权限ID集合
     */

    private List<Long> menuId;
    /**
     * 创建人
     */
    private  Long  creator;
}
