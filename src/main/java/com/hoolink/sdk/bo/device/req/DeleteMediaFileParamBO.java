package com.hoolink.sdk.bo.device.req;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

import com.hoolink.sdk.bo.device.ProjectParamBO;
import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-11 20:31
 * @Description
 */
@Data
public class DeleteMediaFileParamBO extends ProjectParamBO implements Serializable {

    @NotNull(message = "文件列表不能为空")
    private List<Long> fileIdList;
}
