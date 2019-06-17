package com.hoolink.sdk.bo.omc;

import java.util.List;
import lombok.Data;

/**
 * @author chenyuejun
 */
@Data
public class ReceiptBO {
    private Long id;
    /**
     * <pre>
     *
     * 表字段 : middle_receipt_work.work_id
     * </pre>
     */
    private Long workId;

    /**
     * <pre>
     *
     * 表字段 : middle_receipt_work.description
     * </pre>
     */
    private String description;

    /**
     * <pre>
     * 添加人
     * 表字段 : middle_receipt_work.user_id
     * </pre>
     */
    private Long userId;
    private String userName;
    /**
     * <pre>
     * 创建时间
     * 表字段 : middle_receipt_work.created
     * </pre>
     */
    private Long created;
    private List<String> obsIdsUrl;
    private List<Long> obsIds;
    private List<ReceiptDeviceBO> receiptDeviceBOS;
}
