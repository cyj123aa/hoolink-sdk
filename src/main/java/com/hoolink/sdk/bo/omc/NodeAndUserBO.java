package com.hoolink.sdk.bo.omc;

import java.util.List;
import lombok.Data;

/**
 * @author Administrator
 */
@Data
public class NodeAndUserBO {

    /**
     * 节点id
     */
   private String  value;
    /**
     * 节点名字
     */
    private String  label;

    private List<UserBO> children;

    private String  type;
}
