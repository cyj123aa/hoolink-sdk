package com.hoolink.sdk.bo.datacenter;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-08-28 18:16
 * @Description
 */
@Data
public class DateNumBO  implements Serializable {

    private Long countNum;
    private LocalDate countDate;
}
