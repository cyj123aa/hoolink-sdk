package com.hoolink.sdk.bo.analysis;


import lombok.Data;

@Data
public class HistoryBO  {
    /**
     * <pre>
     * id
     * 表字段 : analysis_history.id
     * </pre>
     */
    private Integer id;

    /**
     * <pre>
     * obs的id
     * 表字段 : analysis_history.obs_id
     * </pre>
     */
    private Long obsId;

    /**
     * <pre>
     * 翻译过来的string
     * 表字段 : analysis_history.file_str
     * </pre>
     */
    private String fileStr;


    /**
     * <pre>
     * obs  url
     * 表字段 : analysis_history.obs_url
     * </pre>
     */
    private String obsUrl;




}