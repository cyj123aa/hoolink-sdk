package com.hoolink.sdk.enums;

/**
 * 待办列表页按钮及图片类型
 * @Author : LiYuSheng
 * @Date : Created on 19:19 2018/6/7 0007.
 */
public enum TodoListPageMenuEnum {
    /**
     * 查看按钮
     */
    READ("查看按钮","read_view"),
    /**
     * 审批按钮
     */
    EXAMINATION_APPROVAL("审批按钮","examination_approval"),
    /**
     * 添加回执
     */
    ADD_RECEIPT("添加回执","add_receipt"),
    /**
     * 完成按钮
     */
    COMPLETE("完成按钮","complete"),
    ;

    private String menuDescribe;
    private String menuDescribeCode;

    TodoListPageMenuEnum(String menuDescribe, String menuDescribeCode) {
        this.menuDescribe = menuDescribe;
        this.menuDescribeCode = menuDescribeCode;
    }

    public String getMenuDescribe() {
        return menuDescribe;
    }

    public String getMenuDescribeCode() {
        return menuDescribeCode;
    }
}
