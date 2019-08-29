package com.hoolink.sdk.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * @author <a herf="mailto:yanwu0527@163.com">XuBaofeng</a>
 * @date 2019-08-26 14:22.
 * <p>
 * description:
 * 本方法使用CRC-16/MODBUS算法
 */
@SuppressWarnings("all")
public class Crc16Util {
    private static final Integer ONE = 1;
    private static final Integer TWO = 2;
    private static final Integer HEX = 16;
    private static final String NUL = "";
    private static final String SPACE = " ";
    private static final String ASCII = "US-ASCII";

    /**
     * 根据报文byte数组，获取CRC-16 16进制字符串<p>
     * 48 4C 01 00 01 00 00 05 00 00 >> 0xE647
     *
     * @param data 报文数组
     * @return CRC值（16进制）
     */
    public static String getCrc16HexStr(String data) {
        return crcToHexStr(getCrc16(data));
    }

    /**
     * 根据报文byte数组，获取CRC-16 int值<p>
     * 48 4C 01 00 01 00 00 05 00 00 >> 58951
     *
     * @param data 报文数组
     * @return CRC值（10进制）
     */
    public static int getCrc16(String data) {
        if (StringUtils.isBlank(data)) {
            // ----- 校验：报文字符串不能为空，否则抛异常
            throw new RuntimeException("The string cannot be empty!");
        }
        return getCrc16(hexStrToByteArr(data));
    }

    /**
     * 根据报文byte数组，获取CRC-16 16进制字符串<p>
     * {0x48, 0x4C, 0x01, 0x00, 0x01, 0x00, 0x00, 0x05, 0x00, 0x00} >> 0xE647
     *
     * @param data 报文数组
     * @return CRC值（16进制）
     */
    public static String getCrc16HexStr(byte[] data) {
        return crcToHexStr(getCrc16(data));
    }

    /**
     * 根据报文byte数组，获取CRC-16 int值<p>
     * {0x48, 0x4C, 0x01, 0x00, 0x01, 0x00, 0x00, 0x05, 0x00, 0x00} >> 58951
     *
     * @param data 报文数组
     * @return CRC值（10进制）
     */
    public static int getCrc16(byte[] data) {
        if (data.length == 0) {
            // ----- 校验：报文数组不能为空，否则抛异常
            throw new RuntimeException("The array cannot be empty!");
        }
        // ----- 预置一个CRC寄存器，初始值为0xFFFF
        int crc = 0xFFFF;
        byte byteLen;
        boolean flag;
        for (byte item : data) {
            // ----- 循环，将每数据帧中的每个字节与CRC寄存器中的低字节进行异或运算
            crc ^= ((int) item & 0x00FF);
            byteLen = 8;
            while (byteLen > 0) {
                // ----- 判断寄存器最后一位是 1\0：[true: 1; false: 0]
                flag = (crc & ONE) == ONE;
                // ----- 将寄存器右移1位，最高位自动补0
                crc >>= 1;
                if (flag) {
                    // ----- 如果右移出来的位是 1：将寄存器与固定值 0xA001 异或运算
                    // ----- 如果右移出来的位是 0：不做处理，进行下一次右移
                    // ----- 直到处理完整个字节的8位
                    crc ^= 0xA001;
                }
                byteLen--;
            }
        }
        // ----- 最终寄存器得值就是CRC的值，返回
        return crc;
    }

    /**
     * 将16进制字符串转换为16进制Byte数组<p>
     * 48 4C 01 00 01 00 00 05 00 00 >> {0x48, 0x4C, 0x01, 0x00, 0x01, 0x00, 0x00, 0x05, 0x00, 0x00}
     *
     * @param str 报文字符串
     * @return 报文数组
     */
    private static byte[] hexStrToByteArr(String str) {
        str = str.replaceAll(SPACE, NUL);
        int strLen = str.length();
        if ((strLen & ONE) == ONE) {
            // ----- 报文字符串必须是以一个字节为单位（两位为一个字节），所以当去除所有空格后的报文长度为单数时说明报文错误
            throw new RuntimeException("Incorrect message format!");
        }
        byte[] result = new byte[strLen / TWO];
        // ----- 两位一个字节
        for (int i = 0; i < strLen; i += TWO) {
            String temp = str.substring(i, i + TWO);
            result[i / TWO] = (byte) Integer.parseInt(temp, HEX);
        }
        return result;
    }

    /**
     * 将CRC-16值转换成16进制字符串，且保持最小长度为4位<p>
     * 58951 >> E647
     *
     * @param data CRC值（10进制）
     * @return CRC值（16进制）
     */
    private static String crcToHexStr(int data) {
        String crcStr = Integer.toHexString(data).toUpperCase();
        int size = 4 - crcStr.length();
        StringBuilder builder = new StringBuilder();
        // ---- 长度不够 4 位高位自动补0
        while (size > 0) {
            builder.append("0");
            size--;
        }
        return builder.append(crcStr).toString();
    }

    /**
     * 输出16进制与长度, 提供给 C++ CRC校验方法 测试 代码使用
     *
     * @param str 16进制字符串
     */
    private static void printHexStr(String str) {
        String[] split = str.split(SPACE);
        StringBuilder builder = new StringBuilder();
        builder.append("    unsigned char arr[] = {");
        for (int i = 0; i < split.length; i++) {
            builder.append("0x").append(split[i]);
            if (i < split.length - 1) {
                builder.append(", ");
            }
        }
        builder.append("};");
        System.out.println(builder.toString());
        System.out.println("    int len = " + split.length + ";");
    }

    /**
     * 测试CRC获取
     *
     * @param args
     */
    public static void main(String[] args) throws Exception {
        String str = "48 4C 01 00 01 00 00 05 00 00";
        // ----- 输出16进制数组给 C++ 测试使用
        Crc16Util.printHexStr(str);
        // ----- 获取CRC-16的值
        System.out.println("crc16 int is: " + Crc16Util.getCrc16(str));
        System.out.println("crc16 hex is: " + Crc16Util.getCrc16HexStr(str));
        // ----- 获取FTP地址的十六进制数组
        String ftp = "ftp://127.0.0.1/xxx-dt1.1-v1.1.2.2r.img";
        byte[] asc = ftp.getBytes(ASCII);
        System.out.println(ByteUtil.bytesToHexPrint(asc));
        System.out.println(Integer.toHexString(asc.length));
    }

}