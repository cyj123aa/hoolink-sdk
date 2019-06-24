package com.hoolink.sdk.bo.device;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-14 18:33
 * @Description
 */
@Data
public class DmxMediaListBO implements Serializable {
    private List<DmxMediaBO> mediaList;
    private List<DmxMediaBO> selMediaList;
}
