package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;

/**
 * @author XuBaofeng.
 * @date 2019-05-14 9:12.
 * <p>
 * description:
 */
@Data
public class CountGroupBO implements Serializable {
    private static final long serialVersionUID = 6850514954502525023L;

    /*** 分组ID */
    private Long id;

    /*** 总数 */
    private Integer deviceSize;
}
