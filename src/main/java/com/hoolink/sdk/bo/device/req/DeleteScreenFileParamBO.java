package com.hoolink.sdk.bo.device.req;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author wangdong
 * @date 2019/5/23 19:16
 */
@Data
public class DeleteScreenFileParamBO implements Serializable {
    private static final long serialVersionUID = -9190092490037681191L;

    /*** 项目ID */
    private Long projectId;

    /*** 需要删除的文件信息 */
    private List<DeleteScreenFileBO> deleteScreenFiles;
}
