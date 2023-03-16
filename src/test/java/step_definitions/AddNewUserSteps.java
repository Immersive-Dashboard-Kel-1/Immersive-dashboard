package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.UserPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class AddNewUserSteps {
    private WebDriver webDriver;
    public AddNewUserSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("^User click user menu$")
    public void userClickUserMenu() throws InterruptedException {
        UserPage userPage = new UserPage(webDriver);
        userPage.clickUserMenu();
        Thread.sleep(1500);
    }

    @And("^User click add new button$")
    public void userClickAddNewButton() throws InterruptedException {
        UserPage userPage = new UserPage(webDriver);
        userPage.setAddNew();
        Thread.sleep(1500);
    }

    @And("^User input nama \"(.*)\"$")
    public void userInputNama(String nama)throws InterruptedException {
        UserPage userPage = new UserPage(webDriver);
        userPage.setNama(nama);
        Thread.sleep(1000);
    }

    @And("^User input email \"(.*)\"$")
    public void userInputEmail(String email) throws InterruptedException{
        UserPage userPage = new UserPage(webDriver);
        userPage.setEmail(email);
        Thread.sleep(1000);
    }

    @And("^User input password registration \"(.*)\"$")
    public void userInputPasswordRegistration(String password) throws InterruptedException {
        UserPage userPage = new UserPage(webDriver);
        userPage.setPassword(password);
        Thread.sleep(1000);
    }

    @And("^User select team \"(.*)\"$")
    public void userSelectTeam(String team)throws InterruptedException{
        UserPage userPage = new UserPage(webDriver);
        userPage.setTeam(team);
        Thread.sleep(1000);
    }

    @And("^User select status \"(.*)\"$")
    public void userSelectStatus(String status)throws InterruptedException{
        UserPage userPage = new UserPage(webDriver);
        userPage.setStatus(status);
        Thread.sleep(1000);
    }

    @And("^User click save button$")
    public void userClickSaveButton() {
        UserPage userPage = new UserPage(webDriver);
        userPage.setSave();
    }

    @Then("^User created$")
    public void userCreated() {
        UserPage userPage = new UserPage(webDriver);
        Assert.assertTrue(userPage.verifyUser());
    }


    @And("^User click cancel button$")
    public void userClickCancelButton() {
        UserPage userPage = new UserPage(webDriver);
        userPage.setCancelButton();
    }

    @Then("^User not created$")
    public void userNotCreated() {
        UserPage userPage = new UserPage(webDriver);
        Assert.assertTrue(userPage.verifyUser2());
    }

    @Then("^System show message email can not empty$")
    public void systemShowMessageEmailCanNotEmpty() {
        UserPage userPage = new UserPage(webDriver);
        Assert.assertTrue(userPage.verifyPageCancel());
    }
}
