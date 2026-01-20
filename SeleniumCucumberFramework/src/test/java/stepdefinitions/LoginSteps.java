package stepdefinitions;

import framework.config.ConfigLoader;
import framework.driver.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPage;

public class LoginSteps {

    private LoginPage loginPage;

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        DriverManager.getDriver().get(ConfigLoader.getInstance().getProperty("url"));
        loginPage = new LoginPage();
    }

    @When("User enters username {string} and password {string}")
    public void user_enters_username_and_password(String username, String password) {
        loginPage.enterUsername(username).enterPassword(password);
    }

    @When("User clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.clickLogin();
    }

    @Then("User should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        String title = DriverManager.getDriver().getTitle();
        Assert.assertTrue(title.contains("OrangeHRM")); // Simple validation
    }
}
