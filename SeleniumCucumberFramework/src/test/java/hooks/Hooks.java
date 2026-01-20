package hooks;

import framework.driver.DriverFactory;
import framework.driver.DriverManager;
import framework.utilities.ScreenshotUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void setUp() {
        DriverFactory.initDriver();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            scenario.attach(ScreenshotUtils.getScreenshot(), "image/png", scenario.getName());
        }
        DriverFactory.quitDriver();
    }
}
