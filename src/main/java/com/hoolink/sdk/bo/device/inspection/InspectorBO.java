package com.hoolink.sdk.bo.device.inspection;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhangxin
 * @date 2019/6/2
 */
@Data
public class InspectorBO implements Serializable {

    private static final long serialVersionUID = -7703878705170697720L;

    /*** 主键 */
    private Long id;
    /*** 项目ID */
    private Long projectId;
    /*** 名字 */
    private String name;
    /*** 编号 */
    private String number;
    /*** 头像ID */
    private Long avatarId;
    /*** 人脸标签 */
    private String faceLabel;
    /*** 性别 */
    private Boolean gender;
    /*** 职位 */
    private String post;
    /*** 手机号 */
    private String mobile;
    /*** 状态 */
    private Boolean status;
    /*** 录入日期 */
    private Long created;
}
