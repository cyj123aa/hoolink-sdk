package com.hoolink.sdk.enums;

import java.util.Objects;

/**
 * @author ${zht}
 * @date 2018/5/25.
 */
public enum WorkOrderLevel {

    /**
     * 特急
     */
    SUPER_LEVEL((short)3, "特急"),
    /**
     * 加急
     */
    URGENT_LEVEL((short)2, "加急"),
    /**
     * 正常
     */
    ORDINARY_LEVEL((short)1, "正常"),
    ;

    private final Short key;
    private final String name;

    WorkOrderLevel(Short key, String name) {
        this.key = key;
        this.name = name;
    }

    public Short getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public static WorkOrderLevel getWorkOrderLevelByKey(String key) {
        for (WorkOrderLevel level : WorkOrderLevel.values()) {
            if (Objects.equals(level.getKey(), key)) {
                return level;
            }
        }
        return null;
    }

    public static String getWorkOrderLevelNameByKey(Short key) {
        for (WorkOrderLevel level : WorkOrderLevel.values()) {
            if (Objects.equals(level.getKey(), key)) {
                return level.getName();
            }
        }
        return null;
    }
}
