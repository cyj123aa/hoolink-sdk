package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author XuBaofeng.
 * @date 2019-05-13 19:00.
 * <p>
 * description:
 */
@Data
public class GroupBO implements Serializable {
    private static final long serialVersionUID = 8965209387828533151L;

    private Long id;

    private Long projectId;

    private String groupName;

    private String description;

    private Integer deviceSize;

    private List<DeviceManagerBO> managers;
}
