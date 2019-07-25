package com.hoolink.sdk.bo.omc;


import java.util.List;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
 * @author chenyuejun
 */
@Data
public class NodeBO {
    private String id;

    /**
     * 节点样式
     */
    private String shape;
    /**
     * 节点大小
     */
    private String size;
    /**
     * 节点背景颜色
     */
    private String color;
    /**
     * 节点名称
     */
    @Length(min = 1, max = 10, message = "节点名字长度为1到10")
    private String label;
    /**
     * 节点x坐标
     */
    private Integer x;
    /**
     * 节点y坐标
     */
    private Integer y;
    /**
     * 节点id
     */
    private String nodeId;
    /**
     * 连线颜色
     */
    private Integer index;

    private List<UserNameBO> userNameBOS;

    /**
     * 节点下关联用户
     */
    private String userName;
}
