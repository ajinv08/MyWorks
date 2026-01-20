package pages;

import framework.enums.WaitStrategy;
import org.openqa.selenium.By;

public final class LoginPage extends BasePage {

    private final By usernameField = By.name("username");
    private final By passwordField = By.name("password");
    private final By loginButton = By.xpath("//button[@type='submit']");

    public LoginPage enterUsername(String username) {
        sendKeys(usernameField, username, WaitStrategy.VISIBLE, "Username Field");
        return this;
    }

    public LoginPage enterPassword(String password) {
        sendKeys(passwordField, password, WaitStrategy.PRESENCE, "Password Field");
        return this;
    }

    public void clickLogin() {
        click(loginButton, WaitStrategy.CLICKABLE, "Login Button");
    }
}
