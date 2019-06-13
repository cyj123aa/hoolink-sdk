package com.hoolink.sdk.bo.omc;

import lombok.Data;

/**
 * @author chenyuejun
 */
@Data
public class DictionaryBO {
    /**
     * <pre>
     * 主键
     * 表字段 : dictionary.id
     * </pre>
     */
    private Long id;

    /**
     * <pre>
     * 键
     * 表字段 : dictionary.key_set
     * </pre>
     */
    private Long keySet;

    /**
     * <pre>
     * 值
     * 表字段 : dictionary.value_set
     * </pre>
     */
    private String valueSet;

    /**
     * <pre>
     * 是否缺省
     * 表字段 : dictionary.backup
     * </pre>
     */
    private Boolean backup;

    /**
     * <pre>
     * 是否启动
     * 表字段 : dictionary.valid
     * </pre>
     */
    private Boolean valid;

    /**
     * <pre>
     * 字典类型
     * 表字段 : dictionary.type_id
     * </pre>
     */
    private Long typeId;
    /**
     * <pre>
     *
     * 表字段 : dictionary.order_id
     * </pre>
     */
    private Long orderId;

}
