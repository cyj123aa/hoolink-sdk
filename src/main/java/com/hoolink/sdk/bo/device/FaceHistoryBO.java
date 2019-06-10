package com.hoolink.sdk.bo.device;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @ClassName FaceHistoryBO
 * @Author huyaxi
 * @DATE 2019/5/31 9:55
 */
@Data
public class FaceHistoryBO implements Serializable {

    private static final long serialVersionUID = -7869306654144656328L;

    private Long projectId;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime faceDate;
    private Long bigObsId;
    private Long smallObsId;
    private String faceLabelId;
    private Long deviceId;
}
