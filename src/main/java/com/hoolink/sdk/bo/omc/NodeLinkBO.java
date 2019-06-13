package com.hoolink.sdk.bo.omc;

import java.util.List;
import lombok.Data;

/**
 * @author Administrator
 */
@Data
public class NodeLinkBO {
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
    private String label;
    /**
     * 节点x坐标
     */
    private Long x;
    /**
     * 节点y坐标
     */
    private Long y;
    /**
     * 节点id
     */
    private String nodeId;
    /**
     * 连线颜色
     */
    private Long index;

    private List<UserNameBO> userNameBOS;

    /**
     * 节点下关联用户
     */
    private String userName;




    private List<NodeLinkBO> nextNode;



}
