package com.hoolink.sdk.bo.omc;

import java.util.List;
import lombok.Data;

/**
 * @author chenyuejun
 */
@Data
public class OmcSengdMsgToMqBO {

    private List<Long> useIds;

    private Long projectId;

    private Long workId;

    private String workType;

    private String orderStatus;



}
