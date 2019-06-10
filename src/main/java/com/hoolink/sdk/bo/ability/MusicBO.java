package com.hoolink.sdk.bo.ability;

import lombok.Data;

/**
 * @ClassName MusicVO
 * @Author huyaxi
 * @DATE 2019/5/13 16:29
 */
@Data
public class MusicBO {

    private Long id;

    private String musicName;

    private Long taskMusicId;

    private String taskMusicName;

    private Long projectId;

    private Long creator;

    private Long created;

    private String musicUrl;
}
