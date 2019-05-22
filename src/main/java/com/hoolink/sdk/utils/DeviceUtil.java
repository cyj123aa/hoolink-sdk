package com.hoolink.sdk.utils;

import com.hoolink.sdk.bo.device.DeviceTreeBO;
import com.hoolink.sdk.bo.device.GroupBO;
import com.hoolink.sdk.bo.device.GroupTreeBO;
import com.hoolink.sdk.enums.DeviceTypeEnum;
import com.hoolink.sdk.exception.BusinessException;
import com.hoolink.sdk.exception.HoolinkExceptionMassageEnum;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author XuBaofeng.
 * @date 2019-02-27 22:39.
 * <p>
 * description: 设备工具类
 */
public class DeviceUtil {

    /**
     * 根据分组集合获取树结构
     *
     * @param groups
     * @return
     */
    public static List<GroupTreeBO> getGroupTreeBOByList(List<GroupBO> groups) {
        List<GroupTreeBO> result = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(groups)) {
            groups.forEach(group -> {
                GroupTreeBO groupTreeBO = new GroupTreeBO();
                groupTreeBO.setKey(group.getId());
                groupTreeBO.setValue(group.getId());
                groupTreeBO.setTitle(group.getGroupName());
                groupTreeBO.setDeviceSize(group.getDeviceSize());
                if (CollectionUtils.isNotEmpty(group.getManagers())) {
                    List<DeviceTreeBO> children = new ArrayList<>();
                    group.getManagers().forEach(manager -> {
                        DeviceTreeBO device = new DeviceTreeBO();
                        device.setKey(manager.getId());
                        device.setValue(manager.getId());
                        device.setTitle(manager.getDeviceName());
                        device.setType(manager.getDeviceTypeId());
                        children.add(device);
                    });
                    groupTreeBO.setChildren(children);
                }
                result.add(groupTreeBO);
            });
        }
        return result;
    }

    /**
     * 获取需要排除的设备:
     * * 气体检测
     * * 环境监测
     * * 水位监测
     * * 漏电检测
     *
     * @return
     */
    public static List<Long> getDeviceTypeIds() {
        List<Long> typeIds = new ArrayList<>();
        typeIds.add(DeviceTypeEnum.LEAKAGE_DETECT.getDeviceType());
        typeIds.add(DeviceTypeEnum.WATER_GAUGE.getDeviceType());
        typeIds.add(DeviceTypeEnum.ENVIRONMENT.getDeviceType());
        typeIds.add(DeviceTypeEnum.GAS.getDeviceType());
        return typeIds;
    }

    /**
     * 根据规则生成设备序列号
     *
     * @param subTypeId 设备型号ID
     * @param mac       设备物理地址
     * @return
     */
    public static String assemblyDeviceNo(Long subTypeId, String mac) {
        if (StringUtils.isBlank(mac)) {
            // ----- 物理地址不能为空
            throw new BusinessException(HoolinkExceptionMassageEnum.DEVICE_MAC_EMPTY_ERROR);
        }
        char[] deviceNo;
        int flagLength = 13;
        if (mac.length() <= flagLength) {
            // ----- 当mac地址长度小于等于13位时, 根据 设备型号\mac\随机字符 地址生成 16位 的固定长度序列号
            deviceNo = new char[16];
        } else {
            // ----- 当mac地址长度大于13时, 根据 设备型号\mac地址 生成长度大于 16位 的不固定长度序列号
            deviceNo = new char[mac.length() + 3];
        }
        // ----- 追加设备型号 >>  从第 0 位开始
        char[] types = String.format("%03d", subTypeId).toCharArray();
        CharUtil.charsAppend(types, deviceNo, 0);
        // ----- 追加物理地址 >>  从第 3 位开始(设备型号为三位)
        CharUtil.charsAppend(mac.toCharArray(), deviceNo, types.length);
        // ----- 补足空位
        CharUtil.appendRandomChar(deviceNo);
        return new String(deviceNo).toUpperCase();
    }

    /**
     * 组装设备名称, 规则如下:
     * 灯杆编号 灯杆名称 【设备编号 设备名称】
     * -- 备注: 其中【设备编号 设备名称】中的设备编号和设备名称有就展示, 没有就不展示
     *
     * @param poleNo
     * @param poleName
     * @param deviceNo
     * @param deviceName
     * @return
     */
    public static String assemblyDeviceName(String poleNo, String poleName, String deviceNo, String deviceName) {
        StringBuilder sb = new StringBuilder();
        if (StringUtils.isNotBlank(poleNo)) {
            sb.append(poleNo);
        }
        if (StringUtils.isNotBlank(poleName)) {
            if (StringUtils.isNotBlank(poleNo)) {
                sb.append(" ");
            }
            sb.append(poleName);
        }
        if (StringUtils.isNotBlank(deviceNo) || StringUtils.isNotBlank(deviceName)) {
            boolean flag = StringUtils.isNotBlank(poleNo) || StringUtils.isNotBlank(poleName);
            if (flag) {
                sb.append("【");
            }
            if (StringUtils.isNotBlank(deviceNo)) {
                sb.append(deviceNo);
            }
            if (StringUtils.isNotBlank(deviceName)) {
                if (StringUtils.isNotBlank(deviceNo)) {
                    sb.append(" ");
                }
                sb.append(deviceName);
            }
            if (flag) {
                sb.append("】");
            }
        }
        return sb.toString();
    }

    public static String assemblyDialnos(List<String> dialnosList, String separator) {
        //生成电话号码串,和分隔符 格式 1:2:3
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < dialnosList.size(); i++) {
            sb.append(dialnosList.get(i));
            if (i < dialnosList.size() - 1) {
                sb.append(separator);
            }
        }
        return sb.toString();
    }

}
