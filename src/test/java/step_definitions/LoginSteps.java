package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.LoginPage;
import org.example.pageObject.UserPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private WebDriver webDriver;
    public LoginSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @Given("^User open website immersive dashboard$")
    public void userOpenWebsiteImmersiveDashboard() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.verifyLoginPage();
    }

    @When("^User input username \"(.*)\"$")
    public void userInputUsername(String userName) throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setUserName(userName);
        Thread.sleep(2000);
    }

    @And("^User input password \"(.*)\"$")
    public void userInputPassword(String password) throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setPassword(password);
        Thread.sleep(2000);
    }

    @And("^Click login button$")
    public void clickLoginButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setLoginButton();
        Thread.sleep(3000);
    }

    @Then("^User already on dashboard page$")
    public void userAlreadyOnDashboardPage() throws InterruptedException {
        webDriver.get("https://immersive-alta.netlify.app");
        Thread.sleep(3000);
    }

    @Then("^System show wrong email or password$")
    public void systemShowWrongEmailOrPassword() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.verifyLoginPage();
    }
}
