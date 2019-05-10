package com.hoolink.sdk.bo.base;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author XuBaofeng.
 * @date 2019-04-18 14:12.
 * <p>
 * description:
 */
@Data
public class UpdateCustomerAuthBO implements Serializable {
    private static final long serialVersionUID = -1001665324252283680L;
    private Long ownerId;
    private List<Long> menuIds;
}
