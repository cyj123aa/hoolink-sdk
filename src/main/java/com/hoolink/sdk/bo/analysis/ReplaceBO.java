package com.hoolink.sdk.bo.analysis;

import lombok.Data;

/**
 * @author chenyuejun
 * @descripption
 * @date 2019/8/27 &{TIME}
 */
@Data
public class ReplaceBO {
    /**
     * <pre>
     * 单词1
     * 表字段 : analysis_replace.word_one
     * </pre>
     */
    private String wordOne;

    /**
     * <pre>
     * 单词2 用于互相替换
     * 表字段 : analysis_replace.word_two
     * </pre>
     */
    private String wordTwo;
}
