package com.hoolink.sdk.bo.ability;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName SmsBO
 * @Author huyaxi
 * @DATE 2019/4/29 10:19
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SmsBO {
    private String phone;
    private String content;
}
