package com.hoolink.sdk.bo.nb;

import lombok.Data;

/**
 * @author chenzhixiong
 * @date 2019/4/10 12:00
 */
@Data
public class NbTokenBackBO {
    private String accessToken;
    private String tokenType;
    private String refreshToken;
    private Integer expiresIn;
    private String scope;

}
