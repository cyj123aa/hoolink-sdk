package com.hoolink.sdk.enums;
/**
 * @author lixiaoran on 2018-09-12.
 * @description: 巡检相关表格下载的内容长度
 */
public enum PatrolResHistoryExcelEnum {
    /**
     * 巡检时间，24个字符长度
     */
    TIME("巡检时间", Integer.valueOf(24)),
    /**
     * 巡检灯杆,21个字符长度
     */
    PATROL_POLE("巡检灯杆", Integer.valueOf(21)),
    /**
     * 巡检人员,24个字符长度
     */
    PATROL_USER("巡检人员", Integer.valueOf(24)),
    /**
     * 巡检设备,21个字符长度
     */
    PATROL_DEVICE("巡检设备", Integer.valueOf(21));

    private String title;
    private Integer columnWidth;

    private PatrolResHistoryExcelEnum(String title, Integer columnWidth) {
        this.title = title;
        this.columnWidth = columnWidth;
    }

    public String getTitle(){
       return this.title;
    }

    public Integer getColumnWidth(){
        return this.columnWidth;
    }
}
