package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.UserPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class EditUserSteps {
    private WebDriver webDriver;
    public EditUserSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @And("^User click edit button$")
    public void userClickEditButton() {
        UserPage userPage = new UserPage(webDriver);
        userPage.setEditButton();
    }

    @And("^User input new name \"(.*)\"$")
    public void userInputNewName(String inputNewName) throws InterruptedException {
        UserPage userPage = new UserPage(webDriver);
        userPage.setEditName(inputNewName);
        Thread.sleep(3000);
    }

    @And("^User click save button on edit page$")
    public void userClickSaveButtonOnEditPage() {
        UserPage userPage =new UserPage(webDriver);
        userPage.setEditSaveButton();
    }

    @Then("^User has a new name$")
    public void userHasANewName() {
        UserPage userPage = new UserPage(webDriver);
        Assert.assertTrue(userPage.setNewName());
    }

    @Then("^System show any message$")
    public void systemShowAnyMessage() {
        UserPage userPage = new UserPage(webDriver);
        Assert.assertTrue(userPage.setNewName());
    }

    @And("^User click cancel button on edit page$")
    public void userClickCancelButtonOnEditPage() {
        UserPage userPage = new UserPage(webDriver);
        userPage.setEditCancelButton();
    }

    @Then("^System show no change$")
    public void systemShowNoChange() {
        UserPage userPage = new UserPage(webDriver);
        Assert.assertTrue(userPage.setNewName());
    }
}
