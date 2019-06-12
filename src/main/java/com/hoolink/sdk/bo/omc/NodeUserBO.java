package com.hoolink.sdk.bo.omc;

import java.util.List;
import lombok.Data;

/**
 * @author chenyuejun
 */
@Data
public class NodeUserBO {


    private Long processId;

    private String nodeId;

    /**
     * 用户id集合
     */
    private List<UserNameBO> users;


}
