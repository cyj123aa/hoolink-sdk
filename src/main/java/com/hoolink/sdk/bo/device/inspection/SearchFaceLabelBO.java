package com.hoolink.sdk.bo.device.inspection;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author zhangxin
 * @date 2019/6/3
 */
@Data
public class SearchFaceLabelBO implements Serializable {

    private static final long serialVersionUID = 8187464999749137183L;

    /*** 项目ID */
    @NotNull
    private Long projectId;
    /*** 人脸标签 */
    @NotNull
    private String faceLabel;
}
