package framework.config;

import framework.constants.FrameworkConstants;
import framework.exceptions.FrameworkException;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public class ConfigLoader {

    private static Properties properties;
    private static final ConfigLoader configLoader = new ConfigLoader();

    private ConfigLoader() {
        properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream(FrameworkConstants.CONFIG_FILE_PATH);
            properties.load(fis);
        } catch (IOException e) {
            throw new FrameworkException("Failed to load configuration file at " + FrameworkConstants.CONFIG_FILE_PATH,
                    e);
        }
    }

    public static ConfigLoader getInstance() {
        return configLoader;
    }

    public String getProperty(String key) {
        String value = properties.getProperty(key);
        if (Objects.isNull(value)) {
            throw new FrameworkException("Property name '" + key + "' is not found in config.properties");
        }
        return value;
    }
}
