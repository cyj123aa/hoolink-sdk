package com.hoolink.sdk.bo.device.inspection;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.hoolink.sdk.param.PageParam;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author zhangxin
 * @date 2019/6/1
 */
@Data
public class SearchInspectionHistoryBO extends PageParam implements Serializable {

    private static final long serialVersionUID = -7765207394681012140L;

    /*** 项目ID */
    private Long projectId;

    /*** 开始时间 */
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate startDate;

    /*** 结束时间 */
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate endDate;

    /*** 设备名称，模糊查询条件 */
    private String fuzzyDeviceName;

    /*** 巡检人员名称，模糊查询条件 */
    private String fuzzyInspectorName;
    
    /*** 查询数量 */
    private Integer limitNumber;
}
