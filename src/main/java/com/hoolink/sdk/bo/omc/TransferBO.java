package com.hoolink.sdk.bo.omc;

import lombok.Data;

/**
 * @author chenyuejun
 */
@Data
public class TransferBO  extends OperateBO{

    /**
     * 转派人ID
     */
    private Long transferPeopleId;

    /**
     * 转派人Name
     */
    private String transferPeopleName;
}
