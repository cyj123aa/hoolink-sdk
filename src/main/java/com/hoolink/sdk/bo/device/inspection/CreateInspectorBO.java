package com.hoolink.sdk.bo.device.inspection;

import com.hoolink.sdk.annotation.valid.Mobile;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * 巡检人员
 *
 * @author zhangxin
 * @date 2019/5/31
 */
@Data
public class CreateInspectorBO implements Serializable {

    private static final long serialVersionUID = -345132006453901209L;

    /*** 项目ID */
    @NotNull(message = "请选择项目")
    private Long projectId;

    /*** 姓名 */
    @NotBlank(message = "请输入姓名")
    @Size(min = 1, max = 15, message = "您输入的姓名格式有误！")
    private String name;

    /*** 编号 */
    @NotBlank(message = "请输入编号")
    @Size(min = 3, max = 15, message = "您输入的编号格式有误！")
    private String number;

    /*** 性别 */
    @NotNull(message = "请选择性别")
    private Boolean gender;

    /*** 岗位 */
    @NotBlank(message = "请输入岗位")
    @Size(min = 1, max = 15, message = "您输入的岗位格式有误！")
    private String post;

    /*** 手机号 */
    @Mobile
    @NotBlank(message = "请输入手机号")
    private String mobile;

    /*** 头像ID */
    @NotNull(message = "请上传头像")
    private Long avatarId;
}
