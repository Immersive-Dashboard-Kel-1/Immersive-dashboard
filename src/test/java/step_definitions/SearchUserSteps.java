package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.UserPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SearchUserSteps {
    private WebDriver webDriver;
    public SearchUserSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @And("^User input search user \"(.*)\"")
    public void userInputSearchUser(String inputName){
        UserPage userPage = new UserPage(webDriver);
        userPage.setSearch(inputName);
    }

    @Then("^system show user related$")
    public void systemShowUserRelated() {
        UserPage userPage = new UserPage(webDriver);
        Assert.assertTrue(userPage.setSearchResult());
    }
}
