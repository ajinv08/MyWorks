package framework.constants;

import java.time.Duration;

public final class FrameworkConstants {

    private FrameworkConstants() {}

    public static final String RESOURCES_PATH = System.getProperty("user.dir") + "/src/test/resources";
    public static final String CONFIG_FILE_PATH = RESOURCES_PATH + "/config/config.properties";
    public static final Duration EXPLICIT_WAIT = Duration.ofSeconds(10);
    public static final String EXCEL_DATA_FILE_PATH = RESOURCES_PATH + "/data/testdata.xlsx";
}
