package com.hoolink.sdk.bo.base;

import java.util.List;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * 批量插入 插件
 * @author chenyuejun
 */
@Data
public class FileIdsBO {

    /**
     * 项目id   项目表的id
     */
    @NotNull(message = "项目id不能为空")
    private Long id;
    /**
     * <pre>
     * 附件id 集合
     * 表字段 : 存入中间表
     * </pre>
     */
    private List<Long> annexIds;
}
