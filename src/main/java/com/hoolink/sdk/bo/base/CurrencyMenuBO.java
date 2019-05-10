package com.hoolink.sdk.bo.base;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author XuBaofeng.
 * @date 2019-04-29 10:47.
 * <p>
 * description:
 */
@Data
public class CurrencyMenuBO implements Serializable {
    private static final long serialVersionUID = 9209731042717014324L;

    private String title;

    private List<ProjectMenuTreeBO> children;
}
