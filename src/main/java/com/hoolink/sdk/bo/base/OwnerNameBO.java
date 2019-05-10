package com.hoolink.sdk.bo.base;

import com.hoolink.sdk.annotation.valid.Mobile;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
 * @author chenyuejun
 */
@Data
public class OwnerNameBO {
    /**
     * 项目id   项目表的id
     */
    @NotNull(message = "项目id不能为空")
    private Long id;

    /**
     * <pre>
     * 项目负责人
     * 表字段 : base_project.owner_name
     * </pre>
     */
    @NotBlank(message = "负责人不能为空")
    @Length(min=3, max=16,message = "负责人长度最小3最大16")
    private String ownerName;

    /**
     * <pre>
     * 负责人手机号
     * 表字段 : base_project.owner_phone
     * </pre>
     */
    @NotBlank(message = "手机号不能为空")
    @Mobile
    private String ownerPhone;

}
