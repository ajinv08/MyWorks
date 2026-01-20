package framework.driver;

import framework.enums.BrowserType;
import framework.exceptions.FrameworkException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public final class BrowserFactory {

    private BrowserFactory() {
    }

    public static WebDriver createDriver(BrowserType browserType) {
        switch (browserType) {
            case CHROME:
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--remote-allow-origins=*");
                // Add headless check if configured
                return new ChromeDriver(chromeOptions);
            case FIREFOX:
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                return new FirefoxDriver(firefoxOptions);
            case EDGE:
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("--remote-allow-origins=*");
                return new EdgeDriver(edgeOptions);
            default:
                throw new FrameworkException("Invalid Browser Type passed: " + browserType);
        }
    }
}
