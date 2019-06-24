package com.hoolink.sdk.bo.omc;

import java.util.List;
import lombok.Data;

/**
 * @author chenyuejun
 */
@Data
public class AddReceiptBO extends OperateBO {
 private    List<ReceiptDeviceBO> receiptDeviceBOS;
}
