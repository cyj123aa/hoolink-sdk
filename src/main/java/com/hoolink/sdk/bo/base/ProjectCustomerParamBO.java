package com.hoolink.sdk.bo.base;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author wangdong
 * @date 2019/4/26 9:47
 */
@Data
public class ProjectCustomerParamBO implements Serializable {
    private static final long serialVersionUID = 8284620790519025847L;

    /*** 客户号 */
    private List<String> customerNos;

    /*** 项目名称 */
    private String projectName;
}
