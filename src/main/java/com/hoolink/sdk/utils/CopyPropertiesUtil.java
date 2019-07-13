package com.hoolink.sdk.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.github.pagehelper.PageInfo;
import com.hoolink.sdk.bo.BackBO;
import com.hoolink.sdk.param.BaseParam;
import com.hoolink.sdk.vo.BackVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 对象属性拷贝工具类
 *
 * @author ${zht}
 * @date 2018/9/21
 */
@Slf4j
public class CopyPropertiesUtil {

    /**
     * List的copy
     *
     * @param list
     * @param clazz
     * @param <T>
     * @param <E>
     * @return
     */
    public static <T, E> List<E> copyList(List<T> list, Class<E> clazz) {
        if (CollectionUtils.isEmpty(list)) {
            return Collections.emptyList();
        }
        return JSON.parseArray(JSON.toJSONString(list), clazz);
    }

    /**
     * map的copy
     *
     * @param map
     * @param clazz
     * @param <T>
     * @param <V>
     * @return
     */
    public static <T, V> Map<Object, V> copyMap(Map<Object, T> map, Class<V> clazz) {
        Map<Object, V> hashMap = new HashMap<>(16);
        if (map != null && map.size() > 0) {
            map.forEach((key, value) -> {
                V v = JSONObject.parseObject(JSONObject.toJSONString(value), clazz);
                hashMap.put(key, v);
            });
        }
        return hashMap;
    }

