package framework.driver;

import framework.config.ConfigLoader;
import framework.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

public final class DriverFactory {

    private DriverFactory() {
    }

    public static void initDriver() {
        if (Objects.isNull(DriverManager.getDriver())) {
            String browser = ConfigLoader.getInstance().getProperty("browser").toUpperCase();
            BrowserType browserType = BrowserType.valueOf(browser);
            WebDriver driver = BrowserFactory.createDriver(browserType);
            DriverManager.setDriver(driver);
            DriverManager.getDriver().manage().window().maximize();
        }
    }

    public static void quitDriver() {
        if (Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}
