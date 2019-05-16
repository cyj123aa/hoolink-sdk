package com.hoolink.sdk.bo.command.camera;

/**
 * @author chenzhixiong
 * @date 2018/12/29 14:02
 */
public class ReadCameraParamBO {
    private Long projectId;
    private Integer  pageSize;
    private Integer  pageNo;

    private String  searchCode;

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
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

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    @Override
    public String toString() {
        return "ReadCameraParamBO{" +
                "projectId=" + projectId +
                ", pageSize=" + pageSize +
                ", pageNo=" + pageNo +
                '}';
    }
}
