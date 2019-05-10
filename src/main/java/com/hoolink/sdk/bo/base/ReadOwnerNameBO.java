package com.hoolink.sdk.bo.base;

import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ReadOwnerNameBO {
    /*** 客户号 */
    @NotNull(message = "客户号不能为空")
    private String customerNo;

    private String ownerName;
}
