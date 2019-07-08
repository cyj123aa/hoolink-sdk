package com.hoolink.sdk.bo.base;

import java.util.List;
import lombok.Data;

/**
 * @author chenyuejun
 */
@Data
public class ProjectTitleBO {
private Long projectId;
private  String title;
private List<String>  children;
}
