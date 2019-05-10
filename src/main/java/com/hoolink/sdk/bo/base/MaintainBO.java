package com.hoolink.sdk.bo.base;

import lombok.Data;

/**
 * @author cyj
 */
@Data
public class MaintainBO {
 private Long id;
    private String projectName;
    private String projectNo;
    private String customerNo;
    private Long created;
    private Long deviceSubTypeId;
    private Long maintainTime;
}