    /**
     * 将源对象的属性copy到目标对象
     *
     * @param obj
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T copyBean(Object obj, Class<T> clazz) {
        String json = JSONObject.toJSONString(obj);
        return JSONObject.parseObject(json, clazz);
    }

    /**
     * 将多个源对象的属性copy到一个目标对象上
     * 实例: 将 demo1 && demo2 && demo3 三个对象的属性赋值到Demo.class
     * 其中:
     * 1. demo1拥有属性-值为: {name='demo1', password='demo1'}
     * 2. demo2拥有属性-值为: {name='demo2'}
     * 3. demo3拥有属性-值为: {password='demo3'}
     * 使用 Demo demo = copyBean(Demo.class, demo1, demo2, demo3) 得到组合后的结果
     * * 注意: 当数据源对象中有两个属性相同但值不同的情况时, 默认选择保留第一次出现该属性时的值
     * *  如: demo1 中的 name 属性值为 demo1, 儿 demo2 中有相同的属性 name 但是它的值为 demo1
     * *  此时会保留 demo1 中的 name 属性值而抛弃 demo2 中的 name 属性值, 即上述案例的结果为: Demo{name='demo1', password='demo1'}
     * *  所以在使用该方法进行属性copy时, 源数据对象数组传参的顺序应当谨慎考虑
     *
     * @param clazz
     * @param source
     * @param <T>
     * @return
     */
    @Deprecated
    public static <T> T copyBean(Class<T> clazz, Object... source) {
        if (ArrayUtil.isEmpty(source)) {
            // ===== 当数据源对象为空时, 直接返回null
            return null;
        }
        Map<String, Object> map = new HashMap<>(16);
        for (Object obj : source) {
            if (obj != null) {
                Field[] fields = obj.getClass().getDeclaredFields();
                for (Field field : fields) {
                    field.setAccessible(true);
                    try {
                        String key = field.getName();
                        Object value = field.get(obj);
                        if (StringUtils.isNotBlank(key) && value != null) {
                            // ----- 当 key 或 value 为null时, 不作操作, 所以出现在改 map 中的所有 key 必然有对应的 value 且 value 不为 null
                            if (map.containsKey(key)) {
                                // ----- 当已经存在时, 进入到这里, 说明出现了同一个属性出现多个值的情况, 默认保留第一次出现的值
                                log.warn("copyBean error Failure because of clash of attributes, key:{}, oldValue: {}, newValue{}", key, map.get(key), value);
                            } else {
                                // ----- 当该 key 在 map 中不存在时, 直接 put
                                map.put(key, value);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return JSONObject.parseObject(JSONObject.toJSONString(map), clazz);
    }

    /**
     * 封装pageInfo返回
     *
     * @param source
     * @param target
     * @param <S>    source
     * @param <T>    target
     * @return
     */
    public static <S, T> PageInfo<T> copyPageInfo(PageInfo<S> source, Class<T> target) {
        if (source == null) {
            return null;
        }
        List<S> dataList = source.getList();
        source.setList(null);
        PageInfo<T> resultData = copyBean(source, PageInfo.class);
        if (CollectionUtils.isNotEmpty(dataList)) {
            resultData.setList(copyList(dataList, target));
        }
        return resultData;
    }

    /**
     * 对前端过来的baseParam进行封装
     * 将前端传过来的参数中data由baseParam<VO>转换成baseParam<ProjectTitleBO>再传递给service
     *
     * @param source
     * @param destination
     * @return
     */
    public static <VO, BO> BaseParam<BO> assembleBaseParam(BaseParam<VO> source, Class<BO> destination) {
        BaseParam param;
        Object resultData;
        if (source == null) {
            // ===== 当前端传递的参数为null时, 直接返回null
            return null;
        }
        if (source.getData() == null) {
            // ===== 当前端传递的参数不为null但是data为null时, 直接返回txId
            param = new BaseParam<>();
        } else {
            // ===== 当前端传递的参数不为null且data不为null时, 根据具体情况返回baseParam
            Object sourceData = source.getData();
            if (sourceData instanceof List) {
                // ----- List: 则 List 中的泛型对应的对象 不能含有集合属性
                resultData = copyList((List<? extends Object>) sourceData, destination);
            } else if (sourceData instanceof Map) {
                // -----  Map: 则 Map  中value对应的泛型 不能为集合,为对象 不能含有集合属性
                resultData = copyMap((Map) sourceData, destination);
            } else {
                // ----- Bean: 则 Bean 中不能含有 集合属性
                resultData = copyBean(sourceData, destination);
            }
            // ===== 将转换成BO的data和txId组装成新的baseParam返回
            param = new BaseParam<>(resultData);
        }
        return param;
    }

    /**
     * 封装pageInfo返回
     *
     * @param source
     * @param clazz
     * @param <BO>
     * @param <VO>
     * @return
     */
    public static <BO, VO> BackVO<PageInfo<VO>> assembleBoToVoByPageInfo(BackBO<PageInfo<BO>> source, Class<VO> clazz) {
        BackVO<PageInfo<VO>> backVO;
        if (source == null) {
            return null;
        }
        PageInfo<BO> sourceData = source.getData();
        source.setData(null);
        backVO = copyBean(source, BackVO.class);
        if (sourceData != null) {
            List<BO> bos = sourceData.getList();
            sourceData.setList(null);
            PageInfo<VO> resultData = copyBean(sourceData, PageInfo.class);
            if (CollectionUtils.isNotEmpty(bos)) {
                List<VO> vos = copyList(bos, clazz);
                resultData.setList(vos);
            }
            backVO.setData(resultData);
        }
        return backVO;
    }

    /**
     * 对backBO到backVO进行简单封装 对外暴露接口的使用
     */
    public static <BO, VO> BackVO<VO> assembleBackVO(BackBO<BO> backBO, Class<VO> clazz) {
        BackVO<VO> backVO;
        BO obj = backBO.getData();
        backBO.setData(null);
        backVO = CopyPropertiesUtil.copyBean(backBO, BackVO.class);
        if (obj != null) {
            backVO.setData(CopyPropertiesUtil.copyBean(obj, clazz));
        }
        return backVO;
    }

    /**
     * 封装List返回
     *
     * @param source
     * @param clazz
     * @param <BO>
     * @param <VO>
     * @return
     */
    public static <BO, VO> BackVO<List<VO>> assembleBoToVoByList(BackBO<List<BO>> source, Class<VO> clazz) {
        BackVO<List<VO>> backVO;
        if (source == null) {
            return null;
        }
        List<BO> bos = source.getData();
        source.setData(null);
        backVO = copyBean(source, BackVO.class);
        if (CollectionUtils.isNotEmpty(bos)) {
            List<VO> vos = copyList(bos, clazz);
            backVO.setData(vos);
        }
        return backVO;
    }

    public static <BO, VO> BackVO<Map<Object, VO>> assembleBoToVoByMap(BackBO<Map<Object, BO>> source, Class<VO> clazz) {
        BackVO<Map<Object, VO>> backVO;
        if (source == null) {
            return null;
        }
        Map<Object, BO> sourceData = source.getData();
        source.setData(null);
        backVO = copyBean(source, BackVO.class);
        if (sourceData != null) {
            Map<Object, VO> copyMap = copyMap(sourceData, clazz);
            backVO.setData(copyMap);
        }
        return backVO;
    }

    /**
     * 封装list参数的BaseParam
     *
     * @param source
     * @param clazz
     * @param <BO>
     * @param <VO>
     * @return
     */
    public static <BO, VO> BaseParam<List<BO>> assembleVoToBoList(BaseParam<List<VO>> source, Class<BO> clazz) {
        BaseParam<List<BO>> baseParam;
        if (source == null) {
            return null;
        }
        List<VO> vos = source.getData();
        baseParam = new BaseParam<>();
        List<BO> bos = copyList(vos, clazz);
        baseParam.setData(bos);
        return baseParam;
    }

    /**
     * 封装复杂VO
     * 实例: BackBo<List<DemoBO>> >> BackVo<List<DemoVO>>
     * 1. BackBo<List<DemoBO>> backBO = new BackBo<List<DemoBO>>();
     * 2. TypeReference<BackVo<List<DemoVO>>> reference = new TypeReference<BackVo<List<DemoVO>>>() {};
     * 3. BackVo<List<DemoVO>> backVO = assembleBoToVo(backBO, reference);
     *
     * @param source
     * @param typeReference
     * @return
     */
    public static <BO, VO> BackVO<VO> assembleBoToVo(BackBO<BO> source, TypeReference<BackVO<VO>> typeReference) {
        return JSON.parseObject(JSON.toJSONString(source), typeReference);
    }

    /**
     * 封装复杂BO
     *
     * @param source
     * @param typeReference
     * @param <VO>
     * @param <BO>
     * @return
     */
    public static <VO, BO> BaseParam<BO> assembleVoToBo(BaseParam<VO> source, TypeReference<BaseParam<BO>> typeReference) {
        return JSON.parseObject(JSON.toJSONString(source), typeReference);
    }

    public static <T> T parseObject(Object source, TypeReference<T> typeReference) {
        return JSON.parseObject(JSON.toJSONString(source), typeReference);
    }
}
