package com.hoolink.sdk.bo.device;

import java.io.Serializable;
import java.util.List;

public class BroadcastGroupBO implements Serializable {
    /**
     * 广播组id
     * 表字段 : broadcast_group.id
     */
    private Long id;

    /**
     * 广播组名称 
     * 表字段 : broadcast_group.group_name
     */
    private String groupName;

    /**
     * 关联麦克风id
     * 表字段 : broadcast_group.device_id
     */
    private Long deviceId;

    /**
     * 广播组描述
     * 表字段 : broadcast_group.description
     */
    private String description;

    /**
     * 是否启用(1:启用, 0:禁用)
     * 表字段 : broadcast_group.enabled
     */
    private Boolean enabled;

    /**
     * 更新者
     * 表字段 : broadcast_group.updator
     */
    private Long updator;

    /**
     * 更新时间
     * 表字段 : broadcast_group.updated
     */
    private Long updated;

    /**
     * 创建者
     * 表字段 : broadcast_group.creator
     */
    private Long creator;

    /**
     * 创建时间
     * 表字段 : broadcast_group.created
     */
    private Long created;

    private Boolean runStatus;

    private Long deviceSubTypeId;

    private Integer deviceNum;

    private Long projectId;

    private List<Long> longList;

    private List<GroupBO> groupBOList;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table broadcast_group
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取：广播组id
     * 表字段：broadcast_group.id
     *
     * @return broadcast_group.id：广播组id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置：广播组id
     * 表字段：broadcast_group.id
     *
     * @param id
     *            broadcast_group.id：广播组id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取：广播组名称 
     * 表字段：broadcast_group.group_name
     *
     * @return broadcast_group.group_name：广播组名称 
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * 设置：广播组名称 
     * 表字段：broadcast_group.group_name
     *
     * @param groupName
     *            broadcast_group.group_name：广播组名称 
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    /**
     * 获取：关联麦克风id
     * 表字段：broadcast_group.device_id
     *
     * @return broadcast_group.device_id：关联麦克风id
     */
    public Long getDeviceId() {
        return deviceId;
    }

    /**
     * 设置：关联麦克风id
     * 表字段：broadcast_group.device_id
     *
     * @param deviceId
     *            broadcast_group.device_id：关联麦克风id
     */
    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * 获取：广播组描述
     * 表字段：broadcast_group.description
     *
     * @return broadcast_group.description：广播组描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置：广播组描述
     * 表字段：broadcast_group.description
     *
     * @param description
     *            broadcast_group.description：广播组描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 获取：是否启用(1:启用, 0:禁用)
     * 表字段：broadcast_group.runStatus
     *
     * @return broadcast_group.runStatus：是否启用(1:启用, 0:禁用)
     */
    public Boolean getRunStatus() {
        return runStatus;
    }

    /**
     * 设置：是否启用(1:启用, 0:禁用)
     * 表字段：broadcast_group.runStatus
     *
     * @param runStatus
     * broadcast_group.runStatus：是否启用(1:启用, 0:禁用)
     */
    public void setRunStatus(Boolean runStatus) {
        this.runStatus = runStatus;
    }

    /**
     * 获取：项目id
     * 表字段：broadcast_group.project_id
     *
     * @return broadcast_group.project_id：项目id
     */
    public Long getProjectId() {
        return projectId;
    }

    /**
     * 设置：项目id
     * 表字段：broadcast_group.project_id
     *
     * @param projectId
     *            broadcast_group.project_id：项目id
     */
    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Long getUpdator() {
        return updator;
    }

    public void setUpdator(Long updator) {
        this.updator = updator;
    }

    public Long getUpdated() {
        return updated;
    }

    public void setUpdated(Long updated) {
        this.updated = updated;
    }

    public Long getCreator() {
        return creator;
    }

    public void setCreator(Long creator) {
        this.creator = creator;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public List<Long> getLongList() {
        return longList;
    }

    public void setLongList(List<Long> longList) {
        this.longList = longList;
    }

    public List<GroupBO> getGroupBOList() {
        return groupBOList;
    }

    public void setGroupBOList(List<GroupBO> groupBOList) {
        this.groupBOList = groupBOList;
    }

    public Long getDeviceSubTypeId() {
        return deviceSubTypeId;
    }

    public void setDeviceSubTypeId(Long deviceSubTypeId) {
        this.deviceSubTypeId = deviceSubTypeId;
    }

    public Integer getDeviceNum() {
        return deviceNum;
    }

    public void setDeviceNum(Integer deviceNum) {
        this.deviceNum = deviceNum;
    }
}