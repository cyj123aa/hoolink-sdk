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
     * {0x48, 0x4C, 0x01, 0x00, 0x01, 0x00, 0x00, 0x05, 0x00, 0x00} >> 58951
     *
     * @param data 报文数组
     * @return CRC值（10进制）
     */
    public static int getCrc16(byte[] data) {
        // ----- 预置一个CRC寄存器，初始值为0xFFFF
        int crc = 0xFFFF;
        byte byteLen = 8;
        for (byte b : data) {
            // ----- 循环，将每数据帧中的每个字节与CRC寄存器中的低字节进行异或运算
            crc ^= ((int) b & 0x00FF);
            for (int j = 0; j < byteLen; j++) {
                // ----- 将寄存器右移1位，最高位自动补0
                if ((crc & 0x0001) != 0) {
                    // ----- 如果右移出来的位不为0，将寄存器与固定值 0xA001 异或运算
                    crc >>= 1;
                    crc ^= 0xA001;
                } else {
                    // ----- 如果右移出来的位为0，不做处理，进行下一次右移，知道处理完整个字节的8位
                    crc >>= 1;
                }
            }
        }
        // ----- 最终寄存器得值就是CRC的值，返回
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
        for (int i = 0; i < strLen; i += TWO) {
            String temp = str.substring(i, i + TWO);
            result[i / TWO] = (byte) Integer.parseInt(temp, HEX);
        }
        return result;
    }

    /**
     * 将CRC-16值转换成16进制字符串，且保持最小长度为4位
     * <p>
     * 58951 >> E647
     *
     * @param data
     * @return
     */
    private static String intToHexStr(int data) {
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
        // ----- 输出16进制数组给 C++ 测试使用
        Crc16Util.printHexStr(str);
        // ----- 获取CRC-16的值
        System.out.println("crc16 int is: " + Crc16Util.getCrc16(str));
        System.out.println("crc16 hex is: " + Crc16Util.getCrc16HexStr(str));
        // ----- 获取FTP地址的十六进制数组
        String ftp = "ftp://127.0.0.1/xxx-dt1.1-v1.1.2.2r.img";
        byte[] asc = ftp.getBytes("US-ASCII");
        System.out.println(ByteUtil.bytesToHexPrint(asc));
        System.out.println(Integer.toHexString(asc.length));
    }

}