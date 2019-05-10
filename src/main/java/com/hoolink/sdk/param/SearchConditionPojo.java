package com.hoolink.sdk.param;

/**
 * @author zhangx
 * @date 2018/7/4.
 * 用于查询条件，key/value
 */
public class SearchConditionPojo<K, V> {

    private K key;
    private V value;

    public SearchConditionPojo() {
    }

    public SearchConditionPojo(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
