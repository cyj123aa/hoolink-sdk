package com.hoolink.sdk.bo.omc;

import java.util.List;
import lombok.Data;

/**
 * @author chenyuejun
 */
@Data
public class WorkDeviceShittleBO {
  private   List<DeviceBO> deviceBOS;

  private  Long projectId;
}
