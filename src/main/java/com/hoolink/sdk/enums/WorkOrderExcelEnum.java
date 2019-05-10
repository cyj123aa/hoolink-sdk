package com.hoolink.sdk.enums;

/**
 * @author zhangxin
 * @date 2018/7/12
 */
public enum  WorkOrderExcelEnum {

    /**
     * 所属项目
     */
    PROJECT("所属项目", 24),
    CODE("所属编号", 19),
    LEVEL("级别", 6),
    TYPE("工单类型", 21),
    CONTENT("工单内容", 63),
    DEVICE("关联设备", 25),
    DESIGNATED("指派人", 8),
    DEADLINE("截止时间", 18),
    STATUS("工单状态", 9),
    ;

    /**
     * 标题
     */
    private String title;
    /**
     * 列宽，如果是默认值，给个null
     */
    private Integer columnWidth;

    WorkOrderExcelEnum(String title, Integer columnWidth) {
        this.title = title;
        this.columnWidth = columnWidth;
    }

    public String getTitle() {
        return title;
    }

    public Integer getColumnWidth() {
        return columnWidth;
    }
}
