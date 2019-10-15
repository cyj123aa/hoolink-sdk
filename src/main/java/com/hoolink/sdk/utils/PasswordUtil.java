package com.hoolink.sdk.utils;

/**
 * @author <a herf="mailto:yanwu0527@163.com">XuBaofeng</a>
 * @date 2019-10-15 10:20.
 * <p>
 * description:
 */
public class PasswordUtil {
    private static final String SECRET_KEY = "1+IoT";

    private PasswordUtil() {
    }

    /**
     * 密码加密
     *
     * @param password 源密码
     * @return 加密后密码
     */
    public static String encryptionPassword(String password) {
        return Aes128Util.encrypt(password, SECRET_KEY).toUpperCase();
    }

}
