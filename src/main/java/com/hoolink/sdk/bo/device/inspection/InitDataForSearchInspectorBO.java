package com.hoolink.sdk.bo.device.inspection;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhangxin
 * @date 2019/7/11
 */
@Data
public class InitDataForSearchInspectorBO implements Serializable {

    private static final long serialVersionUID = 6412067628285364706L;

    /*** 编号 */
    private List<String> numbers;
    /*** 姓名 */
    private List<String> names;
    /*** 手机号 */
    private List<String> mobiles;
}
