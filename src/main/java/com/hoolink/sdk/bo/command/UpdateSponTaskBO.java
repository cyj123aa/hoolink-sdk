package com.hoolink.sdk.bo.command;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author chenzhixiong
 * @date 2019/3/14 11:30
 */
@Data
public class UpdateSponTaskBO {
    /**
     * 任务id
     */
    @NotBlank(message = "taskId不能为空")
    private String taskId;

    /**
     * 任务名称
     */
    @NotBlank(message = "taskname不能为空")
    private String taskname;
    /**
     * 任务是否启用（0:启用， 1:禁用）
     */
    @NotBlank(message = "isdisable不能为空")
    private String isdisable;
    /**
     * 任务优先级（0-15）
     */
    @NotBlank(message = "level不能为空")
    private String level;
    /**
     * 创建任务用户
     */
    @NotBlank(message = "creator不能为空")
    private String creator;
    /**
     * 操作列表
     *
     * commands：操作任务（多个触发器之间用“|”分隔， 单个触发器的字段用“*”分隔）
     如：文件广播|3*0*0*0*23234.mp3<*11<11<*0*0*0**0|  |3*0*0*0*23234.mp3<一曲相思.mp3<侯旭 - 逃.mp3<*3<11<3<11<*0*0*0**0|   终端广播|3*0*0*0**11<11<*0*0*1**0
     * 第一个字段为操作类型（0：延时操作；1：对讲操作；2：监听操作；3：广播操作；4：指令操作）
     * a) 延时操作：0*持续时间
     * b) 对讲操作：1*持续时间*发起终端ID*接收终端ID*发起终端面板号*接收终端面板号
     * c)监听操作：2*持续时间*发起终端ID*接收终端ID*发起终端面板号*接收终端面板号
     * d) 广播操作：3*持续时间*发起终端ID*数据流类型*文件列表*接收广播终端列表*音量微调*同步强切*音源类型*语音合成文本*是否随机播放
     * （如3*0*0*0*test1.wav<test2.wav*1<2*0*0 表示向终端1 和终端2 发送test1.wav 和test2.wav 文件广播） （注意：发起终端ID 为0 时，表示为文件广播； 持续时间为0
     * 时，表示持续时间为播放文件总时间： test1.wav 和 test2.wav 时间之和， 持续时间大于0 时， 不管文件是否播放完成， 都会根据持续时间强行停止；请在文件名前补齐“\\” 符号； +文件列表可为播放列表ID，
     * 如test.list 音源类型：（0：文件；1：终端；2：声卡；3：文本） 是否随机播放（0： 顺序播放 1： 随机播放） ）
     */
    private CommandInfoBO commands;
    /**
     * triggers: 触发器列表（多个触发器之间用“|”分隔， 单个触发器的字段用“*”分隔） 如： |0*2017-10-16*2027-10-16*16-35-30*0*|1*0*1<2<*1|
     * 第一个字段为触发器类型（0：定时任务；1：事件任务）【详细字段描述请参照2.9B 查询任务信息】 a) 定时任务格式：0*开始日期*结束日期*开始执行时间*任务周期类型*星期参数 (如：
     * 0*2017-10-16*2027-10-16*16-35-30*0*表示2017-10-16 至2027-10-16，每天16：35：30 执行的定时任务) (注意： 开始执行时间的传入格式为16-35-30，表示16：35：30)
     * b) 事件任务格式： 1*事件类型*触发终端列表*触发端口 (如： 1*0*1<2<*1 表示终端1，2 的端口1 触发的报警事件任务)
     */
    @NotBlank(message = "triggers不能为空")
    private String triggers;
}
