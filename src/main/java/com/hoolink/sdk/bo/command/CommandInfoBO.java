package com.hoolink.sdk.bo.command;

import com.hoolink.sdk.enums.SponOperateTpye;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;

/**
 * @author chenzhixiong
 * @date 2019/3/15 15:51
 */
@Data
public class CommandInfoBO implements Serializable {

    /**
     * 操作类型
     *
     * 0：延时操作；1：对讲操作；2：监听操作；3：广播操作；4：指令操作
     */
    private SponOperateTpye type;
    /**
     * 广播文件列表
     *
     */
    @NotEmpty(message = "files不能为空")
    private List<String> files;

    /**
     * 接收广播终端列表
     */
    @NotEmpty(message = "ids不能为空")
    private List<String> ids;
    /**
     * 持续时间
     */
    private Integer time;

    private String vol;
}
