package com.hoolink.sdk.bo.command.camera;

/**
 * @author chenzhixiong
 * @date 2018/12/29 14:02
 */
public class HlsCameraBO {
    private Long projectId;
    private Integer pageSize;
    private Integer pageNo;

    private String searchCode;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public String getSearchCode() {
        return searchCode;
    }

    public void setSearchCode(String searchCode) {
        this.searchCode = searchCode;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }



    @Override
    public String toString() {
        return "HlsCameraBO{" +
                "projectId=" + projectId +
                ", pageSize=" + pageSize +
                ", pageNo=" + pageNo +
                '}';
    }
}
