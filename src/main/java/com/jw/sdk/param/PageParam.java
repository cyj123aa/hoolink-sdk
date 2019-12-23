package com.jw.sdk.param;

import java.io.Serializable;

/**
 * @author zhao_aken
 * Created by zhao_aken on 2017/11/27.
 */
public class PageParam implements Serializable {
    private Integer pageNo;
    private Integer pageSize;

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "PageParam{" +
                "pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                '}';
    }
}
