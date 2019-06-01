package com.hoolink.sdk.bo.device.inspection;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhangxin
 * @date 2019/6/1
 */
@Data
public class RankingInspectionBO implements Serializable {

    private static final long serialVersionUID = 4681301560129254897L;

    /*** 名称 */
    private String name;
    /*** 数量 */
    private Integer count;
}
