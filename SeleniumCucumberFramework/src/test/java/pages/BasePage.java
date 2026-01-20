package pages;

import framework.driver.DriverManager;
import framework.enums.WaitStrategy;
import framework.utilities.ElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected BasePage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    protected void click(By by, WaitStrategy waitStrategy, String elementName) {
        ElementUtils.click(by, waitStrategy, elementName);
    }

    protected void sendKeys(By by, String value, WaitStrategy waitStrategy, String elementName) {
        ElementUtils.sendKeys(by, value, waitStrategy, elementName);
    }

    protected String getText(By by, WaitStrategy waitStrategy) {
        return ElementUtils.getText(by, waitStrategy);
    }
}
