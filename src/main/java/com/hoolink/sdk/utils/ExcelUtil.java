package com.hoolink.sdk.utils;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Excel工具类
 *
 * @Author: xuli
 * @Date: 2018/10/19 10:18
 */
public class ExcelUtil {

    private static final String FILE_PATTERN = "yyyyMMddHHmmss";

    /**
     * 组装Excel的方法, 通过该方法传入标题栏和数据体得到一个Excel文件
     *
     * @param head     标题栏
     * @param contents 数据集合
     * @return
     * @throws Exception
     */
    public static SXSSFWorkbook assembleExcel07(List<String> head, List<List<String>> contents) throws Exception {
        // ---- 创建excel文件
        SXSSFWorkbook workbook = new SXSSFWorkbook();
        // ---- 创建工作簿
        Sheet sheet = workbook.createSheet();
        // ---- 设置默认列宽
        sheet.setDefaultColumnWidth(15);
        // ---- 创建标题行
        Row titleRow = sheet.createRow(0);
        for (int i = 0; i < head.size(); i++) {
            Cell cell = titleRow.createCell(i);
            cell.setCellValue(head.get(i));
            cell.setCellStyle(getHeadCellStyle(workbook));
        }
        // ---- 创建数据行
        assembleContents(contents, sheet);
        return workbook;
    }

    /**
     * 创建03版excel
     *
     * @param head
     * @param contents
     * @return
     * @throws
     * @author <a herf="mailto:yanwu0527@163.com">XuBaofeng</a>
     */
    public static HSSFWorkbook assembleExcel03(List<String> head, List<List<String>> contents) {
        // ---- 创建excel文件
        HSSFWorkbook workbook = new HSSFWorkbook();
        // ---- 创建工作簿
        Sheet sheet = workbook.createSheet();
        // ---- 设置默认列宽
        sheet.setDefaultColumnWidth(15);
        // ---- 创建标题行
        Row titleRow = sheet.createRow(0);
        for (int i = 0; i < head.size(); i++) {
            Cell cell = titleRow.createCell(i);
            cell.setCellValue(head.get(i));
        }
        // ---- 创建数据行
        assembleContents(contents, sheet);
        return workbook;
    }

    private static void assembleContents(List<List<String>> contents, Sheet sheet) {
        for (int i = 0; i < contents.size(); i++) {
            List<String> content = contents.get(i);
            Row row = sheet.createRow(i + 1);
            for (int j = 0; j < content.size(); j++) {
                row.createCell(j).setCellValue(content.get(j));
            }
        }
    }

    /**
     * 组装标题头
     *
     * @param value
     * @return
     */
    public static List<String> assembleHead(String... value) {
        if (ArrayUtil.isEmpty(value)) {
            return null;
        }
        List<String> list = new ArrayList<>();
        for (String str : value) {
            if (StringUtils.isNotBlank(str)) {
                list.add(str);
            }
        }
        return list;
    }

