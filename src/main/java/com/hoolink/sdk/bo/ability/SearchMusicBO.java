package com.hoolink.sdk.bo.ability;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @ClassName SearchMusicVO
 * @Author huyaxi
 * @DATE 2019/5/22 19:50
 */
@Data
public class SearchMusicBO {
    @NotNull(message = "项目ID不能为空")
    private Long projectId;
    private String musicName;
}
