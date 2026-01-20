package framework.utilities;

import framework.constants.FrameworkConstants;
import framework.driver.DriverManager;
import framework.enums.WaitStrategy;
import framework.exceptions.FrameworkException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public final class WaitUtils {

    private WaitUtils() {
    }

    public static WebElement performExplicitWait(WaitStrategy waitStrategy, By by) {
        WebElement element;
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.EXPLICIT_WAIT);

        switch (waitStrategy) {
            case CLICKABLE:
                element = wait.until(ExpectedConditions.elementToBeClickable(by));
                break;
            case PRESENCE:
                element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
                break;
            case VISIBLE:
                element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
                break;
            case NONE:
                element = DriverManager.getDriver().findElement(by);
                break;
            default:
                throw new FrameworkException("Invalid Wait Strategy passed: " + waitStrategy);
        }
        return element;
    }
}
