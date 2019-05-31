package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhangxin
 * @date 2019/5/30
 */
@Data
public class SearchPoleBO implements Serializable {

    private static final long serialVersionUID = 5807233015953009984L;

    /*** 项目ID */
    private Long projectId;
    /*** 灯杆ID集合 */
    private List<Long> ids;
}
