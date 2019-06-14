package com.hoolink.sdk.bo.omc;

import java.util.List;
import lombok.Data;

/**
 * @author chenyuejun
 */
@Data
public class SortDictionaryBO {
  private   List<DictionaryBO> dictionaryBOS;

  private Long typeId;
}