    /**
     * 导出Excel
     *
     * @param workbook
     * @param fileName
     * @return
     * @throws Exception
     */
    public static ResponseEntity<Resource> getResponseEntity03(HSSFWorkbook workbook, String fileName) throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        workbook.write(out);
        ByteArrayResource resource = new ByteArrayResource(out.toByteArray());
        fileName = String.format("%1s_%2s.xls", fileName, new SimpleDateFormat(FILE_PATTERN).format(new Date()));
        String fileDisposition = "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8");
        return ResponseEntity
                .ok()
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_OCTET_STREAM_VALUE)
                .header(HttpHeaders.ACCESS_CONTROL_EXPOSE_HEADERS, "Content-Disposition")
                .header(HttpHeaders.CONTENT_ENCODING, "UTF-8")
                .header(HttpHeaders.CONTENT_DISPOSITION, fileDisposition)
                .body(resource);
    }

    public static ResponseEntity<Resource> export(Workbook workbook, String fileName) throws Exception {
        ByteArrayResource resource;
        // ===== response输出excel
        try (ByteArrayOutputStream out = new ByteArrayOutputStream()) {
            workbook.write(out);
            resource = new ByteArrayResource(out.toByteArray());
        } finally {
            workbook.close();
        }
        String fileDisposition = "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8");
        return ResponseEntity
                .ok()
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_OCTET_STREAM_VALUE)
                .header(HttpHeaders.ACCESS_CONTROL_EXPOSE_HEADERS, "Content-Disposition")
                .header(HttpHeaders.CONTENT_ENCODING, "UTF-8")
                .header(HttpHeaders.CONTENT_DISPOSITION, fileDisposition)
                .body(resource);
    }

    /**
     * 设置单元格样式
     *
     * @param workbook
     * @return
     */
    private static CellStyle getHeadCellStyle(SXSSFWorkbook workbook) {
        CellStyle headStyle = workbook.createCellStyle();
        // ----- 水平居中
        headStyle.setAlignment(HorizontalAlignment.CENTER);
        // ----- 设置字体加粗
        Font headFont = workbook.createFont();
        headFont.setBold(true);
        headStyle.setFont(headFont);
        return headStyle;
    }

    /**
     * 将我们从Excel获取的列宽转换为POI可识别的宽度
     *
     * @param columnWidth 打开Excel可读的列宽
     * @return poi 识别的列宽
     */
    public static int convert2ExcelColumnWidth(int columnWidth) {
        return 256 * columnWidth + 184;
    }

    public static ResponseEntity<Resource> getResponseEntity(List<String> head, List<List<String>> contents, String fileName) {
        try {
            SXSSFWorkbook hssfWorkbook = ExcelUtil.export(head, contents);
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            hssfWorkbook.write(out);
            ByteArrayResource resource = new ByteArrayResource(out.toByteArray());
            String excelName = String.format("%1s_%2s.xls", fileName, new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
            String fileDisposition = null;
            fileDisposition = "attachment;filename=" + URLEncoder.encode(excelName, "UTF-8");
            return ResponseEntity
                    .ok()
                    .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_OCTET_STREAM_VALUE)
                    .header(HttpHeaders.ACCESS_CONTROL_EXPOSE_HEADERS, "Content-Disposition")
                    .header(HttpHeaders.CONTENT_ENCODING, "UTF-8")
                    .header(HttpHeaders.CONTENT_DISPOSITION, fileDisposition)
                    .body(resource);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static SXSSFWorkbook export(List<String> head, List<List<String>> content) throws Exception {
        //创建excel文件
        SXSSFWorkbook hssfWorkbook = new SXSSFWorkbook();
        //创建工作簿
        Sheet sheet = hssfWorkbook.createSheet();
        //设置默认列宽
        sheet.setDefaultColumnWidth(15);
        //创建标题行
        Row titleRow = sheet.createRow(0);
        for (int i = 0; i < head.size(); i++) {
            titleRow.createCell(i).setCellValue(head.get(i));
        }
        //创建数据行
        assembleContents(content, sheet);
        return hssfWorkbook;
    }

    public static <T> ResponseEntity<Resource> getResponseEntity(List<T> list, String[] headers, String title) {
        try {
            SXSSFWorkbook hssfWorkbook = ExcelUtil.exportDataToExcel(list, headers);
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            hssfWorkbook.write(out);
            ByteArrayResource resource = new ByteArrayResource(out.toByteArray());
            String excelName = String.format("%1s_%2s.xlsx", title, new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
            String fileDisposition = "attachment;filename=" + URLEncoder.encode(excelName, "UTF-8");
            return ResponseEntity
                    .ok()
                    .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_OCTET_STREAM_VALUE)
                    .header(HttpHeaders.ACCESS_CONTROL_EXPOSE_HEADERS, "Content-Disposition")
                    .header(HttpHeaders.CONTENT_ENCODING, "UTF-8")
                    .header(HttpHeaders.CONTENT_DISPOSITION, fileDisposition)
                    .body(resource);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static <T> SXSSFWorkbook exportDataToExcel(List<T> list, String[] headers) {
        //创建excel文件
        SXSSFWorkbook hssfWorkbook = new SXSSFWorkbook();
        //创建工作簿
        Sheet sheet = hssfWorkbook.createSheet();
        //设置默认列宽
        sheet.setDefaultColumnWidth(15);
        //创建标题行
        Row titleRow = sheet.createRow(0);
        for (int i = 0; i < headers.length; i++) {
            Cell cell = titleRow.createCell(i);
            cell.setCellValue(headers[i]);
        }
        //将数据放入sheet中
        for (int i = 0; i < list.size(); i++) {
            Row row = sheet.createRow(i + 1);
            T t = list.get(i);
            //利用反射，根据JavaBean属性的先后顺序，动态调用get方法得到属性的值
            Field[] fields = t.getClass().getDeclaredFields();
            try {
                for (int j = 0; j < fields.length; j++) {
                    Cell cell = row.createCell(j);
                    Field field = fields[j];
                    field.setAccessible(true);
                    String fieldName = field.getName();
                    String methodName = "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
                    Method getMethod = t.getClass().getMethod(methodName, new Class[]{});
                    Object value = getMethod.invoke(t, new Object[]{});
                    if (null == value) {
                        value = "";
                    }
                    cell.setCellValue(value.toString());
                }
            } catch (Exception e) {
            }
        }
        return hssfWorkbook;
    }
}
