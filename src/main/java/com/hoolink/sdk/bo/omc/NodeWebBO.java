package com.hoolink.sdk.bo.omc;

import java.util.List;
import lombok.Data;

/**
 * @author chenyuejun
 */
@Data
public class NodeWebBO {

  private List<NodeBO> nodes;

    private List<EdgesBO> edges;

}
