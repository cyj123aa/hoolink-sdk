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
     * 根据报文数组，获取CRC值
     *
     * @param data 报文数组
     * @return CRC值（10进制）
     */
    public static int getCrc16(int[] data) {
        int temp;
        int crc = 0xFFFF;
        int byteLen = 8;
        for (int i : data) {
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
     * 将16进制字符串转换为16进制int数组
     *
     * @param str 报文字符串
     * @return 报文数组
     */
    public static int[] getIntArr(String str) {
        str = str.replaceAll(SPACE, NUL);
        int[] result = new int[str.length() / TWO];
        for (int i = 0; i < str.length(); i += TWO) {
            String temp = str.substring(i, i + TWO);
            result[i / TWO] = Integer.parseInt(temp, HEX);
        }
        return result;
    }

    /**
     * 输出16进制与长度, 提供给 C++ CRC校验方法 测试 代码使用
     *
     * @param str
     */
    private static void printHexStr(String str) {
        String[] split = str.split(SPACE);
        StringBuilder builder = new StringBuilder();
        builder.append("unsigned char arr[] = {");
        for (int i = 0; i < split.length; i++) {
            builder.append("0x").append(split[i]);
            if (i < split.length - 1) {
                builder.append(", ");
            }
        }
        builder.append("};");
        System.out.println(builder.toString());
        System.out.println("int len = " + split.length + ";");
    }

    /**
     * 测试CRC获取
     *
     * @param args
     */
    public static void main(String[] args) throws Exception {
        String str = "48 4C 01 00 01 00 00 05 00 00";
        Crc16Util.printHexStr(str);
        str = str.replaceAll(Crc16Util.SPACE, Crc16Util.NUL);
        int[] result = Crc16Util.getIntArr(str);
        int crcInt = Crc16Util.getCrc16(result);
        System.out.println("crc16 int is: " + crcInt);
        String crcStr = Integer.toHexString(crcInt).toUpperCase();
        while (crcStr.length() < 4) {
            crcStr = "0" + crcStr;
        }
        System.out.println("crc16 hex is: " + crcStr);

        String ftp = "ftp://127.0.0.1/xxx-dt1.1-v1.1.2.2r.img";
        byte[] asc = ftp.getBytes("US-ASCII");
        System.out.println(ByteUtil.bytesToHexPrint(asc));
        System.out.println(Integer.toHexString(asc.length));
    }

}