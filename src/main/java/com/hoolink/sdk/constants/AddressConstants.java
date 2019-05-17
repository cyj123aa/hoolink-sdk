package com.hoolink.sdk.constants;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zhao_aken on 16/5/25.
 */
public final class AddressConstants {
    private static final Logger logger = LoggerFactory.getLogger(AddressConstants.class);

    private AddressConstants() {
    }

    private static final Map<String, String> PROPERTIES_MAPPING;
    static {
        PROPERTIES_MAPPING = new HashMap<>();
        Properties properties = new Properties();
        try {
            properties.load(AddressConstants.class.getClassLoader().getResourceAsStream(
                    "address.properties"));
            properties.keySet();

            for (Object key : properties.keySet()) {
                PROPERTIES_MAPPING.put(key.toString(),properties.getProperty(key.toString()));
            }
        } catch (IOException e) {
            logger.error("读取address.properties文件失败", e);
        }
    }

    public static String getProperty(String property) {
        return property == null ? null : PROPERTIES_MAPPING.get(property);
    }
}
