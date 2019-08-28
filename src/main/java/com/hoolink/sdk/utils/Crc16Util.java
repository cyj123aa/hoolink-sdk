package com.hoolink.sdk.utils;

/**
 * @author <a herf="mailto:yanwu0527@163.com">XuBaofeng</a>
 * @date 2019-08-26 14:22.
 * <p>
 * description:
 * 本方法使用CRC-16/MODBUS算法
 */
public class Crc16Util {
    private static final Integer TWO = 2;
    private static final Integer HEX = 16;
    private static final String NUL = "";
    private static final String SPACE = " ";

    /**
     * 根据报文byte数组，获取CRC-16 16进制字符串
     * 48 4C 01 00 01 00 00 05 00 00 >> 0xE647
     *
     * @param data
     * @return
     */
    public static String getCrc16HexStr(String data) {
        return intToHexStr(getCrc16(data));
    }

    /**
     * 根据报文byte数组，获取CRC-16 int值
     * 48 4C 01 00 01 00 00 05 00 00 >> 58951
     *
     * @param data 报文数组
     * @return CRC值（10进制）
     */
    public static int getCrc16(String data) {
        data = data.replaceAll(SPACE, NUL);
        return getCrc16(getByteArr(data));
    }

    /**
     * 根据报文byte数组，获取CRC-16 16进制字符串
     * {0x48, 0x4C, 0x01, 0x00, 0x01, 0x00, 0x00, 0x05, 0x00, 0x00} >> 0xE647
     *
     * @param data
     * @return
     */
    public static String getCrc16HexStr(byte[] data) {
        return intToHexStr(getCrc16(data));
    }

    /**
     * 根据报文byte数组，获取CRC-16 int值
     * 48 4C 01 00 01 00 00 05 00 00 >> 58951
     * {0x48, 0x4C, 0x01, 0x00, 0x01, 0x00, 0x00, 0x05, 0x00, 0x00} >> 58951
     *
     * @param data 报文数组
     * @return CRC值（10进制）
     */
    public static int getCrc16(byte[] data) {
        int temp;
        int crc = 0xFFFF;
        byte byteLen = 8;
        for (byte i : data) {
            crc ^= i;
            for (int j = 0; j < byteLen; j++) {
                temp = crc & 0x0001;
                crc = crc >> 1;
                if (temp != 0x0) {
                    crc ^= 0xA001;
                }
            }
        }
        return crc;
    }

    /**
     * 将16进制字符串转换为16进制Byte数组
     * 48 4C 01 00 01 00 00 05 00 00 >> {0x48, 0x4C, 0x01, 0x00, 0x01, 0x00, 0x00, 0x05, 0x00, 0x00}
     *
     * @param str 报文字符串
     * @return 报文数组
     */
    public static byte[] getByteArr(String str) {
        str = str.replaceAll(SPACE, NUL);
        int strLen = str.length();
        byte[] result = new byte[strLen / TWO];
        // ----- 两位一个字节
        for (int i = 0; i < strLen; i = i + TWO) {
            String temp = str.substring(i, i + TWO);
            result[i / TWO] = Byte.parseByte(temp, HEX);
        }
        return result;
    }

    /**
     * 将CRC-16值转换成16进制字符串，且保持最小长度为4为
     * <p>
     * 58951 >> E647
     *
     * @param data
     * @return
     */
    private static String intToHexStr(int data) {
        String crcStr = Integer.toHexString(data).toUpperCase();
        int defaultLen = 4;
        while (crcStr.length() < defaultLen) {
            crcStr = "0" + crcStr;
        }
        return crcStr;
    }

    /**
     * 输出16进制与长度, 提供给 C++ CRC校验方法 测试 代码使用
     *
     * @param str
     */
    private static void printHexStr(String str) {
        byte[] byteArr = getByteArr(str);
        StringBuilder builder = new StringBuilder();
        builder.append("unsigned char arr[] = {");
        for (int i = 0; i < byteArr.length; i++) {
            builder.append("0x").append(byteArr[i]);
            if (i < byteArr.length - 1) {
                builder.append(", ");
            }
        }
        builder.append("};");
        System.out.println(builder.toString());
        System.out.println("int len = " + byteArr.length + ";");
    }

    /**
     * 测试CRC获取
     *
     * @param args
     */
    public static void main(String[] args) throws Exception {
        String str = "48 4C 01 00 01 00 00 05 00 00";
        Crc16Util.printHexStr(str);
        System.out.println("crc16 int is: " + Crc16Util.getCrc16(str));
        System.out.println("crc16 hex is: " + Crc16Util.getCrc16HexStr(str));

        String ftp = "ftp://127.0.0.1/xxx-dt1.1-v1.1.2.2r.img";
        byte[] asc = ftp.getBytes("US-ASCII");
        System.out.println(ByteUtil.bytesToHexPrint(asc));
        System.out.println(Integer.toHexString(asc.length));
    }

}