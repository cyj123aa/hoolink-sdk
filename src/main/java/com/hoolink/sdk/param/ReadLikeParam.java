package com.hoolink.sdk.param;

/**
 * @author zhao_aken
 * Created by zhao_aken on 2017/11/27.
 */
public class ReadLikeParam extends PageParam {

    private String searchValue;

    public String getSearchValue() {
        return searchValue;
    }

    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
    }

    @Override
    public String toString() {
        return "ReadLikeParam{" +
                "searchValue='" + searchValue + '\'' +
                '}';
    }
}




