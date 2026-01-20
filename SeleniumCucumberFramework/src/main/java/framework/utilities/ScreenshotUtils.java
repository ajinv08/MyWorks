package framework.utilities;

import framework.driver.DriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public final class ScreenshotUtils {

    private ScreenshotUtils() {
    }

    public static byte[] getScreenshot() {
        return ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
    }

    public static String getBase64Image() {
        return ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);
    }
}
