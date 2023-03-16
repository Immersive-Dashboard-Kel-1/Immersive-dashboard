package step_definitions;

import cucumber.api.java.en.Then;
import org.example.pageObject.UserPage;
import org.openqa.selenium.WebDriver;

public class DeleteUserSteps {
    private WebDriver webDriver;
    public DeleteUserSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @Then("^User click any delete button$")
    public void userClickAnyDeleteButton() {
        UserPage userPage = new UserPage(webDriver);
        userPage.setDelete();
    }
}
