package framework.utilities;

import framework.driver.DriverManager;
import framework.enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public final class ElementUtils {

    private ElementUtils() {
    }

    public static void click(By by, WaitStrategy waitStrategy, String elementName) {
        WebElement element = WaitUtils.performExplicitWait(waitStrategy, by);
        element.click();
        // LoggerUtils.info(elementName + " is clicked");
    }

    public static void sendKeys(By by, String value, WaitStrategy waitStrategy, String elementName) {
        WebElement element = WaitUtils.performExplicitWait(waitStrategy, by);
        element.sendKeys(value);
        // LoggerUtils.info(value + " is entered in " + elementName);
    }

    public static String getText(By by, WaitStrategy waitStrategy) {
        WebElement element = WaitUtils.performExplicitWait(waitStrategy, by);
        return element.getText();
    }
}
