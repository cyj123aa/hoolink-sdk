package com.hoolink.sdk.utils;

import java.text.DecimalFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import com.hoolink.sdk.bo.datacenter.DateNumBO;
import com.hoolink.sdk.bo.datacenter.TrendGraphBO;
import com.hoolink.sdk.constants.CommonConstants;

/**
 * @Author zhangyy
 * @DateTime 2019-08-29 14:56
 * @Description
 */
public class DataCenterUtil {

    /**
     * 日期趋势计算--中间日期不存在时当0处理
     * @param trendGraphList
     * @return
     */
    public static TrendGraphBO buildDateTrendGraph(List<DateNumBO> trendGraphList,Long startDateL,Integer dateLen){
        LocalDate startDate=timestampToDate(startDateL);
        TrendGraphBO trendGraphBO=new TrendGraphBO();
        List<String> xList=new ArrayList<>();
        List<Long> yList=new ArrayList<>();
        int j=CommonConstants.INT_ZERO;
        long dateNum;
        for(int i=CommonConstants.INT_ZERO;i<dateLen;i++){
            LocalDate tempDate=startDate.plusDays(i);
            if(CollectionUtils.isNotEmpty(trendGraphList)){
                LocalDate selectDate=trendGraphList.get(j).getCountDate();
                if(tempDate.equals(selectDate)){
                    dateNum=trendGraphList.get(j).getCountNum();
                    j++;
                }else{
                    dateNum=CommonConstants.INT_ZERO;
                }
            }else{
                dateNum=CommonConstants.INT_ZERO;
            }
            xList.add(tempDate.format(DateTimeFormatter.ofPattern("MM-dd")));
            yList.add(dateNum);
        }
        trendGraphBO.setX(xList);
        trendGraphBO.setY(yList);
        return trendGraphBO;
    }

    /**
     * 时间戳转localdate
     * @param timestamp
     * @return
     */
    public static LocalDate timestampToDate(Long timestamp){
        Instant instant = Instant.ofEpochMilli(timestamp);
        ZoneId zone = ZoneId.systemDefault();
        LocalDateTime localDateTime=LocalDateTime.ofInstant(instant,zone);
        LocalDate localDate=localDateTime.toLocalDate();
        return localDate;
    }

    /**
     * 计算百分比保留两位小数
     * @param molecule
     * @param denominator
     */
    public static Double colPercent(Long molecule,Long denominator){
        DecimalFormat df = new DecimalFormat(".0");
        molecule=molecule*CommonConstants.INT_ONEHUNDERD;
        Double dd=Double.valueOf(molecule.toString())/denominator;
        Double d=Double.valueOf(df.format(dd));
        return d;
    }
}
