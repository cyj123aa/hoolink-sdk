package com.hoolink.sdk.bo.ability;

import lombok.Data;

import java.io.Serializable;

@Data
public class FaceSetBO implements Serializable {
    private String faceSetName;

    private Byte faceSetType;

    private Long projectId;
}