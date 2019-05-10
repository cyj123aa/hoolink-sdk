package com.hoolink.sdk.bo.ability;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName PartEtag
 * @Author huyaxi
 * @DATE 2019/4/28 16:24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PartEtag {
    private String etag;
    private Integer partNumber;
}
