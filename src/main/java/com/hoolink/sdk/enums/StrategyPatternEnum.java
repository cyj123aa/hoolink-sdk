package com.hoolink.sdk.enums;

import lombok.Getter;

import java.util.Objects;

/**
 * 策略模式
 *
 * @author zhangxin
 * @date 2019/5/16
 */
@Getter
public enum StrategyPatternEnum {

    /*** 每天 */
    EVERY_DAY((byte) 1, "每天"),

    /*** 自定义，选择周几（周一到周日） */
    CUSTOM((byte) 2, "自定义"),

    /*** 特殊日期 */
    SPECIAL_DATE((byte) 3, "特殊日期"),
    ;

    private Byte value;
    private String name;

    StrategyPatternEnum(Byte value, String name) {
        this.value = value;
        this.name = name;
    }

    public static StrategyPatternEnum getByValue(Byte value) {
        for (StrategyPatternEnum pattern : StrategyPatternEnum.values()) {
            if (Objects.equals(value, pattern.value)) {
                return pattern;
            }
        }
        return null;
    }
}
