package com.hoolink.sdk.bo.base;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/4/17 10:59
 */
@Data
public class ProjectMenuReturnBO implements Serializable {
    private static final long serialVersionUID = 467515325489798021L;

    /*** 场景下所有的菜单 */
    private ProjectMenuTreeBO allMenuOfScene;

    /*** 场景下已被选择的菜单 */
    private ProjectMenuTreeBO beSelectMenuOfScene;


}
