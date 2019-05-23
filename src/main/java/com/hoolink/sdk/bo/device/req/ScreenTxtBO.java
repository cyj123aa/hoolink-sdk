package com.hoolink.sdk.bo.device.req;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wangdong
 */
@Data
public class ScreenTxtBO implements Serializable {
    private static final long serialVersionUID = -2988282093535337311L;
    
    /*** 显示屏文本信息表主键ID */
    private Long id;

    /*** 字体大小 */
    private Short sizes;

    /*** 字符间距 */
    private Short spacing;

    /*** 排列方式：1：横向排列 2：纵向排列 */
    private Short rankMode;

    /*** 字体颜色 */
    private Integer characterColor;

    /*** 背景颜色 */
    private Integer backColor;

    /*** 内容 */
    private String txtContext;

    /*** 文件名称，使用context字段的前10个名字作为txt文件的显示名称 */
    private String txtName;

    /*** 1-5（1：黑体，2：楷体，3：宋体，4：仿宋，5：隶书）  */
    private Short txtStyle;


}
