package com.jw.sdk.utils;


import org.apache.commons.io.FileUtils;

import java.io.*;
import java.math.BigDecimal;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.DecimalFormat;

/**
 * @version V1.0
 * @classname:BroadcastRecordingFilesParamBO
 * @author: xiaolei.yang
 * @date: 2019/5/17 15:11
 **/
public class FileUtil {
    /**
     * 根据byte数组，生成文件
     */
    public static File byteToFile(byte[] buf, String filePath, String fileName) {
        BufferedOutputStream bos = null;
        FileOutputStream fos = null;
        File file = null;
        try {
            File dir = new File(filePath);
            if (!dir.exists() && dir.isDirectory()) {
                dir.mkdirs();
            }
            file = new File(filePath + File.separator + fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
            fos = new FileOutputStream(file);
            bos = new BufferedOutputStream(fos);
            bos.write(buf);
            return new File(filePath + File.separator + fileName);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    /**
     * 删除文件
     *
     * @param
     * @return
     */
    public static boolean deleteFile(File file) {
        if (file.exists() && file.isFile()) {
            if (file.delete()) {
                return true;
            }
        }
        return false;
    }

    /**
     * 使用传统io stream 下载文件
     *
     * @param url
     * @param saveDir
     * @param fileName
     */
    public static void download(String url, String saveDir, String fileName) {

        BufferedOutputStream bos = null;
        InputStream is = null;
        try {
            byte[] buff = new byte[8192];
            is = new URL(url).openStream();
            File file = new File(saveDir, fileName);
            file.getParentFile().mkdirs();
            bos = new BufferedOutputStream(new FileOutputStream(file));
            int count = 0;
            while ((count = is.read(buff)) != -1) {
                bos.write(buff, 0, count);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }

    /**
     * 利用 commonio 库下载文件，依赖Apache Common IO ，官网 https://commons.apache.org/proper/commons-io/
     *
     * @param url
     * @param saveDir
     * @param fileName
     */
    public static void downloadByApacheCommonIO(String url, String saveDir, String fileName) {
        try {
            FileUtils.copyURLToFile(new URL(url), new File(saveDir, fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 使用NIO下载文件， 需要 jdk 1.4+
     *
     * @param url
     * @param saveDir
     * @param fileName
     */
    public static void downloadByNIO(String url, String saveDir, String fileName) {
        ReadableByteChannel rbc = null;
        FileOutputStream fos = null;
        FileChannel foutc = null;
        try {
            rbc = Channels.newChannel(new URL(url).openStream());
            File file = new File(saveDir, fileName);
            file.getParentFile().mkdirs();
            fos = new FileOutputStream(file);
            foutc = fos.getChannel();
            foutc.transferFrom(rbc, 0, Long.MAX_VALUE);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (rbc != null) {
                try {
                    rbc.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (foutc != null) {
                try {
                    foutc.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    /**
     * 使用NIO下载文件， 需要 jdk 1.7+
     *
     * @param url
     * @param saveDir
     * @param fileName
     */
    public static void downloadByNIO2(String url, String saveDir, String fileName) {
        try (InputStream ins = new URL(url).openStream()) {
            Path target = Paths.get(saveDir, fileName);
            Files.createDirectories(target.getParent());
            Files.copy(ins, target, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static final String ONE_KB = "1KB";
    private static final String KB = "KB";
    private static final String MB = "MB";
    private static final String GB = "GB";
    private static final String T = "T";
    private static final Integer SIZE_UNIT = 1024;

    /**
     * 文件大小转化
     *
     * @param filesize
     * @return
     */
    public static String getLength(long filesize) {
        String strFileSize = null;
        if (filesize < 1) {
            return ONE_KB;
        }
        if (filesize < SIZE_UNIT) {
            strFileSize = filesize + KB;
            return strFileSize;
        }
        DecimalFormat df = new DecimalFormat("######0.00");

        //MB
        if ((filesize >= SIZE_UNIT) && (filesize < SIZE_UNIT * SIZE_UNIT)) {
            strFileSize = df.format(((double) filesize) / SIZE_UNIT) +  MB;
            //GB
        } else if ((filesize >= SIZE_UNIT * SIZE_UNIT) && (filesize < SIZE_UNIT * SIZE_UNIT * SIZE_UNIT)) {
            strFileSize = df.format(((double) filesize) / (SIZE_UNIT * SIZE_UNIT)) + GB;
            //T
        } else {
            strFileSize = df.format(((double) filesize) / (SIZE_UNIT * SIZE_UNIT * SIZE_UNIT)) + T;
        }
        return strFileSize;

    }



    /**
     * 文件大小计算
     *
     * @param fileSize
     * @return
     */
    public static Float ByteToM(Long fileSize) {
        Float fileSizeM = fileSize / (SIZE_UNIT * SIZE_UNIT * 1F);
        BigDecimal bg = new BigDecimal(fileSizeM);
        fileSizeM = bg.setScale(1, BigDecimal.ROUND_HALF_UP).floatValue();
        return fileSizeM;
    }

}
