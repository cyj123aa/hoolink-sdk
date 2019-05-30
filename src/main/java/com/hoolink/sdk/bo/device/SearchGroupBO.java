package com.hoolink.sdk.bo.device;

import com.hoolink.sdk.bo.rpc.PageParamBO;
import lombok.Data;

import java.io.Serializable;

/**
 * @author XuBaofeng.
 * @date 2019-05-13 19:20.
 * <p>
 * description:
 */
@Data
public class SearchGroupBO extends PageParamBO implements Serializable {
    private static final long serialVersionUID = 8680655228284069202L;

    private Long projectId;

    private Long groupId;

    private String groupName;
}
