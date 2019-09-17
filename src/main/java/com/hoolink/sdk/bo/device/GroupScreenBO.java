package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author wangdong
 */
@Data
public class GroupScreenBO implements Serializable {
    private static final long serialVersionUID = 8965209387828533151L;

    private Long id;

    private Long projectId;

    private String groupName;

    private String description;

    private Integer deviceSize;

    private List<ScreenDeviceBO> managers;
}
