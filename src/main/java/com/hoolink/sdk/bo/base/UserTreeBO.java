package com.hoolink.sdk.bo.base;

import java.io.Serializable;
import lombok.Data;

/**
 * @author chenyuejun.
 * @date 2019-05-21 15:11.
 * <p>
 * description:
 */
@Data
public class UserTreeBO implements Serializable {
    private static final long serialVersionUID = 6953613166445933023L;
    /*** 每个节点的唯一标识 */
    private Long key;
    /*** 展示节点 */
    private String title;
    /*** 值 */
    private Long value;
    /*** 人员类型 */
    private Long type;


}
