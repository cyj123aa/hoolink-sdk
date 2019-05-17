package com.hoolink.sdk.bo.factory;


/**
 * @author chenyuejun 这个枚举类，
 */

public enum EventEnum {

    /**
     * 区域入侵事件
     */
    AreaInvadeEvent(1L, "区域入侵", "factory_area_invade_event", 3L),

    /**
     * 车辆进厂事件
     */
    CarEventIn(2L, "车辆进厂", "factory_car_event", 1L),
    /**
     * 车辆出厂事件
     */
    CarEventOut(3L, "车辆出厂", "factory_car_event", 1L),
    /**
     * 巡检事件
     */
    Inspection(4L, "巡检事件", "factory_patrol_event", 1L),
    /**
     * 进厂事件
     */
    FactoryIn(5L, "员工进厂", "factory_employee_visitor_event", 1L),
    /**
     * 出厂事件
     */
    FactoryOut(6L, "员工出厂", "factory_employee_visitor_event", 1L),
    /**
     * 进楼事件
     */
    FloorIn(7L, "员工进楼", "factory_employee_visitor_event", 1L),
    /**
     * 出楼事件
     */
    FloorOut(8L, "员工出楼", "factory_employee_visitor_event", 1L),
    /**
     * 员工通道事件（整体）
     */
    EmployeeChannelEvent(9L, "员工通道", "factory_employee_channel_event", 1L),

    /**
     * 上面是摄像头可以绑定的事件务必和 工厂项目数据库 event_basis 事件基础表 保持一致
     10001之后的是，存在事件，不存在数据对应，是需要页面展示的事件
     */
    /**
     * 非本区域入侵
     */
    NotAreaInvadeEvent(10001L, "非本区域入侵", "factory_nonlocal_person_event", 3L),

    /**
     * 访客到访楼宇
     */
    VisitorFloorEvent(10002L, "访客到访楼宇", "factory_employee_visitor_event", 1L),
    /**
     * 访客车辆到访
     */
    CarVisitorEvent(10003L, "访客车辆到访", "factory_car_event", 1L),
    /**
     * 员工通道事件（个人）
     */
    EmployeeChannelEventByOne(10004L, "员工通道", "factory_employee_visitor_event", 1L),

    /**
     * 漏检事件
     */
    MissInspection(10005L, "漏检", "factory_patrol_event", 2L),

    /**
     * 气体监测事件
     */
    FactoryGasEvent(10006L, "气体监测", "factory_gas_event", 3L),
    /**
     * 水质监测事件
     */
    FactoryWaterEvent(10007L, "水质监测", "factory_water_event", 2L),
    /**
     * 环境监测事件
     */
    FactoryEnvironmentEvent(10008L, "环境监测", "factory_environment_event", 2L),
    /**
     * 土壤监测事件
     */
    FactorySoilEvent(10009L, "土壤监测", "factory_soil_event", 2L),

    /**
     * 访客离开楼宇
     */
    VisitorFloorEventOut(10010L, "访客离开楼宇", "factory_employee_visitor_event", 1L),
    /**
     * 访客车辆离开
     */
    CarVisitorEventOut(10011L, "访客车辆离开", "factory_car_event", 1L),
    /**
     * 访客到访工厂
     */
    VisitorFactoryEvent(10012L, "访客进厂", "factory_employee_visitor_event", 1L),
    /**
     * 访客离开工厂
     */
    VisitorFactoryEventOut(10013L, "访客出厂", "factory_employee_visitor_event", 1L),
    /**
     * 未知车辆离开
     */
    UnknowCarVisitorEventOut(10014L, "未知车辆离开", "factory_car_event", 2L),
    /**
     * 未知车辆进入
     */
    UnknowCarVisitorEventIn(10015L, "未知车辆进入", "factory_car_event", 2L),

    /**
     * 气体监测事件恢复
     */
    FactoryGasRestoreEvent(10016L, "气体监测恢复正常", "factory_gas_event", 1L),
    /**
     * 水质监测事件恢复
     */
    FactoryWaterRestoreEvent(10017L, "水质监测恢复正常", "factory_water_event", 1L),
    /**
     * 环境监测事件恢复
     */
    FactoryEnvironmentRestoreEvent(10018L, "环境监测恢复正常", "factory_environment_event", 1L),
    /**
     * 土壤监测事件恢复
     */
    FactorySoilRestoreEvent(10019L, "土壤监测恢复正常", "factory_soil_event", 1L),
    /**
     * 异常进厂事件--数据汇总时用
     */
    FactoryLateEvent(20005L, "异常进厂", "factory_late_event", 3L),
    /**
     * 异常出厂事件--数据汇总时用
     */
    FactoryExceEvent(20006L, "异常出厂", "factory_Exce_event", 3L),
    ;


    public Long key;
    public String name;
    public String tableName;
    public Long level;

    EventEnum(Long key, String name, String tableName, Long level) {
        this.key = key;
        this.name = name;
        this.tableName = tableName;
        this.level = level;
    }

    public static Long getLevel(Long key) {
        for (EventEnum eventeEnum : EventEnum.values()) {
            if (eventeEnum.key.equals(key)) {
                return eventeEnum.level;
            }
        }
        return null;
    }

    public static String getName(Long key) {
        for (EventEnum eventeEnum : EventEnum.values()) {
            if (eventeEnum.key.equals(key)) {
                return eventeEnum.name;
            }
        }
        return null;
    }

    public static String getTableName(Long key) {
        for (EventEnum eventeEnum : EventEnum.values()) {
            if (eventeEnum.key.equals(key)) {
                return eventeEnum.tableName;
            }
        }
        return null;
    }

    public static EventEnum getEnum(Long key) {
        for (EventEnum eventeEnum : EventEnum.values()) {
            if (eventeEnum.key.equals(key)) {
                return eventeEnum;
            }
        }
        return null;
    }

}
